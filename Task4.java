/*
Ask user to input a whole number and output false, if it is even number and true if it is odd number
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int number = readme.nextInt();

        System.out.println("The entered number " + number + " is " + (number%2!=0));
    }
}
