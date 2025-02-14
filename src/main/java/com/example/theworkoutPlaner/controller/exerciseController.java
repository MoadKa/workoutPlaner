package com.example.theworkoutPlaner.controller;

import com.example.theworkoutPlaner.repo.exerciseDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.example.theworkoutPlaner.repo.exerciseDetails.eList;


@RestController
public class exerciseController {

    @PostMapping("/addExercise")
    String insert(@RequestBody exerciseDetails eD){

    eList.add(new exerciseDetails(eD.getName(),eD.getSets(), eD.getReps(), eD.id));

        return "Exercise successfully added.";
    }
    @GetMapping("/api/viewExercise")
    @ResponseBody
    public ArrayList<exerciseDetails> listAllExercises(){
        return eList;
    }
    @GetMapping("/api/viewExercise/{id}")
    @ResponseBody
    public exerciseDetails findExerciseById(@PathVariable int id){
        for(exerciseDetails i : eList){
            if(i.id == id) return i;
        }
        return null;
    }
    @PutMapping("update/{id}")
    public String changeExercise(@PathVariable int id, @RequestBody exerciseDetails newE ){
        eList.remove(findExerciseById(id));
        eList.add(new exerciseDetails(newE.getName(), newE.getSets(), newE.getReps(), newE.id));
        return "The Exercise with the id '" + id + "' was successfully Updated";
    }
    @DeleteMapping("delete/{id}")
    public String deleteExercise(@PathVariable int id){
        eList.remove(findExerciseById(id));
        return "Exercise with the id '" + id + "' was successfully deleted.";
    }


}
