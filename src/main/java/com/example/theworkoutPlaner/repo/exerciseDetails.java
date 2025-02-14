package com.example.theworkoutPlaner.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
@Entity
@Table(name = "Exercises")
public class exerciseDetails {

    @Id
    private Integer id; //change to private later
    String name;
    int sets; //int instead of String to consume less space;
    int reps;

     public static ArrayList<exerciseDetails> eList = new ArrayList<exerciseDetails>(); //static to use one list for multiple instances of the class

    private exerciseDetails(){}

    public exerciseDetails(String name, int sets, int reps, Integer id)  {
        this.sets = sets;
        this.reps = reps;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public Integer getId() {
        return id;
    }

}
