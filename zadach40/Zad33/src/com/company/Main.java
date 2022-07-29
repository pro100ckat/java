package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m =0;
        System.out.println("Введите число: ");
        n = in.nextInt();
        System.out.println(recursion(n,m ));
    }
    public static int recursion(int n, int last) {
        last*=10;
        if (n/10!=0) {
            last+= n % 10;
            return recursion(n / 10, last);
        }
        else {
            return last += n;
        }


    }
}
