package com.skypro.calculator.controller;
import com.skypro.calculator.service.Calculation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Input {
    private final Calculation calculation;

    public Input(Calculation culculation) {
        this.calculation = culculation;
    }

    @GetMapping("/")
    public String welcome(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public int plus(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return this.calculation.plus(num1,num2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return this.calculation.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return this.calculation.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return this.calculation.divide(num1,num2);
    }

}
