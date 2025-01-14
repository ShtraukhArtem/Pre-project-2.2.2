package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServicelmpl implements CarsService {

    private final List<Car> cars;

    public CarsServicelmpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Red", 2020));
        cars.add(new Car("Honda", "Black", 2019));
        cars.add(new Car("Ford", "Blue", 2018));
        cars.add(new Car("Audi", "Gray", 2015));
        cars.add(new Car("BMW", "Green", 2010));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}
