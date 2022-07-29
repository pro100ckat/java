package com.company;
import java.util.Random;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        int[][] a = new int[7][4];
        int p=1;
        int j,i,k=0;
        int max = 0;
        Random rnd = new Random();
        for ( i=0;i < a.length;i++) {
            for ( j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(10) -5;
            }
        }
        for ( i=0;i < a.length;i++,System.out.println()) {
            for ( j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        for ( i=0;i < a.length;i++) {
            for ( j=0;j < a[i].length;j++) {

            p=Math.abs(p*a[i][j]);
            if (p>max ) {
                max = p;
                k = i;
            }
            }
            p=1;
            }

        System.out.println("max = " +max + " k=" + k);
    }

}

