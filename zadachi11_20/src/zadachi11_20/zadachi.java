package zadachi11_20;
import java.util.Scanner;
public class zadachi {
	public static void main(String[] args)
	{
		//Задача 11
		System.out.println("********** Задача 11 **********");
		        Scanner in= new Scanner(System.in);
		            System.out.println("Введите количество запаса рыбы:");
		            double zapas = in.nextInt();
		            System.out.println("Введите план отлова:");
		            int plan = in.nextInt();
		            System.out.println("Введите минимальный запас рыбы:");
		            int min = in.nextInt();
		            int years = 0;
		    if ((zapas>min)&(zapas>plan)){
		    for (int i=0;((zapas>min)&(zapas>plan));i++){
		      zapas=(zapas*1.15)-plan;
		      years++;
		    }
		    System.out.println("Рыбу можно ловить еще " +years+ " лет" );
		    }
		    else
		        System.out.println("В водоёме слишком мало рыбы для начала отлова");
		System.out.println();
		
		//Задача 12
		System.out.println("********** Задача 12 **********");
		System.out.println("Введите число:");
		int n1=in.nextInt();
		System.out.println("'Перевернутое' число:");
		int m1=0;
		while (n1>0)
		 {
	        int a = n1%10;
	        n1 = n1/10;
	        m1 = m1*10 + a;
		 }
		System.out.println(m1);
		System.out.println();
		
		//Задача 13
		System.out.println("********** Задача 13 **********");
		System.out.println("Введите год:");
		n1=in.nextInt();
		if (n1%4==0 && n1%100 !=0 || n1%400==0)
		{
			System.out.println("Год високосный");
		}
		else
		{
			System.out.println("Год невисокосный");
		}
		System.out.println();
		
		//Задача 14
		System.out.println("********** Задача 14 **********");
		System.out.println("Введите возраст от 0 до 100:");
		n1=in.nextInt();
		if (n1==11||n1==12||n1==13||n1==14) 
		{
			System.out.println(n1+" лет");
		}
		else
		{
			int n2=(n1%10) ;
			switch (n2){
				case 1: System.out.println(n1+" год"); break;
				case 2: System.out.println(n1+" года"); break;
				case 3: System.out.println(n1+" года"); break;
				case 4: System.out.println(n1+" года"); break;
				case 0 :System.out.println(n1+" лет"); break;
				case 5 :System.out.println(n1+" лет"); break;
				case 6 :System.out.println(n1+" лет"); break;
				case 7 :System.out.println(n1+" лет"); break;
				case 8 :System.out.println(n1+" лет"); break;
				case 9 :System.out.println(n1+" лет"); break;
			}
		}
		System.out.println();
		
		//Задача 15
		System.out.println("********** Задача 15 **********");
		System.out.println("Введите номер элемента:");
		n1=in.nextInt();
		switch (n1){
			case 1: System.out.println("Водород"); break;
			case 2: System.out.println("Гелий"); break;
			case 3: System.out.println("Литий"); break;
			case 4: System.out.println("Берилий"); break;
			case 5: System.out.println("Бор"); break;
			case 6: System.out.println("Углерод"); break;
			case 7: System.out.println("Азот"); break;
			case 8: System.out.println("Кислород"); break;
			case 9: System.out.println("Фтор"); break;
			case 10: System.out.println("Неон"); break;
		}
		System.out.println();
		
		//Задача 16
		System.out.println("********** Задача 16 **********");
		System.out.println("Введите расстояние:");
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
		
		//Задача 17
		System.out.println("********** Задача 17 **********");
		zapas=1250000;
		System.out.println("Население в 2017 году: "+(int)zapas);
		for (int i=8; i<10; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("Население в 201"+i+" году: "+(int)zapas);
		}
		for (int i=20; i<30; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("Население в 20"+i+" году: "+(int)zapas);
		}
		for (int i=30; i<41; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("Население в 20"+i+" году: "+(int)zapas);
		}
		System.out.println();
		
		//Задача 18
		System.out.println("********** Задача 18 **********");
		System.out.println("Введите сумму вклада:");
		zapas=in.nextInt();
		System.out.println("Сумма вклада в январе: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в феврале: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в марте: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в апреле: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в мае: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в июне: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в июле: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в августе: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в сентябре: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в октябре: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в ноябре: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("Сумма вклада в декабре: "+String.format("%(.2f", zapas));
		System.out.println();
		
		//Задача 19
		 System.out.println("********** Задача 19 **********");
		 System.out.println("Все целые числа в порядке возрастания");
		 System.out.print("Введите значение a и b (A<B)");
		 int a = in.nextInt();
		 int b = in.nextInt();
		 if (a>=b)
		 {
			 System.out.print("А должно быть меньше В, пожалуйста, проверьте правильность введенных данных и попробуйте еще раз:");
			 a = in.nextInt();
			 b = in.nextInt();
		 }
		 if (a<b)
		 {
			 int n=(b-a+1);
			 System.out.println("n=" +n); 
			 System.out.println("" +a);
			 for (int x = a + 1; x < b; x++){
				 a=a+1;
				 System.out.println("" +a);
				 System.out.println("" +b);
			 }
		 }
		System.out.println();
		
		//Задача 20
		System.out.println("********** Задача 20 **********");
            System.out.println("Введите количество запаса рыбы:");
            zapas = in.nextInt();
            System.out.println("Введите план отлова:");
            plan = in.nextInt();
            System.out.println("Введите минимальный запас рыбы:");
            min = in.nextInt();
            years = 0;
            if ((zapas>min)&(zapas>plan)){
            	for (int i=0;((zapas>min)&(zapas>plan));i++){
            		zapas=(zapas*1.15)-plan;
            		years++;
            	}
            	System.out.println("Рыбу можно ловить еще " +years+ " лет" );
            	}
            else
            	System.out.println("В водоёме слишком мало рыбы для начала отлова");
	}
}
