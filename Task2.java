/*
Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter boolean value one");
        boolean value_one = readme.nextBoolean();

        System.out.println("Enter boolean value two");
        boolean value_two = readme.nextBoolean();

        System.out.println(" Is " + value_one + " and " + value_two + " equal ?: " + (value_one==value_two));
    }
}