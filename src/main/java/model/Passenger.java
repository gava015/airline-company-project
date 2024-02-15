package model;

public class Passenger extends Person {
    private String address;
    private String emergencyContact;
    private String birthDate;

    public Passenger(String name, String lastName, String id, String phoneNumber, String email, int age, String address
            ,String emergencyContact, String birthDate) {
        super(name, lastName, id, phoneNumber, email, age);
        this.address = address;
        this.emergencyContact = emergencyContact;
        this.birthDate = birthDate;
    }
}
