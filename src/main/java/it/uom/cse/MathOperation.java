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



    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    static int sumOfIntegers(int n){
        return n*(n+1)/2;
    }

    public static int sumOfPrimes(int n){
        int sum = 0;
        boolean isPrime = true;
        for (int i=2; i<n; i++){
            int j=2;
            while (j<=i/j){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime){
                sum += i;
            }
        }
        return sum;
    }

}
