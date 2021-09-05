/*
UCF COP 3330 Fall 2021 Assignment 2 Solution
Copyright 2021 Cole Castille
 */

// Prompt user: "What is the first number? "
// Store firstNumber as STRING
// Prompt user: "What is the second number? "
// Store secondNumber as STRING
// Use Integer.parseInt() to convert string to int
// Store variables sum, subtract, multiply, divide as ints
// Output sum, subtract, multiply and divide with first and second number in print statement

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        // prompting and gathering inputs
        System.out.print("What is the first number? ");
        Scanner s1 = new Scanner(System.in);
        String firstNumber = s1.nextLine();

        System.out.print("What is the second number? ");
        Scanner s2 = new Scanner(System.in);
        String secondNumber = s2.nextLine();

        // changing user's input from string to int
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        // arithmetic variables
        int sum = number1 + number2;
        int difference = number1 - number2;
        int multiply = number1 * number2;
        int division =  number1 / number2;

        // output
        System.out.print(number1 + " + " + number2 + " = " + sum + "\n" + number1 + " - " + number2 + " = " + difference + "\n" + number1 + " * " + number2 + " = " + multiply + "\n" + number1 + " / " + number2 + " = " + division);
    }
}
