package br.com.silviofrancoms.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String number1, @PathVariable("numberTwo") String number2) {
        return Double.parseDouble(number1) + Double.parseDouble(number2);
    }

}
