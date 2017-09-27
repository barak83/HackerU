package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] x = new Shape[4];
        x[0] = new Circle(5, 5, 10);
        x[1] = new Square(4);
        x[2] = new Triangle(8, 6);
        x[3] = new Rhombus(7, 8);

        Circle circle1 = new Circle();

        System.out.println(circle1.area());



        areaSum(x);

    }

    public static double areaSum(Shape[] x){
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i].area();
        }
        return sum;
    }


}
