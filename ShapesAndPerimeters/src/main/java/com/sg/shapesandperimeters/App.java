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
public class App {
    public static void main(String[] args) {
        
        Circle cir = new Circle(2, "Red");
        Triangle tri = new Triangle (2, 2, 3, "Purple");
        Rectangle rec = new Rectangle (3, 6, "Blue");
        Square sqr = new Square (6, "Yellow");
        
        
        Shape[] all_shapes = new Shape[4];
            all_shapes[0] = cir;
            all_shapes[1] = tri;
            all_shapes[2] = rec;
            all_shapes[3] = sqr;
            
        for (Shape shp: all_shapes){
            System.out.println();
            System.out.println("Color: " + shp.getColor());
            System.out.println("Area: " + shp.getArea());
            System.out.println("Perimeter: " + shp.getPerimeter());
        }
    }
}
