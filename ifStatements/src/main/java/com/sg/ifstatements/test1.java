package com.sg.ifstatements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryantkintner
 */
public class test1 {
        public static void main(String[] args) {

    int day = 4;
    String dayName = "";

    if (day == 1) {
        dayName = "Monday";
    } else if (day == 2) {
        dayName = "Tuesday";
    } else if (day == 3) {
        dayName = "Wednesday";
    } else if (day == 4) {
        dayName = "Thursday";
    } else if (day == 5) {
        dayName = "Friday";
    } else if (day == 6) {
        dayName = "Saturday";
    } else if (day == 7) {
        dayName = "Sunday";
    } else {
        dayName = "an invalid day";
}
    
System.out.println(dayName); 

}
}