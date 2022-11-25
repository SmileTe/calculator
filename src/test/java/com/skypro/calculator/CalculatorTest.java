package com.skypro.calculator;

import com.skypro.calculator.controller.Input;
import com.skypro.calculator.service.Calculation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    Input input;

    @BeforeEach
    public void setUp(){
        num1=5;
        num2=3;
        num3=10;
        num4=0;
        input = new Input(new Calculation());

    }
    @Test
    public void plus(){
       int sum1 =  input.plus(num1,num2);
       int sum2 =  input.plus(num3,num4);
    }
    @Test
    public void minus(){
        int minus1 =  input.minus(num1,num2);
        int minus2 =  input.minus(num3,num4);
    }
    @Test
    public void multiply(){
        int multiply1 =  input.multiply(num1,num2);
        int multiply2 =  input.multiply(num3,num4);
    }
    @Test
    public void divide(){
        int multiply1 =  input.divide(num1,num2);
        int multiply2 =  input.divide(num3,num4);
    }
}
