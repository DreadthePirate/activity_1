package com.unicorn;
import java.util.Arrays;



public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int... b) {
        //... is building an array same as []
        return a + Arrays.stream(b).sum();
        //provides a stream of values for whatever is inside b
        //it should put in 1 then 2 then 3
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }


}
