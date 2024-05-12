package cz.uhk.ppro.controller;

import cz.uhk.ppro.model.Car;
import cz.uhk.ppro.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    private CarService carService;

    @Autowired
    public HelloController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/")
    public String listCars(Model model){
        model.addAttribute("cars", carService.getAllCars());
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String carDetails(@PathVariable int id, Model model){
        model.addAttribute("car", carService.getCar(id));
        model.addAttribute("id", id);
        return "detail";
    }

    @GetMapping("/edit/{id}")
    public String editCar(@PathVariable int id, Model model){
        model.addAttribute("car", carService.getCar(id));
        model.addAttribute("edit", true);
        return "edit";
    }

    @GetMapping("/create")
    public String editCar(Model model){
        model.addAttribute("car", new Car());
        model.addAttribute("edit", false);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable int id){
        carService.deleteCar(id);
        return "redirect:/";
    }

    @PostMapping("/save")
    public String createCar(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateCar(@ModelAttribute Car car){
        carService.updateCar(car);
        return "redirect:/";
    }

}
