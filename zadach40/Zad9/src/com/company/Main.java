package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько идти от пункта А в пункт В в минутах - ");
        int Len = in.nextInt();
        if (Len <= 5){
            System.out.println("близко");
        }
        else {
            if (Len <=15){
                System.out.println("недалеко");
            }
            else {System.out.println("очень далеко");
            }
        }
    }
    }

