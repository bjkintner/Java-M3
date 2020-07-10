/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.calculatortemplate;

import java.util.Scanner;

/**
 *
 * @author bryantkintner
 */
public class CalculatorTemplate {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int answer = 0;
        
        //User chooses what kind of math to perform
        System.out.println("What operation would you like to perform? 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division, 5-Exit");
        int operChoice = inputReader.nextInt();
        
        if (operChoice == 1){
            int firstNumber = chooseFirstNumber(inputReader);
            int secondNumber = chooseSecondNumber(inputReader);
            answer = addNums(firstNumber, secondNumber, answer);
            System.out.println("The answer is " + answer);
        } else if (operChoice == 2){
            int firstNumber = chooseFirstNumber(inputReader);
            int secondNumber = chooseSecondNumber(inputReader);
            answer = subtractNums(firstNumber, secondNumber, answer);
            System.out.println("The answer is " + answer);
        } else if (operChoice == 3){
            int firstNumber = chooseFirstNumber(inputReader);
            int secondNumber = chooseSecondNumber(inputReader);
            answer = multiplyNums(firstNumber, secondNumber, answer);
            System.out.println("The answer is " + answer);
        } else if (operChoice == 4){
            int firstNumber = chooseFirstNumber(inputReader);
            int secondNumber = chooseSecondNumber(inputReader);
            answer = divideNums(firstNumber, secondNumber, answer);
            System.out.println("The answer is " + answer);
        } else {
            System.out.println("Goodbye");
        }
        
    }

    public static int chooseSecondNumber(Scanner inputReader) {
        //User chooses second number/operand
        System.out.println("Choose your second number");
        int secondNumber = inputReader.nextInt();
        return secondNumber;
    }

    public static int chooseFirstNumber(Scanner inputReader) {
        //User chooses first number/operand
        System.out.println("Choose your first number");
        int firstNumber = inputReader.nextInt();
        return firstNumber;
    }
    
    
        // Perform addition
    public static int addNums(int firstNumber, int secondNumber, int result) {
        int answer = firstNumber + secondNumber;
        return answer;
    }
        // Perform subtraction
    public static int subtractNums(int firstNumber, int secondNumber, int result) {
        int answer = firstNumber - secondNumber;
        return answer;
    }
        // Perform multiplication
    public static int multiplyNums(int firstNumber, int secondNumber, int result) {
        int answer = firstNumber * secondNumber;
        return answer;
    }
        // Perform division
    public static int divideNums(int firstNumber, int secondNumber, int result) {
        int answer = firstNumber / secondNumber;
        return answer;
    }

}
