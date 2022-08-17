/*
1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter Value one");
        int value_1 = readme.nextInt();
        System.out.println("Enter Value two");
        int value_2 = readme.nextInt();

        System.out.println("is " + value_1 + " equal to " + value_2 + "? : " + (value_1==value_2));
        System.out.println("is " + value_1 + " less than" + value_2 + "? : " + (value_1<value_2));
        System.out.println("is " + value_1 + " less than or equal to " + value_2 + "? : " + (value_1<=value_2));
        System.out.println("is " + value_1 + " greater than " + value_2 + "? : " + (value_1>value_2));
        System.out.println("is " + value_1 + " greater or equal than " + value_2 + "? : " + (value_1>=value_2));
    }
}
