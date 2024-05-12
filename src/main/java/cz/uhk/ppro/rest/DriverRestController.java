package cz.uhk.ppro.rest;

import cz.uhk.ppro.model.Driver;
import cz.uhk.ppro.service.DriverService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DriverRestController {

    private DriverService driverService;

    @Autowired
    public DriverRestController(DriverService driverService){
        this.driverService = driverService;
    }
    
    @GetMapping("/driver/{id}")
    public Driver driverDetail(@PathVariable Long id){
        return driverService.getDriver(id);
    }

    @PostMapping("/driver")
    public boolean driverCreate(@Valid @RequestBody Driver driver){
        driverService.addDriver(driver);
        return true;
    }

    @PutMapping("/driver")
    public boolean driverUpdate(@Valid @RequestBody Driver driver){
        driverService.updateDriver(driver);
        return true;
    }

    @DeleteMapping("/driver/{id}")
    public Driver driverDelete(@PathVariable Long id){
        return driverService.deleteDriver(id);
    }
}
