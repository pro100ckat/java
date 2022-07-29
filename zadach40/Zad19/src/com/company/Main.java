package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Все целые числа в порядке возрастания");
        System.out.print("Введите значение А и B(A<B)");
        Scanner in=new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int X;
        if (A>=B){
            System.out.print("На соблюдено условие (A<B)");
        }
        if (A<B){
            int N=(B-A+1);
            System.out.println("N=" +N);
            System.out.println("" +A);
            for (X = A + 1; X < B;X++){
                A=A+1;
                System.out.println("" +A);

            }
            System.out.println("" +B);
        }
    }

}
