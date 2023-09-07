package com.dmaberlin.oop.lesson1;


public class TestExample {

    public static void main(String[] args) {
        int value=10;
        int[]values={value,100,200,300};
        printArrays(values);

    }

    private static void printArrays(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }


}
