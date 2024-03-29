package com.ifi.trainer_api.controller;

import com.ifi.trainer_api.bo.Trainer;
import com.ifi.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    Iterable<Trainer> getAllTrainers(){
       return trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name){
        return trainerService.getTrainer(name);
    }

    @PostMapping("/")
    Trainer setTrainerName(@RequestBody Trainer trainer){
        return trainerService.postTrainer(trainer);
    }

    @PutMapping("/{name}")
    Trainer putTrainer(@RequestBody Trainer trainer){
        return trainerService.putTrainer(trainer);
    }

    @DeleteMapping("/{name}")
    void deleteTrainer(@RequestBody Trainer trainer){
        trainerService.deleteTrainer(trainer);
    }

}