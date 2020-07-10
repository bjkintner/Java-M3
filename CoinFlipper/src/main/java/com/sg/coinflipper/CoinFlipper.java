/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.coinflipper;

import java.util.Random;

/**
 *
 * @author bryantkintner
 */
public class CoinFlipper {
    public static void main(String[] args){
        Random coinFlip = new Random();
        
        Boolean coinFlipResult = coinFlip.nextBoolean();
        
        System.out.println("Ready... Set... Flip!");
        
        if (coinFlipResult == true){
            System.out.println("You got HEADS!");
        }
        
        if (coinFlipResult == false){
            System.out.println("You got TAILS!");
        }
        
    }
}
