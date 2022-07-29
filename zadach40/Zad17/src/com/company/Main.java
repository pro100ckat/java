package com.company;

public class Main {

    public static void main(String[] args) {
        double currentP = 1250000;
        for (int i = 1; i < 24; i++) {
            int cy = 2017 + i;
            currentP = currentP + currentP * 0.03;
            System.out.println("В году " + cy + " популяция была " + Math.round(currentP));
        }
    }

}
