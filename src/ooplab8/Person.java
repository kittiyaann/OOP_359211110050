package ooplab8;

public class Person {
    private String PersonID;
    private String name;
    private String address;
    private String gender;
    //constructor


    public Person(String personID, String name, String address, String gender) {
        PersonID = personID;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    //getter and setter methods

    public String getPersonID() {
        return PersonID;
    }

    public void setPersonID(String personID) {
        PersonID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class