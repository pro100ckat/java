package com.company;

public class Main {

    public static void main(String[] args) {
        int k=0;
        int x=0;
        for (int i=1; i<100; i++){
            for (int j=1; j<=i; j++){
                if((j!=1)&(j!=i)&(i%j==0)){
                    k++;
                }
            }
            if (k==2){
                System.out.print(i+" ");
                k=0;
            }
            else
            {
                k=0;
            }
        }
        System.out.println("- Двузначные числа имеющие 2 делителя, кроме 1 и самого себя");
    }
    }

