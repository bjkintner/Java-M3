/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.numberguesser;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author bryantkintner
 */
public class test {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        
        int secret = randomNum;
                
        // First question prompt
        
        System.out.println("Guess the secret number, 1-10.");
        int guess1 = inputReader.nextInt();
        
        // Guess 1 was correct
        
        if (guess1 == secret) {
            System.out.println("Correct! The secret number was " + secret);
        } 
        
        // Guess 1 was too low
        
        if (guess1 < secret) {
            System.out.println("Too low! What is your second guess?");
            int guess2 = inputReader.nextInt();
            
            // Guess 2 is correct
            
            if (guess2 == secret) {
                System.out.println("Correct! The secret number was " + secret);
            }
            // Guess 2 is too low
            
            if (guess2 < secret) {
                System.out.println("Too low! What is your third guess?");
                int guess3 = inputReader.nextInt();
                
                // Guess 3 is correct
                
                if (guess3 == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                }                
                // Guess 3 is too low
                
                if (guess3 < secret) {
                    System.out.println("Too low! The secret number was " + secret);
                }
                // Guess 3 is too high
                
                if (guess3 > secret) {
                    System.out.println("Too high! The secret number was " + secret);
                }
            }
            // Guess 2 is too high
            if (guess2 > secret) {
                System.out.println("Too low! What is your third guess?");
                int guess3 = inputReader.nextInt();
                
                // Guess 3 is correct
                
                if (guess3 == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                }                
                // Guess 3 is too low
                
                if (guess3 < secret) {
                    System.out.println("Too low! The secret number was " + secret);
                }
                // Guess 3 is too high
                
                if (guess3 > secret) {
                    System.out.println("Too high! The secret number was " + secret);
                }
            }
            }
        
        // Guess 1 was too high
        
        if (guess1 > secret) {
            System.out.println("Too high! What is your second guess?");
            int guess2 = inputReader.nextInt();
            
            // Guess 2 is correct
            
            if (guess2 == secret) {
                System.out.println("Correct! The secret number was " + secret);
            }
            // Guess 2 is too low
            
            if (guess2 < secret) {
                System.out.println("Too low! What is your third guess?");
                int guess3 = inputReader.nextInt();
                
                // Guess 3 is correct
                
                if (guess3 == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                }                
                // Guess 3 is too low
                
                if (guess3 < secret) {
                    System.out.println("Too low! The secret number was " + secret);
                }
                // Guess 3 is too high
                
                if (guess3 > secret) {
                    System.out.println("Too high! The secret number was " + secret);
                }
            }
            // Guess 2 is too high
            if (guess2 > secret) {
                System.out.println("Too low! What is your third guess?");
                int guess3 = inputReader.nextInt();
                
                // Guess 3 is correct
                
                if (guess3 == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                }                
                // Guess 3 is too low
                
                if (guess3 < secret) {
                    System.out.println("Too low! The secret number was " + secret);
                }
                // Guess 3 is too high
                
                if (guess3 > secret) {
                    System.out.println("Too high! The secret number was " + secret);
                }
            }
        }
         
        
        
    }
}
