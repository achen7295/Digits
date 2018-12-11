package com.company;

public class Main {

    public static void main(String[] args)
    {
	    Digits digit1 = new Digits(7);
	    System.out.println(digit1.isStrictlyIncreasing());

        Digits digit2 = new Digits(63510);
        System.out.println(digit2.isStrictlyIncreasing());

        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());

        System.out.println(digit2.getDigitList());
    }
}
