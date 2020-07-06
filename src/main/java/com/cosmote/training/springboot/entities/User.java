package com.cosmote.training.springboot.entities;

import java.util.List;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Vehicle> vehicles;


    public User(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
