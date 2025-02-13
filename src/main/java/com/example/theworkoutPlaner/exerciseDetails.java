package com.example.theworkoutPlaner;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

public class exerciseDetails {
    int id;
    String name;
    int sets; //int instead of String to consume less space;
    int reps;

     static ArrayList<exerciseDetails> eList = new ArrayList<exerciseDetails>(); //static to use one list for multiple instances of the class

    public exerciseDetails(String name, int sets, int reps, int id)  {
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
}
