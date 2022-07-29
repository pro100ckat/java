package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int k = 0;

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        for(int i = 1; i <= k; i++){
            for(int j = i; j>0; j--) System.out.print(i + " ");
        }
        System.out.println();
    }
}
