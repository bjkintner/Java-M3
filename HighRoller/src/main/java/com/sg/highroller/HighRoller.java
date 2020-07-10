/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.highroller;

import java.util.Random;

/**
 *
 * @author bryantkintner
 */
public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(20) + 1;

        System.out.println("Time to Roll the dice!");
        System.out.println("You rolled a " + rollResult + "!");

        if (rollResult == 1) {
            System.out.println("Critical miss! You fall on your face!");
        }
        if (rollResult == 20) {
            System.out.println("Critical hit! You smote the Balrog cast his heap down the mountain!");
                    }
    }
}