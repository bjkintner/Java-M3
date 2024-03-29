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
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
