package com.macofba.service;

import com.macofba.model.Motor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MotorService implements IMotorService{
    private static final Map<Integer, Motor> motors;
    static {
        motors = new HashMap<>();
        motors.put(1, new Motor(1, "honda", 13000000, "trang", "Viet Nam"));
        motors.put(2, new Motor(2, "yamaha", 14000000, "den", "Nhat Ban"));
        motors.put(3, new Motor(3, "toyota", 13000000, "trang", "Viet Nam"));
        motors.put(4, new Motor(4, "suzuki", 17000000, "xanh", "Viet Nam"));
        motors.put(5, new Motor(5, "vinfat", 20000000, "trang", "Viet Nam"));
    }

    @Override
    public List<Motor> findAll() {
        return new ArrayList<>(motors.values());
    }

    @Override
    public void save(Motor motor) {
        motors.put(motor.getId(), motor);
    }

    @Override
    public Motor findByName(String name) {
        return motors.get(name);
    }

    @Override
    public Motor findById(int id) {
        return motors.get(id);
    }

    @Override
    public void update(int id, Motor motor) {
        motors.put(id, motor);
    }

    @Override
    public void remove(int id) {
        motors.remove(id);
    }
}
