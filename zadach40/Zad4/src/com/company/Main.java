package com.company;

public class Main {

    public static void main(String[] args) {
        int x;
        int i ;
        int j = 0;
        int m =0;
        int k = 0;
        for (i=100; i<1000; i++ )
        {
            x=i;
            j=x;
            k=0;
            while(x>0)

            { m=x%10;
                x/=10;
                if(m%2==0 && m!=0)
                {
                    k++;
                }
                x=Math.round(x);

            }

            if (k==3)
            {
                System.out.print(j+ ",");
            }
        }





    }
    }

