package com.ifi.trainer_api.service;

import com.ifi.trainer_api.bo.Trainer;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer postTrainer(Trainer trainer);
    Trainer createTrainer(Trainer trainer);
    Trainer putTrainer(Trainer trainer);
    void deleteTrainer(Trainer trainer);
}