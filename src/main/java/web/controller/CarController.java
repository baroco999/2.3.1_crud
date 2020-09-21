package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (required = false) Optional<String> locale, ModelMap model) {
        String tablehead = (locale.orElse("en")).equals("ru") ? "Машины" : "Cars";
        model.addAttribute("tablehead", tablehead);
        model.addAttribute("listOfCars", new CarService().getListOfCars());
        return "cars";
    }

}
