package model;

import java.time.LocalDate;

public class Customer {
    private int Id;
    private String FirstName;
    private String LastName;
    private LocalDate dateOfBirth;
    private String NationalityId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }
}
