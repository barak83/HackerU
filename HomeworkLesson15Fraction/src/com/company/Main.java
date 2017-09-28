package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(reduceFraction(3, 6));

    }


    public static int reduceFraction(int nominator, int denominator){
        if (denominator <= 0){
            return -1;
        }
        if (denominator == 1){
            return nominator;
        }
        if (nominator <= 0){
            return 0;
        }
        if (nominator == 1){
            return nominator;
        }
        for (int i = 2; i < nominator; i++) {
            if(nominator % i == 0){
                return nominator;
            }
        }
        for (int i = 2; i < denominator; i++) {
            if (denominator % i == 0){
                return denominator;
            }
        }
        return reduceFraction(nominator, denominator);
    }


}
