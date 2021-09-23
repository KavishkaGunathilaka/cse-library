package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int factorial(int n){
        int result =1;
        for (int i = 1; i <=n; i++) {
            result = result*i;
        }
        return result;
    }



    static int sumOfIntegers(int n){
        return n*(n+1)/2;
    }

}
