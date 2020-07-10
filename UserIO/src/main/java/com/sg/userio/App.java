/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.userio;

/**
 *
 * @author bryantkintner
 */
public class App {
    public static void main(String[] args) {
        
        // UserIOimpl & Impl2 
        
        UserIO io = new UserIOimpl();

        io.readString("Type anything");
        io.print("This is a test print");
        io.readInt("Enter a whole number");
        io.readInt("Enter a whole number between 1 and 10", 1, 10);
        io.readFloat("Please enter a float value");
        io.readFloat("Please enter a float value between 1 and 100", 1, 100);
        io.readDouble("Please enter a double value");
        io.readDouble("Please enter a double value between 1 and 50", 1, 50);
        io.readLong("Please enter a long value");
        io.readLong("Please enter a long value between 1 and 1,000,000", 1, 1000000);
        
        
        
    }
                
    
}
