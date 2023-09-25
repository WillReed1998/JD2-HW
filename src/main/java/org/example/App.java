package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory .createEntityManager();

        List<ResidentInfo> residents = Query.getResidentsWithCriteria(entityManager);

        System.out.println(residents);

        entityManager.close();
        entityManagerFactory.close();
    }
}
