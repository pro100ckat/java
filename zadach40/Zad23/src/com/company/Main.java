package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mas[];
        mas = new int[10];
        int n;
        n = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(10);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]);
        }
        System.out.print(" Введите сдвиг = ");
        int k = in.nextInt();

        for(int j=0; j<k; j++)
        {
            int x=mas[n-1];
            for (int i = n; i > 0; i--)
                mas[i]=mas[i-1];
            mas[0]=x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]);
        }

    }
}




