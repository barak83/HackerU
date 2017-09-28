package com.company;

import com.company.Shape;

public class Circle extends Shape {

    public int x, y, radius;


    public Circle(){
    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public double area(){
        return Math.PI * radius * radius;
    }


}





