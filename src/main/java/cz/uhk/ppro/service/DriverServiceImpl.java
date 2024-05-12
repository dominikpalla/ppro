package cz.uhk.ppro.service;

import cz.uhk.ppro.model.Driver;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService{

    private List<Driver> drivers = new ArrayList<>();

    @Override
    public List<Driver> getAllDrivers() {
        return drivers;
    }

    @Override
    public Driver getDriver(int index) {
        return drivers.get(index);
    }

    @Override
    public boolean addDriver(Driver driver) {
        int index = getDriverIndex(driver.getPersonalId());
        if(index == -1){
            drivers.add(driver);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDriver(Driver driver) {
        int index = getDriverIndex(driver.getPersonalId());
        if(index != -1){
            drivers.remove(index);
            drivers.add(driver);
            return true;
        }
        return false;
    }

    @Override
    public Driver deleteDriver(int index) {
        Driver driver = drivers.get(index);
        drivers.remove(index);
        return driver;
    }

    private int getDriverIndex(int personalId) {
        for(int i = 0; i < drivers.size(); i++){
            if(drivers.get(i).getPersonalId() == personalId){
                return i;
            }
        }
        return -1;
    }
}
