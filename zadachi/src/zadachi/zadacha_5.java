package zadachi;
import java.util.Scanner;
public class zadacha_5 {
	public static void main (String[] args)
	{
		
		//������ 1
		System.out.println("********** ������ 1 **********");
		String s1, s2, s3, s4, s5;
		Scanner sc = new Scanner(System.in);
	    s1= sc.nextLine();
	    s2= sc.nextLine();
	    s3= sc.nextLine();
	    s4= sc.nextLine();
	    s5= sc.nextLine();
	    if (s4==s5) 
	    {
	    	System.out.println(s1+s2);
	    }
	    else
	    {
	    	System.out.println(s1+s3);
	    }
	    System.out.println();
	    
	    //������ 2
		System.out.println("********** ������ 2 **********");
		System.out.println("� ������������ �������:");
		for (int i=-99; i<9; i++)
		{
			System.out.print(i+"; ");
		}
		for (int i=10; i<100; i++)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		System.out.println("� ��������� �������:");
		for (int i=99; i>9; i--)
		{
			System.out.print(i+"; ");
		}
		for (int i=-10; i>-100; i--)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		
		//������ 3
		System.out.println("********** ������ 3 **********");
		for (int i=100; i<1000; i++)
		{
			if (((i%10)*(i/100))==(((i/10)%10)*((i/10)%10)))
			{
				System.out.print(i+"; ");
			}
		}
		System.out.println();
		
		//������ 4
		System.out.println("********** ������ 4 **********");
		for (int i=100; i<1000; i+=2)
		{
			if (((i/100)%2==0)&&(((i/10)%10)%2==0))
			{
				System.out.print(i+"; ");
			}
		}
		System.out.println();
		
		//������ 5
		System.out.println("********** ������ 5 **********");
		for (int i=100; i<1000; i++)
		{
			if (i%3==0) 
					{
				System.out.print(i+"; ");
				
			}
		}
		
		//������ 6
		System.out.println("********** ������ 6 **********");
		System.out.println("���������� ����� �����, � ������� ���� ������ ��� ��������:");
		int k1=0;
		for (int i=1; i<100; i++){
			for (int j=1; j<=i; j++){
				if((j!=1)&(j!=i)&(i%j==0))
				{
					k1++;
				}
			}
			if (k1==2)
			{
				System.out.print(i+" ");
				k1=0;
			}
			else
			{
				k1=0;
			}
		}
		System.out.println();
		
		//������ 7
		System.out.println("********** ������ 7 **********");
		System.out.println("������� �����:");
		int n1=0;
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		System.out.println("��������������� �����, ������� ������ ���������:");
		for (int i=0; i<n1; i++)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		
		//������ 8
		System.out.println("********** ������ 8 **********");
		System.out.println("������� �����:");
		n1=in.nextInt();
		switch(n1)
		{
		case 1:
			System.out.print("����/One");
			break;
		case 2:
			System.out.print("���/Two");
			break;
		case 3:
			System.out.print("���/Three");
			break;	
		case 4:
			System.out.print("������/Four");
			break;
		case 5:
			System.out.print("����/Five");
			break;
		case 6:
			System.out.print("�����/Six");
			break;
		case 7:
			System.out.print("����/Seven");
			break;
		case 8:
			System.out.print("������/Eight");
			break;
		case 9:
			System.out.print("������/Nine");
			break;	
		case 10:
			System.out.print("������/Ten");
			break;
		case 11:
			System.out.print("�����������/Eleven");
			break;
		case 12:
			System.out.print("����������/Twelve");
			break;
		case 13:
			System.out.print("����������/Thirteen");
			break;
		case 14:
			System.out.print("������������/Fourteen");
			break;
		case 15:
			System.out.print("����������/Fifteen");
			break;	
		case 16:
			System.out.print("�����������/Sixteen");
			break;
		case 17:
			System.out.print("����������/Seventeen");
			break;
		case 18:
			System.out.print("������������/Eighteen");
			break;
		case 19:
			System.out.print("������������/Nineteen");
			break;
		case 20:
			System.out.print("��������/Twenty");
			break;
		}
		System.out.println();
		
		//������ 9
		System.out.println("********** ������ 9 **********");
		System.out.print("�������, ������� ���� �� ������ � � ����� � � �������: ");
		int rasst = in.nextInt();
		if (rasst<0)
		{
			System.out.println("��������� ����� ������ ���� ������ 0.");
			rasst = in.nextInt();
		}
		else
		{
		if (rasst <= 5)
		{
			System.out.println("������");
		}
		else
		{
			if (rasst <=15)
			{
				System.out.println("��������");
			}
			else 
				{
					System.out.println("����� ������");
				}
		}
		}
		System.out.println();
		
		//������ 10
		System.out.println("********** ������ 10 **********");
		System.out.print("������� �������:");
		rasst = in.nextInt();
		if (rasst<0)
		{
			System.out.println("������� �� ����� ���� ������������� ������, ����������, ��������� ��������� ������.");
			rasst = in.nextInt();
		}
		else
			{
			if ((rasst >=0)&&(rasst <= 12))
				{
					System.out.println("�������");
				}
			else
		       {
					if ((rasst >=13)&&(rasst <=19))
					{
						System.out.println("���������");
					}
			
					else 
					{
						if ((rasst >=20)&&(rasst <=25))
						{
							System.out.println("�������");
						}
						else
						{
							if ((rasst >=26)&&(rasst <=55))
							{
								System.out.println("��������");
							}
							else
								{
								System.out.println("�������");
								}
						}
					}
				}
			}
		System.out.println();
	}
}
