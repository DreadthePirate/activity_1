package com.unicorn;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int execute(String operation, int a, int b) {

        switch(operation) {
            case "add":
                return calculator.add(a, b);

            case "subtract":
                return calculator.subtract(a, b);

            case "multiply":
                return calculator.multiply(a, b);

            case "divide":
                return calculator.divide(a , b);

            default:
                throw new IllegalArgumentException();
        }
    }

    public int execute(String operation, int a, int...b) {
        //int... is a vararg which is a different way of doing []

        if("add".equals(operation)) {
            return calculator.add(a, b);
        }
        throw new IllegalArgumentException();
    }
    //smoke test
    public static void main(String[] args) {

        //integration tes
        CalculatorService cs = new CalculatorService(new Calculator());
        /*
        you are building a dependency injection
        new is instantiation since it's called cs that is direct the second
        new is anonymous instantiation
        */
        System.out.println(cs.execute("add", 1,13));
        System.out.println(cs.execute("add", 1,13,6));
        System.out.println(cs.execute("divide", 1,13));
        System.out.println(cs.execute("subtract", 10, 2));

    }
}