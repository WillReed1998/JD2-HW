package org.example;

import org.example.entities.Resident;
import org.example.entities.Building;
import org.example.entities.Apartment;
import org.example.entities.ResidentsCar;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import java.util.List;

public class Query {
    public static List<ResidentInfo> getResidentsWithCriteria(EntityManager entityManager) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ResidentInfo> criteriaQuery = criteriaBuilder.createQuery(ResidentInfo.class);
        Root<Resident> residentRoot = criteriaQuery.from(Resident.class);
        Join<Resident, ResidentsCar> residentsCarJoin = residentRoot.join("residentsCar");
        Join<Resident, Apartment> apartmentJoin = residentRoot.join("apartment");
        Join<Apartment, Building> buildingJoin = apartmentJoin.join("building");

        Predicate hasEntryPermit = criteriaBuilder.equal(residentsCarJoin.get("entryPermit"), 0);
        Predicate livesInComplex = criteriaBuilder.equal(residentRoot.get("livesHere"), 1);
        Predicate ownsLessThanTwoApartments = criteriaBuilder.lessThan(residentRoot.get("apartmentCount"), 2);

        criteriaQuery.select(criteriaBuilder.construct(
                ResidentInfo.class,
                residentRoot.get("id"),
                residentRoot.get("firstName"),
                residentRoot.get("lastName"),
                residentRoot.get("phoneNumber"),
                residentRoot.get("email"),
                buildingJoin.get("address"),
                apartmentJoin.get("apartmentNumber"),
                apartmentJoin.get("area")
        )).where(hasEntryPermit, livesInComplex, ownsLessThanTwoApartments);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}

