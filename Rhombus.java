package com.company;

public class Rhombus extends Shape {
    public int width, height;

    public Rhombus(int width, int height){
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){
        return (width * height) / 2;
    }

}
