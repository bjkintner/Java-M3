/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.randomnumbergenerator;

import java.util.Random;

/**
 *
 * @author bryantkintner
 */
public class randomNumberGenerator {
    public static void main(String[] args) {
        Random rng = new Random();
        int compChoice = rng.nextInt(3)+1;
        System.out.println(compChoice);
        
    }
}
