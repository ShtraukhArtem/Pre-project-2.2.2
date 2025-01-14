package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;
import java.util.List;

@Controller
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String showCarsPage(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("Tittle", "Cars");
        List<Car> carList = carsService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
