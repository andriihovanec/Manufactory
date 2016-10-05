package com.company;

public class Engine {

    private Enum engineType;
    private int enginePower;
    private int engineCapacity;

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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
