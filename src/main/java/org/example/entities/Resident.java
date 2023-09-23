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
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "email")
    private String Email;

    @Column(name = "phone_number")
    private Integer PhoneNumber;

    @Column(name = "apartment_count")
    private Integer ApartmentCount;

    @Column(name = "lives_here")
    private Integer LivesHere;

    @OneToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public Integer getApartmentCount() {
        return ApartmentCount;
    }

    public Integer getLivesHere() {
        return LivesHere;
    }

    public Apartment getApartment() {
        return apartment;
    }
}
