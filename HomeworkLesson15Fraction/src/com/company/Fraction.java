package com.company;

public class Fraction extends Number {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
        if(denominator == 0)
            denominator = 1;
    }

    public Fraction(Fraction fraction1){
        numerator = fraction1.getNumerator();
        denominator = fraction1.getDenominator();
    }

    public String toString(){
        String str = numerator + "/" + denominator;
        return str;
    }


    public int compareFractions(Fraction fraction1){
        int result1 = numerator * fraction1.getDenominator();
        int result2 = denominator * fraction1.getNumerator();
        if (result1 == result2) {
            return 0;
        }
        if (result1 > result2){
            return 1;
        }
        return -1;
    }




    public void reduceFraction(){
        int min = numerator;
        if (numerator > denominator){
            min = denominator;
        }
        for (int i = min; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float)numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double)numerator / denominator;
    }

}
