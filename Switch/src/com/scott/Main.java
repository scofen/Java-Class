package com.scott;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//        System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        char charValue = 'K';
        switch(charValue) {
            case 'A':
                System.out.println("Value is " + charValue);
                break;
            case 'B':
                System.out.println("Value is " + charValue);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value is " + charValue);
                break;
            default:
                System.out.println("Could not find value " + charValue);

        }

    }
}
