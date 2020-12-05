package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {14.2, 23.5, 1.7, 7.2, -25.5, 33.3, -76.7, 50, -9, 98.9, 23.7, 39, 90.9, 56, 22};
        double sum = 0;
        int quantity = 0;
        boolean off = false;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                off = true;
            }
            if (off == true && numbers[i] > 0) {
                sum = sum + numbers[i];
                quantity++;
            }
        }

        System.out.println(sum / quantity);
    }
}