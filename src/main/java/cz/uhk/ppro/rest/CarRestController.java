package cz.uhk.ppro.rest;

import cz.uhk.ppro.model.Car;
import cz.uhk.ppro.model.Driver;
import cz.uhk.ppro.service.CarService;
import cz.uhk.ppro.service.DriverService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarRestController {

    private CarService carService;

    @Autowired
    public CarRestController(CarService carService){
        this.carService = carService;
    }
    
    @GetMapping("/car/{id}")
    public Car carDetail(@PathVariable Long id){
        return carService.getCar(id);
    }

    @PostMapping("/car")
    public boolean carCreate(@Valid @RequestBody Car car){
        carService.addCar(car);
        return true;
    }

    @PutMapping("/car")
    public boolean carUpdate(@Valid @RequestBody Car car){
        carService.updateCar(car);
        return true;
    }

    @DeleteMapping("/car/{id}")
    public Car carDelete(@PathVariable Long id){
        return carService.deleteCar(id);
    }
}
