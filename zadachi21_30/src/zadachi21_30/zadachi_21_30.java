package zadachi21_30;
import java.util.Scanner;
import java.util.Random;
public class zadachi_21_30
{
	public static void main(String[] args)
	{
	//������ 21
		System.out.println("********** ������ 21 **********");
        for ( int i = 10; i < 100; i++)
        {
            for (int j = 10; j < 100; j++)
            {
                int p = i*j;
                int v = 100*i + j;
                if ((v % p) == 0)
                {
                    System.out.println("1 �����= " + i);
                    System.out.println("2 �����= " + j);
                    System.out.println("�������������� ����� v= " + v );
                    System.out.println();
                }
            }
        }
		System.out.println();
		
		//������ 22
				System.out.println("********** ������ 22 **********");
				for (int i=10; i<99; i++)
				{
					for (int j=10; j<99; j++)
					{
						if (((i * 100) + j) % 99 == 0 && ((j * 100) + i) % 49 == 0)
						{
							System.out.println("a = "+i+"; b = "+j);
						}
					}
				}
				System.out.println();
				
		//������ 23
				System.out.println("********** ������ 23 **********");
				Scanner in= new Scanner(System.in);
				int mas[];
				mas=new int[10];
				Random random = new Random();
				for (int i=0; i<10; i++)
				{
					mas[i]=random.nextInt(10);
				}
				for (int i=0; i<10; i++)
				{
					System.out.print (mas[i]+" ");
				}
				System.out.print ("�� ������� ������� �� ������ �������� ������?");
				int k=in.nextInt();
				for (int i=0; i<10; i++)
				{
					for (int j=10; j>0; j--)
					{
						
					}
				}
				
				System.out.println();
				
	}
}
