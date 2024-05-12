package cz.uhk.ppro.service;

import cz.uhk.ppro.model.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriver(int index);

    Driver deleteDriver(int id);

    boolean addDriver(Driver driver);

    boolean updateDriver(Driver driver);
}
