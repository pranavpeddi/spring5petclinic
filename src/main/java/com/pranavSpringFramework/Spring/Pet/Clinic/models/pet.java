package com.pranavSpringFramework.Spring.Pet.Clinic.models;


import java.time.LocalDate;

public class pet extends BaseEntity {
    private PetType petType;
    private owner owner;
    private LocalDate birthdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public owner getOwner() {
        return owner;
    }

    public void setOwner(owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
