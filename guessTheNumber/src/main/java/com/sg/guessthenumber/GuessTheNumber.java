/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessthenumber;

import java.util.Scanner;

/**
 *
 * @author bryantkintner
 */
public class GuessTheNumber {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int secret = 1; 
                
        System.out.println("Guess the secret number, 1-100.");
        int guess1 = inputReader.nextInt();
        
        if (guess1 == secret) {
            System.out.println("Correct!");
        } else if (guess1 < secret) {
            System.out.println("Too low! Guess again.");
        } else {
            System.out.println("Too high! guess again.");
        }
    }
}
