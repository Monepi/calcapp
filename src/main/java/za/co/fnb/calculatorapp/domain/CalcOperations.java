package za.co.fnb.calculatorapp.domain;

import org.springframework.stereotype.Component;

@Component
public class CalcOperations {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int divide(int num1, int num2) {
        return num1 - num2;
    }

}
