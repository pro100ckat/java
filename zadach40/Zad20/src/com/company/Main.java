package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите кол-во запаса рыбы: ");
        double zap = keyboard.nextInt();
        System.out.println("Введите план отлова: ");
        double plan = keyboard.nextInt();
        System.out.println("Введите минимальный запас рыбы: ");
        double min = keyboard.nextInt();
        int let = 0;
        if ((zap > min) & (zap > plan)) {
            for (int i = 0; ((zap > min) & (zap > plan)); i++) {
                zap = (zap * 1.15) - plan;
                let++;
            }
            System.out.println("Рыбу можно ловить " + let + " лет");
        } else
            System.out.println("В водоёме не достаточно рыбы для начала отлова");
    }}