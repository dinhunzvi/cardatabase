package com.dinbytech.cardatabase.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Owner {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long ownerId;

    @Column( name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name ="car_owner",
            joinColumns = { @JoinColumn(name = "ownerId")},
            inverseJoinColumns = { @JoinColumn( name = "id")}
    )
    private Set<Car> cars = new HashSet<Car>();


    public Owner() {
    }

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
