package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsServicelmpl;
import java.util.List;

@Controller
public class CarsController {

    private final CarsServicelmpl carsServicelmpl;

    public CarsController(CarsServicelmpl carsServicelmpl) {
        this.carsServicelmpl = carsServicelmpl;
    }

    @GetMapping("/cars")
    public String showCarsPage(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("Tittle", "Cars");
        List<Car> cars = carsServicelmpl.getAllCars();
        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", cars.subList(0, Math.min(count, cars.size())));
        }
        return "cars";
    }
}
