package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                if (((i * 100) + j) % 99 == 0 && ((j * 100) + i) % 49 == 0) {
                    System.out.println("a = " + i + "; b = " + j);
                }
            }}}}

