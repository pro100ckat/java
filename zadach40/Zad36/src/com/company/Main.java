package com.company;
 import java.util.Random;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
	    int [] a = new int [10];
	    int [] b= new int [10];
	    int [] c= new int [10];
	    int [] d= new int [10];
	    int [] e= new int [10];
        System.out.println("Введите размерность массивов ");
        int k = sc.nextInt();
        for (int i=0; i<k; i++)
        {
            a[i]=rd.nextInt(15) -5;
        }
        for (int i=0; i<k; i++)
        {
            System.out.print(a[i] + "  ");
        }
        System.out.println();

        for  (int i = 0; i<k; i++)
        {
            if (a[i]>=0)
            {
                b[i]=a[i];
            }
            else
            {

                c[i]=a[i];
            }
        }
        System.out.println("а) ");
        for (int i=0;i<k; i++)
        {
            System.out.print(b[i] + "  ");
        }
        System.out.println("");
 for (int i=0;i<k; i++)
        {
            System.out.print(c[i] + "  ");
        }
        System.out.println("");
        System.out.println("б) ");
        int q=0;
        int w=0;
 for (int i = 0; i<k; i++)
 {


         if (a[i]<=0)
         {
             d[q]=a[i];
             q=q+1;
         }
         else
         {
             e[w]=a[i];
             w=w+1;


         }

 }

        for (int i=0;i<q; i++)
        {
            System.out.print(d[i] + "  ");
        }
        System.out.println();


        for (int i=0;i<w; i++)
        {
            System.out.print(e[i] + "  ");
        }

    }
}
