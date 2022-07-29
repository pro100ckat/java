package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = -99; i <= 99; i++) {
            if ((i > 9) || (i < -9)) {
                System.out.print(i+ ", ");
            }
        }
        System.out.println();
        for (int i = 99; i >= -99; i--) {
            if ((i > 9) || (i < -9)) {
                System.out.print(i+ ", ");
            }
        }
    }
}
