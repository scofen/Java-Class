package com.scott;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string";
	System.out.println(myString);
	myString = myString + ", and this could be more string.";
	System.out.println(myString);

	String numberString = "250.55";
	System.out.println(numberString);

	String lastString = "10";
	int myInt = 50;
	lastString = lastString + myInt;
	System.out.println(lastString);

	double doubleNumber = "100";
	lastString = lastString + doubleNumber;
	System.out.println("LastString value: " + lastString);

    }
}
