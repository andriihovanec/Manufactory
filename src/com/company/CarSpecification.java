package com.company;

class CarSpecification {

    // Car
    private String model;
    private String color;

    // Engine
    private int engineCapacity;
    private int enginePower;
    private Enum engineType;

    // Wheel
    private int size;
    private String season;

    // Interior
    private String leather;
    private String fabric;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Enum getEngineType() {
        return engineType;
    }

    public void setEngineType(Enum engineType) {
        this.engineType = engineType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeather() {
        return leather;
    }

    public void setLeather(String leather) {
        this.leather = leather;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
