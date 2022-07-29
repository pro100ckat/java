package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int[][] arr = new int[18][36];

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 36; j++) {
                arr[i][j] = rd.nextInt(2);

            }
        }
        for (int i = 0; i < 18; i++) {
            System.out.println();
            for (int j = 0; j < 36; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println();
            System.out.println("Введите номер вагона ");
            int k= sc.nextInt();
        System.out.print("Свободные места: ");
            for (int i=0; i<36; i++ )

            {
                if (arr[k-1][i]==0)
                {
                    System.out.print((i+1)+ ", ");
                }
            }
        }

}
