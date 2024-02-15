package model;

public class Person {
    protected String name;
    protected String lastName;

    protected String id;
    protected String phoneNumber;
    protected String email;
    protected int age;

    public Person() {
    }

    public Person(String name, String lastName, String id, String phoneNumber, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
