package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        int k;
        double sr,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        k = sc.nextInt();
        s = 0;
        int a[] = new int[k];

        for(int i = 0; i < a.length; i++ )
        {
            System.out.println("Введите оценку " + (i+1) + " Студента: ");
            a[i] = sc.nextInt();
            s=s+a[i];
        }
        sr = s/k;
        System.out.println("Средний балл: " + sr);
        System.out.println("Отклонение от среднео балла: ");
        for (int i =0; i<a.length; i++)
        {
            System.out.println("Студент: " + (i+1) + " " +a[i] + "(" + (a[i]-sr) + ")");
        }

    }
}
