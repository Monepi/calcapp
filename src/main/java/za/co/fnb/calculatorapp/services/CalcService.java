package za.co.fnb.calculatorapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.fnb.calculatorapp.domain.CalcOperations;

@Service
public class CalcService {

    private CalcOperations calcOperations;

    @Autowired
    public CalcService(CalcOperations calcOperations) {
        this.calcOperations = calcOperations;
    }

    public int add(int num1, int num2) {
        return calcOperations.add(num1, num2);
    }

    public int multiply(int num1, int num2) {
        return calcOperations.multiply(num1, num2);
    }

    public int subStract(int num1, int num2) {
        return calcOperations.substract(num1, num2);
    }

    public int divide(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Can not divide by Zero");
        }
        return calcOperations.divide(num1, num2);
    }

}
