package org.example.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBuildings")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "apartmentCount")
    private Integer apartmentCount;

    @Column(name = "floorCount")
    private Integer floorCount;

    @OneToMany(mappedBy = "building")
    private List<Apartment> apartments;

    public Building() {
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Integer getApartmentCount() { return apartmentCount; }

    public Integer getFloorCount() { return floorCount; }

    public List<Apartment> getApartment() { return apartments; }
}
