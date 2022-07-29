package com.company;
import java.util.Random;
import java.math.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i,j,k,m;
        int s=0;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность двумерного массива ");
        k=sc.nextInt();
        m = sc.nextInt();
        for ( i=0;i < k;i++) {
            for ( j=0;j < m;j++) {
                a[i][j]=rnd.nextInt(15) + 15  ;
            }
        }
        for ( i=0;i < k;i++) {
            System.out.println("");
            for ( j=0;j < m;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
               if ((a[0][m-1]%2!=0) | (a[k-1][m-1]%2!=0))
               {
                   System.out.println("a) Имеются ");

               }
               else
               {System.out.println("a) Не имеются ");
              }


                if ( ( (a[0][0]%5==0) | (a[k-1][0]%5==0) ) & ((a[0][0]%10!=0) | (a[k-1][0]%10!=0) ))
                {
                    System.out.println("б)  Имеются ");
                }
                else
                {
                    System.out.println("б) Не имеются ");
                }

}
    }

