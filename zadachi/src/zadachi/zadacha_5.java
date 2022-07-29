package zadachi;
import java.util.Scanner;
public class zadacha_5 {
	public static void main (String[] args)
	{
		
		//Задача 1
		System.out.println("********** Задача 1 **********");
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
	    
	    //Задача 2
		System.out.println("********** Задача 2 **********");
		System.out.println("В возрастающем порядке:");
		for (int i=-99; i<9; i++)
		{
			System.out.print(i+"; ");
		}
		for (int i=10; i<100; i++)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		System.out.println("В убывающем порядке:");
		for (int i=99; i>9; i--)
		{
			System.out.print(i+"; ");
		}
		for (int i=-10; i>-100; i--)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		
		//Задача 3
		System.out.println("********** Задача 3 **********");
		for (int i=100; i<1000; i++)
		{
			if (((i%10)*(i/100))==(((i/10)%10)*((i/10)%10)))
			{
				System.out.print(i+"; ");
			}
		}
		System.out.println();
		
		//Задача 4
		System.out.println("********** Задача 4 **********");
		for (int i=100; i<1000; i+=2)
		{
			if (((i/100)%2==0)&&(((i/10)%10)%2==0))
			{
				System.out.print(i+"; ");
			}
		}
		System.out.println();
		
		//Задача 5
		System.out.println("********** Задача 5 **********");
		for (int i=100; i<1000; i++)
		{
			if (i%3==0) 
					{
				System.out.print(i+"; ");
				
			}
		}
		
		//Задача 6
		System.out.println("********** Задача 6 **********");
		System.out.println("Двузначные целые числа, у которых есть только два делителя:");
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
		
		//Задача 7
		System.out.println("********** Задача 7 **********");
		System.out.println("Введите число:");
		int n1=0;
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		System.out.println("Неотрицательные числа, которые меньше заданного:");
		for (int i=0; i<n1; i++)
		{
			System.out.print(i+"; ");
		}
		System.out.println();
		
		//Задача 8
		System.out.println("********** Задача 8 **********");
		System.out.println("Введите число:");
		n1=in.nextInt();
		switch(n1)
		{
		case 1:
			System.out.print("Один/One");
			break;
		case 2:
			System.out.print("Два/Two");
			break;
		case 3:
			System.out.print("Три/Three");
			break;	
		case 4:
			System.out.print("Четыре/Four");
			break;
		case 5:
			System.out.print("Пять/Five");
			break;
		case 6:
			System.out.print("Шесть/Six");
			break;
		case 7:
			System.out.print("Семь/Seven");
			break;
		case 8:
			System.out.print("Восемь/Eight");
			break;
		case 9:
			System.out.print("Девять/Nine");
			break;	
		case 10:
			System.out.print("Десять/Ten");
			break;
		case 11:
			System.out.print("Одиннадцать/Eleven");
			break;
		case 12:
			System.out.print("Двенадцать/Twelve");
			break;
		case 13:
			System.out.print("Тринадцать/Thirteen");
			break;
		case 14:
			System.out.print("Четырнадцать/Fourteen");
			break;
		case 15:
			System.out.print("Пятнадцать/Fifteen");
			break;	
		case 16:
			System.out.print("Шестнадцать/Sixteen");
			break;
		case 17:
			System.out.print("Семнадцать/Seventeen");
			break;
		case 18:
			System.out.print("Восемнадцать/Eighteen");
			break;
		case 19:
			System.out.print("Девятнадцать/Nineteen");
			break;
		case 20:
			System.out.print("Двадцать/Twenty");
			break;
		}
		System.out.println();
		
		//Задача 9
		System.out.println("********** Задача 9 **********");
		System.out.print("Введите, сколько идти от пункта А в пункт В в минутах: ");
		int rasst = in.nextInt();
		if (rasst<0)
		{
			System.out.println("Введенное число должно быть больше 0.");
			rasst = in.nextInt();
		}
		else
		{
		if (rasst <= 5)
		{
			System.out.println("Близко");
		}
		else
		{
			if (rasst <=15)
			{
				System.out.println("Недалеко");
			}
			else 
				{
					System.out.println("очень далеко");
				}
		}
		}
		System.out.println();
		
		//Задача 10
		System.out.println("********** Задача 10 **********");
		System.out.print("Введите возраст:");
		rasst = in.nextInt();
		if (rasst<0)
		{
			System.out.println("Возраст не может быть отрицательным числом, пожалуйста, проверьте введенные данные.");
			rasst = in.nextInt();
		}
		else
			{
			if ((rasst >=0)&&(rasst <= 12))
				{
					System.out.println("Ребенок");
				}
			else
		       {
					if ((rasst >=13)&&(rasst <=19))
					{
						System.out.println("Подросток");
					}
			
					else 
					{
						if ((rasst >=20)&&(rasst <=25))
						{
							System.out.println("Молодой");
						}
						else
						{
							if ((rasst >=26)&&(rasst <=55))
							{
								System.out.println("Взрослый");
							}
							else
								{
								System.out.println("Пожилой");
								}
						}
					}
				}
			}
		System.out.println();
	}
}
