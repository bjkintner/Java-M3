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
public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    
    //Area is P(r^2)
    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    //Perimeter is 2Pr
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


}
