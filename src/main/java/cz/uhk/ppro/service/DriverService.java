package cz.uhk.ppro.service;

import cz.uhk.ppro.model.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriver(Long id);

    Driver deleteDriver(Long id);

    boolean addDriver(Driver driver);

    boolean updateDriver(Driver driver);
}
