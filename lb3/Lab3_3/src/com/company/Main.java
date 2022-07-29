package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a[],b[];
        int flag;
        int num = 0;
        a = new int[10];
        b = new int[5];
        for(int i = 0; i<5; i++){
            b[i] = (int)(Math.random()*6);
        }
        for(int i = 0; i<10; i++){
            a[i] = (int)(Math.random()*6);
        }
        for(int i = 0; i<5; i++){
            System.out.print(b[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i<10; i++){
            System.out.print(a[i]+ " ");
        }
        for(int i = 0; i<5; i++){
            flag = 0;
            for(int j = 0; j<10; j++){
                if(flag == 0){
                    if(a[j] == b[i]){
                        flag = 1;
                        num = num +1;
                    }
                }
            }
        }
        System.out.println();
        if(num >= 5){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
