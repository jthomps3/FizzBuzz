import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class FizzBuzz {
    public static void main(String[] args) {
        
        /**
         * Revieve a strating and ending integer from user.
         * In between starting and ending, for every numer
         * that is a multiple of 3 and 5, print FizzBuzz.
         * For every number that is a mutiple of 5, print
         * Fizz.  For every number that is a mutiple of 3,
         * print Buzz.  For every other number, print that
         * number.
         */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Choose a starting integer: ");
         int start = scanner.nextInt();
         System.out.println("Choose an ending integer: ");
         int end = scanner.nextInt();

         scanner.close();

         for (int i = start; i <= end; i++) {
             if (i % 5 == 0 && i % 3 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Fizz");
            else if (i % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
         }
    }
}
