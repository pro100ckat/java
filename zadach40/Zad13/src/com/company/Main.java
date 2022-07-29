package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Вычисление виокосного года");
        System.out.print("Ввидети год : ");
        int a;
        Scanner ai = new Scanner(System.in);
        a = ai.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
        {System.out.println(a + " високосный год.");}
        else
            System.out.println(a + " не високосный год.");
    }
}

