package com.company;
import java.util.Random;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] a = new int[5][8];
        int i,j,k;
        int s=0;
        k=0;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        for ( i=0;i < a.length;i++) {
            for ( j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(15) + 15  ;
            }
        }
        for ( i=0;i < a.length;i++,System.out.println()) {
            for ( j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("Введите любой курс с 1 по 5");
        k= sc.nextInt();
        k=k-1;
        for (i=0;i<8;i++)
        {
            s= s+ a[k][i];
            }
        System.out.println("На " + (k+1) +" курсе " + s +" студентов");
        }



}

