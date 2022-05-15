package com.example.sdaspringboot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter

@Service
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
        Car car1 = new Car("X1000", "Tesla");
        Car car2 = new Car("X-500", "Skoda");
        Car car3 = new Car("CX-5", "Mazda");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    public List<Car> getCars() {
        return carList;
    }

}
