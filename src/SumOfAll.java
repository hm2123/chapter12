import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Creator: Hamid Majeed
 Date: 01/30/18
 Purpose: To be able to take user input and produce the sum as the output
 unless a character or something other than an integer is used which will
 return ann error.
 */

public class SumOfAll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers you would like to add: ");
        int num1 = 0;
        int num2 = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            } catch (InputMismatchException ex) {

                input.nextLine();
                System.out.println("Invalid input! Try again please." );
                System.out.print("Enter two integers: ");
            }
        }
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        }
    }
