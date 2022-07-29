package com.company;

public class Main {

    public static void main(String[] args) {

        int i,j,v;
        for ( i = 10; i < 100; i++)
        {
            for (j = 10; j < 100; j++)
            {
                int p = i*j;
                v = 100*i + j;
                if ((v % p) == 0)
                {
                    System.out.println("1 число= " + i);
                    System.out.println("2 число= " + j);
                    System.out.println("Четырехзначное число v= " + v );
                }
            }
        }
    }
}
