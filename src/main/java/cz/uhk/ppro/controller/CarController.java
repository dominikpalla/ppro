package cz.uhk.ppro.controller;

import cz.uhk.ppro.model.Car;
import cz.uhk.ppro.service.CarService;
import cz.uhk.ppro.service.DriverService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

    private CarService carService;
    private DriverService driverService;

    @Autowired
    public CarController(CarService carService, DriverService driverService){
        this.carService = carService;
        this.driverService = driverService;
    }

    @GetMapping("/carDetail/{id}")
    public String carDetail(@PathVariable Long id, Model model){
        model.addAttribute("car", carService.getCar(id));
        return "car_detail";
    }

    @GetMapping("/carEdit/{id}")
    public String carEdit(@PathVariable Long id, Model model){
        model.addAttribute("car", carService.getCar(id));
        model.addAttribute("edit", true);
        model.addAttribute("drivers", driverService.getAllDrivers());
        return "car_edit";
    }

    @GetMapping("/carCreate")
    public String carCreate(Model model){
        model.addAttribute("car", new Car());
        model.addAttribute("edit", false);
        model.addAttribute("drivers", driverService.getAllDrivers());
        return "car_edit";
    }

    @GetMapping("/carDelete/{id}")
    public String carDelete(@PathVariable Long id){
        carService.deleteCar(id);
        return "redirect:/";
    }

    @PostMapping("/carSave")
    public String carSave(@Valid Car car, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("edit", false);
            return "car_edit";
        }
        carService.addCar(car);
        return "redirect:/";
    }

    @PostMapping("/carUpdate")
    public String carUpdate(@Valid Car car, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("edit", true);
            return "car_edit";
        }
        carService.updateCar(car);
        return "redirect:/";
    }
}
