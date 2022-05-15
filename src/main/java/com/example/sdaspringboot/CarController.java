package com.example.sdaspringboot;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//1. wstrzyknięcie do pola - jest to najmniej zalecany sposób
//@Autowired
//private CarService carService;

//2. poprzez setter @Autowired

@RestController
@AllArgsConstructor //<- 3.
// wstrzykiwanie przez konstruktor
// TYLKO TO STOSOWAĆ !!!!!!
public class CarController {

    private final CarService carService;


    @GetMapping()
    public List<Car> get() {
        return carService.getCars();
    }

}
