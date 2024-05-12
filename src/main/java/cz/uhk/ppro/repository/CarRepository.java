package cz.uhk.ppro.repository;

import cz.uhk.ppro.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
