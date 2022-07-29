package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {
            int n;
            String nn;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            n = in.nextInt();
            nn = String.valueOf(n);
            StringBuffer buffer = new StringBuffer(nn);
            buffer.reverse();
            nn = String.valueOf(buffer);
            n = Integer.valueOf(nn);
            System.out.println(n);
        }
    }
}

