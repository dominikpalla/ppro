package cz.uhk.ppro.controller;

import cz.uhk.ppro.model.Car;
import cz.uhk.ppro.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/carDetail/{id}")
    public String carDetail(@PathVariable int id, Model model){
        model.addAttribute("car", carService.getCar(id));
        model.addAttribute("id", id);
        return "car_detail";
    }

    @GetMapping("/carEdit/{id}")
    public String carEdit(@PathVariable int id, Model model){
        model.addAttribute("car", carService.getCar(id));
        model.addAttribute("edit", true);
        return "car_edit";
    }

    @GetMapping("/carCreate")
    public String carCreate(Model model){
        model.addAttribute("car", new Car());
        model.addAttribute("edit", false);
        return "car_edit";
    }

    @GetMapping("/carDelete/{id}")
    public String carDelete(@PathVariable int id){
        carService.deleteCar(id);
        return "redirect:/";
    }

    @PostMapping("/carSave")
    public String carSave(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    @PostMapping("/carUpdate")
    public String carUpdate(@ModelAttribute Car car){
        carService.updateCar(car);
        return "redirect:/";
    }
}