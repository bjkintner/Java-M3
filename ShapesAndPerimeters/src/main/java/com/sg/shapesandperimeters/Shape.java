/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapesandperimeters;

/**
 *
 * @author bryantkintner
 */
public abstract class Shape {
    
    private String color;
    public double area;
    public double perimeter;
    
    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
    
    

}
