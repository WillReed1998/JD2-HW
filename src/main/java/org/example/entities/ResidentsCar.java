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
    private String CarModel;

    @Column(name = "plateNumber")
    private String PlateNumber;

    @Column(name = "entryPermit")
    private Integer EntryPermit;

    @OneToOne
    @Column(name = "resident_id")
    private Resident resident;

    public Integer getId() {
        return id;
    }

    public String getCarModel() {
        return CarModel;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public Integer getEntryPermit() {
        return EntryPermit;
    }

    public Resident getResident() {
        return resident;
    }
}
