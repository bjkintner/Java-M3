/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.calculatorsplit;
import java.util.Scanner;

/**
 *
 * @author bryantkintner
 */
public class App {
    public static void main(String[] args){
    Boolean repeat = true;    
    Calculator calc = new Calculator();
    Scanner sc = new Scanner(System.in);
    
    //Run program at least once
    do{
    //User chooses what kind of math to perform
    System.out.println("What operation would you like to perform? 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division, 5-Exit");
    int opChoice = sc.nextInt();
    
    
    //Chosen math operation runs variables through method
    switch (opChoice) {
            case 1:
                {
                    int x = chooseFirstNumber(sc);
                    int y = chooseSecondNumber(sc);
                    System.out.println("The answer is " + calc.add(x, y));
                    break;
                }
            case 2:
                {
                    int x = chooseFirstNumber(sc);
                    int y = chooseSecondNumber(sc);
                    System.out.println("The answer is " + calc.subtract(x, y));
                    break;
                }
            case 3:
                {
                    int x = chooseFirstNumber(sc);
                    int y = chooseSecondNumber(sc);
                    System.out.println("The answer is " + calc.multiply(x, y));
                    break;
                }
            case 4:
                {
                    int x = chooseFirstNumber(sc);
                    int y = chooseSecondNumber(sc);
                    System.out.println("The answer is " + calc.divide(x, y));
                    break;
                }
            case 5:
            {
                    repeat = false;
                    System.out.println("Thanks for calculating! Goodbye.");
                    break;
            }
    
                    }
    }
    //Will repeat until user chooses to exit    
    while(repeat == true);
    }
    
    //User chooses first variable number
    public static int chooseFirstNumber(Scanner sc) {
        //User chooses second number/operand
        System.out.println("Choose your first number");
        int firstNumber = sc.nextInt();
        return firstNumber;
    }

    //User chooses second variable number
    public static int chooseSecondNumber(Scanner sc) {
        //User chooses first number/operand
        System.out.println("Choose your second number");
        int secondNumber = sc.nextInt();
        return secondNumber;
    }
                

}

