package com.macofba.service;

import com.macofba.model.Motor;
import org.springframework.ui.Model;

import java.util.List;

public interface IMotorService {
    List<Motor> findAll();
    void save(Motor motor);
    Motor findByName(String name);
    Motor findById(int id);
    void update(int id, Motor motor);
    void remove(int id);
}
