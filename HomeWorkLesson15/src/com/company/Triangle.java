package com.company;

public class Triangle extends Shape {
    public int base, height;


    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return (base * height) / 2;
    }


}


