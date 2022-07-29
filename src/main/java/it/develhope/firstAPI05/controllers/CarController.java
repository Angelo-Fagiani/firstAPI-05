package it.develhope.firstAPI05.controllers;

import it.develhope.firstAPI05.DTO.CarDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping()
    public CarDTO getNewCar(){
        return new CarDTO("123","BMW",25000);
        }
    @PostMapping()
    public String carBody(@Validated @RequestBody CarDTO carDTO){
        return carDTO.toString();

    }





}
