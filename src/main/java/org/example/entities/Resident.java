package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "residents")
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idResident")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "apartment_count")
    private Integer apartmentCount;

    @Column(name = "lives_here")
    private Integer livesHere;

    @OneToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getApartmentCount() {
        return apartmentCount;
    }

    public Integer getLivesHere() {
        return livesHere;
    }

    public Apartment getApartment() {
        return apartment;
    }
}
