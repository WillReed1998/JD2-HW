package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "residentscar")
public class ResidentsCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idResidentsCar")
    private Integer id;

    @Column(name = "carModel")
    private String carModel;

    @Column(name = "plateNumber")
    private String plateNumber;

    @Column(name = "entryPermit")
    private Integer entryPermit;

    @OneToOne
    @JoinColumn(name = "resident_id")
    private Resident resident;

    public Integer getId() {
        return id;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public Integer getEntryPermit() {
        return entryPermit;
    }

    public Resident getResident() {
        return resident;
    }
}

