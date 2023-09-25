package org.example;

public class ResidentInfo {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private Integer apartmentNumber;
    private Integer area;

    public ResidentInfo(Integer id, String firstName, String lastName, String phoneNumber, String email, String address, Integer apartmentNumber, Integer area) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
    }

    @Override
    public String toString() {
        return "\nID: " + id +
                "\nFirstname: " + firstName +
                "\nLastname: " + lastName +
                "\nEmail: " + email +
                "\nPhone: " + phoneNumber +
                "\nAddress: " + address +
                "\nApartment number: " + apartmentNumber +
                "\nArea: " + area + "\n";
    }
}