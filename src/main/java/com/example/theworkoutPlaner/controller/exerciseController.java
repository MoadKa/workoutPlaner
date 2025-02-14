package com.example.theworkoutPlaner.controller;
import com.example.theworkoutPlaner.repo.Exercise;
import com.example.theworkoutPlaner.repo.ExerciseRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
public class exerciseController  {
    
    //This will serve as a basic Exercise Database in which the user can build his own workoutPlan

    private final ExerciseRepository exerciseRepository;

    public exerciseController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }
    @GetMapping("/Exercises")
    public Iterable<Exercise> GetAllExercises(){
       return exerciseRepository.findAll();
    }
    @GetMapping("/Exercises/{id}")
    public Optional<Exercise> GetExercise(@PathVariable Integer id){
        return exerciseRepository.findById(id);
    }
    @PostMapping ("/Exercises")
    public Exercise createExercise(@RequestBody Exercise exercise){
        return exerciseRepository.save(exercise);
    }
    @PutMapping("/Exercises")
    public Exercise updateExercise(@RequestBody Exercise exercise){
        exerciseRepository.deleteById(exercise.getId());
        return exerciseRepository.save(exercise);
    }

    @DeleteMapping("/Exercises/{id}")
    public String deleteExerciseById(@PathVariable Integer id){
         exerciseRepository.deleteById(id);
         return "Exercise was removed successfully from the Database.";

    }

}
