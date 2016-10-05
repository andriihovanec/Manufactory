package com.company;

// Прочитати про ENUM, знайти в коді ті місця де потрібно використати ENUM
// engineType змінити тип з int на ENUM

public class Main {

    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer();

        CarSpecification carSpecification = new CarSpecification();

        carSpecification.setModel("Fabia");
        carSpecification.setColor("blue");

        carSpecification.setEngineType(Enum.Diesel);
        carSpecification.setEnginePower(3000);

        carSpecification.setSize(17);
        carSpecification.setSeason("Summer");

        carSpecification.setLeather("Black leather");

        Car car = manufacturer.buildCar(carSpecification);

        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Vin: " + car.getVin());

        System.out.println("Engine type: " + car.getEngine().getEngineType());
        System.out.println("Engine power: " + car.getEngine().getEnginePower());

        System.out.println("Wheel size: " + car.getWheel().getSize());
        System.out.println("Wheel season: " + car.getWheel().getSeason());
        System.out.println("Interior: " + car.getInterior().getLeather());

    }
}
