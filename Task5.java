/*
Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter a boolean value: ");
        boolean value = readme.nextBoolean();

        System.out.println(" The opposite value of your enter value  is \""+!value+"\"");
    }
}
