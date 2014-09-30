/*
 * Program that calculates how many times a digit appears in a number.
 * The digit and the number are entered by the user.
 *
 * Author: Marco Rapaccini
 *
 */

package occurrencesdigitininteger;

import java.util.Scanner;

public class OccurrencesDigitInInteger {
    public static void main(String[] args) {
        int number; 
        int digit;
        int n = 0;              // for the computation we use another variable
        int int_part = 1;       // integer part of a division
        int remainder = 0;      // remainder of a division
        int counter = 0;        // counter of the occurrences
        
        Scanner keyboard = new Scanner(System.in);  // set a new scanner
        
        System.out.print("Enter an integer: ");     // ask the user
        number = keyboard.nextInt();                // read the user's number
        System.out.println("Your number is: " + number);
        
        System.out.print("Enter digit to count for each occurrency: ");
        digit = keyboard.nextInt();                 // read the digit to count
        System.out.println("You want to count the occurrences of the " + digit + " digit");
        
        n = number;             // we use this variabile for the computation
        
        while (int_part != 0){  // until there's an integer part
            int_part = n / 10;  // calculates the integer part
            remainder = n % 10; // and the remainder
                                
            // if the remainder is equal to our digit
            if (remainder == digit){     
                counter++;      // so we have one more occurency
            }
            n = int_part;       // at last the n takes only the integer part
        }
        
        if (counter!=1){
            System.out.println("The value " + digit + " occurres " + counter + " times in the number " + number );
        }
        else {
            System.out.println("The value " + digit + " occurres " + counter + " time in the number " + number );
        }  
    }
}
