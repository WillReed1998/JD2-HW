package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "apartments")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idApartments")
    private Integer id;

    @Column(name = "apartmentNumber")
    private Integer apartmentNumber;

    @Column(name = "floor")
    private Integer floor;
    @Column(name = "roomCount")
    private Integer roomCount;

    @Column(name = "area")
    private Integer area;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    public Integer getId() {
        return id;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public Integer getFloor() {
        return floor;
    }

    public Integer getRoomCount () {
        return roomCount;
    }

    public Integer getArea() {
        return area;
    }

    public Building getBuilding() {
        return building;
    }

}

