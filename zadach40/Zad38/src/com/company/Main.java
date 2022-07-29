package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        int[][] arr = new int[10][10];
        System.out.println("введите размерность массива ");
        int k= sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.println();
            for (int j = 0; j < k; j++) {
                arr[i][j] = (k ^ i ^ j) & 1;
                System.out.print(arr[i][j] + " ");
            }

        }

    }
}
