package car.controller;


import car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CarController {
    @Autowired
    Car car;

    @ResponseBody
    @GetMapping("/cars")
    public String getCars() {
        return car.toString();
    }


}
