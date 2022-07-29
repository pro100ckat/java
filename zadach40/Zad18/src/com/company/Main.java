package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double summ = 0.0;
        double percent = 0.0085;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму");
        summ = (double) in.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println("Сумма в начале месяца: " + String.format("%.2f", summ) + "; процент: " + String.format("%.2f", summ * percent) + "\n");
            summ += summ * percent;
        }
    }
}
