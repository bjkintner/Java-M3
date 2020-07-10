/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessmemore;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bryantkintner
 */
public class GuessMeMore {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        Random number = new Random();
        
        int mysteryNumber = number.nextInt(201) - 100;
        boolean guessStatus = false;
        
        System.out.println("Guess the mystery number! It's between -100 and 100.");
        int userGuess;
        
        numberGuesser(inputReader, mysteryNumber, guessStatus);
    }

    public static void numberGuesser(Scanner inputReader, int mysteryNumber, boolean guessStatus) {
        int userGuess;
        do {
            userGuess = inputReader.nextInt();
            
            if (userGuess == mysteryNumber){
                System.out.println("You guessed it! The number was " + mysteryNumber + "!");
                guessStatus = true;
            }
        
            if (userGuess < mysteryNumber){
                System.out.println("Too low. Guess again!");
            }
            
            if (userGuess > mysteryNumber){
                System.out.println("Too high. Guess again!");
            }
        
        } while (guessStatus == false);
    }
}
