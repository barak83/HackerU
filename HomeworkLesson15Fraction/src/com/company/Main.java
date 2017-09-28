package com.company;

public class Main {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(4,9);

        Fraction fraction2 = new Fraction(fraction1);

        Fraction fraction3 = new Fraction(6, 9);

        System.out.println(fraction1.compareFractions(fraction3));

    }

}

