package com.macofba.model;

public class Motor {
    private int id;
    private String name;
    private double price;
    private String color;
    private String manufacturer;

    public Motor() {
    }

    public Motor(int id, String name, double price, String color, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
