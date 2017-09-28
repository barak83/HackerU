package com.company;

public class Square extends Shape {
    public int x;

    public Square(int x) {
        this.x = x;
    }


    @Override
    public double area(){
        return x * x;
    }



}
