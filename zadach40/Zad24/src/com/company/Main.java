package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double temp1, temp2;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Количество элементов в массиве:");
        n = in.nextInt();
        double[] mass1 = new double[n];
        for (int i=0; i < mass1.length; i++)
        {
            mass1[i] = in.nextDouble();
        }
        System.out.println("Введенный массив: ");
        for (int i=0; i < mass1.length; i++)
            System.out.print(mass1[i] + " ");
        temp1 = mass1[0];
        for(int i = 1;i < n-1; i++){
            temp2 = temp1;
            temp1 = mass1[i];
            mass1[i] = (temp2 + mass1[i+1]) / 2;
        }
        System.out.println();
        System.out.println("Полученный массив: ");
        for(int i = 0;i < n; i++)
            System.out.print(mass1[i] + " ");
    }
}
