package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int first;
        first=num.nextInt();
        if (first>=0 && first<=12)
            System.out.println("Ребенок");
        else if (first>=13 && first<=19)
            System.out.println("Подросток");
        else if (first>=20 && first<=25)
            System.out.println("Молодой");
        else if (first>=26 && first<=55)
            System.out.println("Взрослый");
        else
            System.out.println("Пожилой");

    }
}
