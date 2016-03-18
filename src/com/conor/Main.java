package com.conor;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Coffee Shop Sales Calculator Program");

        double totalSales = 0;

        // Put all of our drinks in an array...
        String[] coffeeNames = {"coffee", "hot chocolate", "tea", "cappuccino"};

        //Then loop over it and calculate sales for that drink
        for (String drink : coffeeNames) {
            totalSales = totalSales + calculateSales(drink);
        }

        System.out.println("Total sales for the day are $"  + totalSales);

        scanner.close();
    }

    //For a particular drink, get the number of cups sold, the price sold for, and return the total.
    //Note that the user input is handled by another function.
    public static double calculateSales(String drinkName) {

        int cups = userInputInt("How many cups of " + drinkName + " did you sell today?");
        double price = userInputDouble("What does a cup of " + drinkName + " cost?");
        double drinkSales = price * cups;

        //Useful for debugging, and to confirm to the user that they've entered the right info.
        System.out.println(cups + " cups of " + drinkName + " at $" + price + " each is $" + drinkSales + " of sales.");
        return drinkSales;
    }

    // Ask a question, and get an integer from the user.
    // Assumes a scanner has been created and is open.
    private static int userInputInt(String question) {

        int intData;

        while (true) {
            try {
                System.out.println(question);
                intData = Integer.parseInt(scanner.nextLine());
                return intData;
            } catch (NumberFormatException ie) {
                System.out.println("Please enter a valid integer number");
            }
        }

    }

    // Works the same as userInputInt, but for doubles.
    // Assumes a scanner has been created
    private static double userInputDouble(String question) {
        double doubleData;

        while (true) {
            try {
                System.out.println(question);
                doubleData = Double.parseDouble(scanner.nextLine());
                return doubleData;
            } catch (NumberFormatException ie) {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
