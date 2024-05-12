package cz.uhk.ppro.service;

import cz.uhk.ppro.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getCar(int index) {
        return cars.get(index);
    }

    @Override
    public boolean addCar(Car car) {
        int index = getCarIndex(car.getSpz());
        if(index == -1){
            cars.add(car);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCar(Car car) {
        int index = getCarIndex(car.getSpz());
        if(index != -1){
            cars.remove(index);
            cars.add(car);
            return true;
        }
        return false;
    }

    @Override
    public Car deleteCar(int index) {
        Car car = cars.get(index);
        cars.remove(index);
        return car;
    }

    private int getCarIndex(String spz) {
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getSpz().equalsIgnoreCase(spz)){
                return i;
            }
        }
        return -1;
    }
}
