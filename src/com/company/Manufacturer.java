package com.company;

import java.util.UUID;

public class Manufacturer {

    public Car buildCar(CarSpecification carSpecification) {

        Car car = new Car();

        car.setColor(carSpecification.getColor());
        car.setModel(carSpecification.getModel());
        car.setVin(UUID.randomUUID().toString().toUpperCase());

        Engine engine = installEngine(carSpecification);
        car.setEngine(engine);

        Wheel wheel = installWheel(carSpecification);
        car.setWheel(wheel);

        Interior interior = installInterior(carSpecification);
        car.setInterior(interior);

        return car;
    }

    private Engine installEngine(CarSpecification carSpecification) {
        Engine engine = new Engine();
        engine.setEngineType(carSpecification.getEngineType());
        engine.setEnginePower(carSpecification.getEnginePower());

        return engine;
    }

    private Wheel installWheel(CarSpecification carSpecification) {
        Wheel wheel = new Wheel();
        wheel.setSeason(carSpecification.getSeason());
        wheel.setSize(carSpecification.getSize());

        return wheel;
    }

    private Interior installInterior(CarSpecification carSpecification) {
        Interior interior = new Interior();
        interior.setLeather(carSpecification.getLeather());
        interior.setFabric(carSpecification.getFabric());

        return interior;
    }
}
