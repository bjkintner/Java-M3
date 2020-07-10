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
public class Triangle extends Shape {
    private double length_a;
    private double length_b;
    private double length_c;
    
    public Triangle (double length_a, double length_b, 
                        double length_c, String color) {
        super(color);
        this.length_a = length_a;
        this.length_b = length_b;
        this.length_c = length_c;
    }
   
    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area_p = Math.sqrt(halfPerimeter * (halfPerimeter - length_a) * (halfPerimeter - length_b) * (halfPerimeter - length_c));
        return area_p;
    }

    @Override
    public double getPerimeter() {
        return length_a + length_b + length_c;
    }

}
