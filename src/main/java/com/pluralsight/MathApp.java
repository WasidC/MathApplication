package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1

        double bobSalary = 50000.00;
        double garySalary = 60000.00;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);

        // Question 2

        double carPrice = 74000.00;
        double truckPrice = 85000.00;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is: " + lowestPrice);

        // Question 3

        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the cirle with radius " + radius + " is " + areaOfCircle);

        // Question 4

        double number = 16.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + "is" + squareRoot);

        // Question 5

        double x1 = 5.0, y1 = 10.0;
        double x2 = 85.0, y2 = 50.0;

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("The distance between points (5,10) and (85, 50) is: " + distance);

        // Question 6

        double negativeNumber = -3.8;
        double absoulteValue = Math.abs(negativeNumber);

        System.out.println("The absoulte value is: " + absoulteValue);

        // Question 7

        double randomNumber = Math.random();
        System.out.println("Random Number: " + randomNumber);

        // Question 8

        int minutesinaHour = 60;
        int hoursinaDay = 24;
        int days = 24;

        int totalMinutes = minutesinaHour * hoursinaDay * days;
        System.out.println("there are " + totalMinutes + " minutes in 24 days.");

        int millisecondsinSecond = 1000;
        int secondsinaMinute = 60;
        long totalmillisecomds = totalMinutes * secondsinaMinute * millisecondsinSecond;

        System.out.println("There are " + totalmillisecomds + " milliseconds in 24 days.");
    }
}
