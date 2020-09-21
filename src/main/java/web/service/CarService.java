package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getListOfCars() {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("Toyota", 10, 256839));
        list.add(new Car("Mercedes", 7, 197324));
        list.add(new Car("Chevrolet", 5, 127054));
        list.add(new Car("Kia", 3, 97302));
        return list;
    }

}
