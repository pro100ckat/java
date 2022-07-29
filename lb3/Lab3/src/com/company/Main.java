package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n =0;
        int k=0;
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[17];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (int)((Math.random()*10));
        }

        for(int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++ ) {
            if (arr[i] % 2 ==0 )
            {
                 n = n+1;
            }
            else
            {
                k=k+1;
            }


        }
        System.out.println("Четных " + n + " Нечетных " + k);
    }
}





