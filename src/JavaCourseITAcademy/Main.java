package JavaCourseITAcademy;

import JavaCourseITAcademy.car.Car;
import JavaCourseITAcademy.enums.*;
import JavaCourseITAcademy.store.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Car car = store.makeAnOrder(Color.GREEN, Label.LAGUNA, 2019, WheelSize.SMALL, Capacity.MEDIUM);
        car.printCar();
        System.out.println("Your order is ready");
        store.addOption(car, Option.CONDITIONER);
        store.addOption(car, Option.CRUISECONTROL);
        car.printCar();
        System.out.println("Your order is ready");
        store.removeOption(car, Option.CONDITIONER);
        car.printCar();
        System.out.println("Your order is ready");
    }
}
