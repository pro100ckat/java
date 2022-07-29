package com.company;
import  java.util.Scanner;
import java.util.Random;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i;
        int[] a = new int[20];
        int[] b = new int[20];
        int win, lose, draw, s;
        draw=0;
        lose =0;
        win=0;
        s=0;
        int k=0;

        for (i=0; i<a.length; i++) {
            a[i] = random.nextInt(10);
            b[i] = random.nextInt(10);
        }

        System.out.println("Количество забитых мячей: ");
        for (i=0; i<b.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.println("Количество пропущенных мячей: ");
        for (i=0; i<b.length; i++)
        {
            System.out.print(b[i] + " " );
        }
        System.out.println();
        for (i=0; i<a.length; i++)
        {

            if (a[i]>b[i])
            {
                win+=1;
                System.out.println(i + " :Выигрыш");
            }
            if (a[i]<b[i])
            {
                lose=lose+1;
                System.out.println(i + " :Проигрыш");
            }

            if (a[i]==b[i])
            {
                draw+=1;
                System.out.println(i + " :Ничья");
            }

            if (Math.abs(a[i]-b[i])>=3)
            {
                k=k+1;
            }
            s=win*3+draw*1;
        }
        System.out.println();
        System.out.println("Win = " +win + " Lose = "+lose + " Ничья = " +draw + " Разность мячей >=3: " +k +" Общее число очков = " +s);
    }

}
