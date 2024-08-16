package com;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int NUM = 100;

    public static void main(String[] args) {
        System.out.print(printFizzBuzz());
    }

    public static String printFizzBuzz() {
        StringBuilder myOutput = new StringBuilder();

        for (int i = 1; i <= NUM; i++) {
            String result = "";
            
            if (i % 3 == 0) result += FIZZ;
            if (i % 5 == 0) result += BUZZ;
            
            if (result.isEmpty()) result = Integer.toString(i);
            
            myOutput.append(result);
            
            if (i < NUM) {
                myOutput.append('\n');
            }
        }

        return myOutput.toString();
    }
}
