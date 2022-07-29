package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        k = sc.nextInt();
        while (k!=1) {
            k = k-1;
            System.out.print(k + ",");

        }
    }
}
