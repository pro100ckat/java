package com.company;

public class Main {

    public static void main(String[] args) {
        int u11, u12, u21, u22, c,i,j;
        c = 0;
        for (i = 0; i <= 23; i++) {
            for (j = i; j <= 59; j++) {
                u12=i%10;
                u11=i/10;
                u22=j%10;
                u21=j/10;
                if ((u11==u21)&(u12==u22)){
                    c=c+1;
                }
                if ((u11==u22)&(u12==u21)){
                    c=c+1;
                }
            }
        }
        System.out.println(c + " раз");
    }
}
