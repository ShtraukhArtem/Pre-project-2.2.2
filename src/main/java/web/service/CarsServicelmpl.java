package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarsServicelmpl implements CarsService {

    @Override
    public List<Car> getAllCars() {
        return Arrays.asList(
                new Car("Toyota", "Red", 2020),
                new Car("Honda", "Black", 2019),
                new Car("Ford", "Blue", 2018),
                new Car("Audi", "Gray", 2015),
                new Car("BMW", "Green", 2010)
        );
    }
}
