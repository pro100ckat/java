package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rain, snow, rs, temp;
        int days, i;
        snow = 0;
        rain = 0;
        System.out.print("Введите кол-во дней = ");
        Scanner scr = new Scanner(System.in);
        days = scr.nextInt();
        for (i = 0; i < days; i++) {
            rs = scr.nextInt();
            temp = scr.nextInt();
            if (temp < 0) {
                snow = snow + rs;
            }
            {
                    rain = rain + rs;
                }
            }

        System.out.println("Rain = " +rain + " Snow = " + snow);
    }}

