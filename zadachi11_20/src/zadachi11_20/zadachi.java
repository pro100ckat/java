package zadachi11_20;
import java.util.Scanner;
public class zadachi {
	public static void main(String[] args)
	{
		//������ 11
		System.out.println("********** ������ 11 **********");
		        Scanner in= new Scanner(System.in);
		            System.out.println("������� ���������� ������ ����:");
		            double zapas = in.nextInt();
		            System.out.println("������� ���� ������:");
		            int plan = in.nextInt();
		            System.out.println("������� ����������� ����� ����:");
		            int min = in.nextInt();
		            int years = 0;
		    if ((zapas>min)&(zapas>plan)){
		    for (int i=0;((zapas>min)&(zapas>plan));i++){
		      zapas=(zapas*1.15)-plan;
		      years++;
		    }
		    System.out.println("���� ����� ������ ��� " +years+ " ���" );
		    }
		    else
		        System.out.println("� ������ ������� ���� ���� ��� ������ ������");
		System.out.println();
		
		//������ 12
		System.out.println("********** ������ 12 **********");
		System.out.println("������� �����:");
		int n1=in.nextInt();
		System.out.println("'������������' �����:");
		int m1=0;
		while (n1>0)
		 {
	        int a = n1%10;
	        n1 = n1/10;
	        m1 = m1*10 + a;
		 }
		System.out.println(m1);
		System.out.println();
		
		//������ 13
		System.out.println("********** ������ 13 **********");
		System.out.println("������� ���:");
		n1=in.nextInt();
		if (n1%4==0 && n1%100 !=0 || n1%400==0)
		{
			System.out.println("��� ����������");
		}
		else
		{
			System.out.println("��� ������������");
		}
		System.out.println();
		
		//������ 14
		System.out.println("********** ������ 14 **********");
		System.out.println("������� ������� �� 0 �� 100:");
		n1=in.nextInt();
		if (n1==11||n1==12||n1==13||n1==14) 
		{
			System.out.println(n1+" ���");
		}
		else
		{
			int n2=(n1%10) ;
			switch (n2){
				case 1: System.out.println(n1+" ���"); break;
				case 2: System.out.println(n1+" ����"); break;
				case 3: System.out.println(n1+" ����"); break;
				case 4: System.out.println(n1+" ����"); break;
				case 0 :System.out.println(n1+" ���"); break;
				case 5 :System.out.println(n1+" ���"); break;
				case 6 :System.out.println(n1+" ���"); break;
				case 7 :System.out.println(n1+" ���"); break;
				case 8 :System.out.println(n1+" ���"); break;
				case 9 :System.out.println(n1+" ���"); break;
			}
		}
		System.out.println();
		
		//������ 15
		System.out.println("********** ������ 15 **********");
		System.out.println("������� ����� ��������:");
		n1=in.nextInt();
		switch (n1){
			case 1: System.out.println("�������"); break;
			case 2: System.out.println("�����"); break;
			case 3: System.out.println("�����"); break;
			case 4: System.out.println("�������"); break;
			case 5: System.out.println("���"); break;
			case 6: System.out.println("�������"); break;
			case 7: System.out.println("����"); break;
			case 8: System.out.println("��������"); break;
			case 9: System.out.println("����"); break;
			case 10: System.out.println("����"); break;
		}
		System.out.println();
		
		//������ 16
		System.out.println("********** ������ 16 **********");
		System.out.println("������� ����������:");
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
		
		//������ 17
		System.out.println("********** ������ 17 **********");
		zapas=1250000;
		System.out.println("��������� � 2017 ����: "+(int)zapas);
		for (int i=8; i<10; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("��������� � 201"+i+" ����: "+(int)zapas);
		}
		for (int i=20; i<30; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("��������� � 20"+i+" ����: "+(int)zapas);
		}
		for (int i=30; i<41; i++)
		{
			zapas=(zapas+(zapas*0.03));
			System.out.println("��������� � 20"+i+" ����: "+(int)zapas);
		}
		System.out.println();
		
		//������ 18
		System.out.println("********** ������ 18 **********");
		System.out.println("������� ����� ������:");
		zapas=in.nextInt();
		System.out.println("����� ������ � ������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � �������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � �����: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ���: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ����: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ����: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � �������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ��������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � �������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � ������: "+String.format("%(.2f", zapas));
		zapas=(zapas+(zapas*0.85));
		System.out.println("����� ������ � �������: "+String.format("%(.2f", zapas));
		System.out.println();
		
		//������ 19
		 System.out.println("********** ������ 19 **********");
		 System.out.println("��� ����� ����� � ������� �����������");
		 System.out.print("������� �������� a � b (A<B)");
		 int a = in.nextInt();
		 int b = in.nextInt();
		 if (a>=b)
		 {
			 System.out.print("� ������ ���� ������ �, ����������, ��������� ������������ ��������� ������ � ���������� ��� ���:");
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
		
		//������ 20
		System.out.println("********** ������ 20 **********");
            System.out.println("������� ���������� ������ ����:");
            zapas = in.nextInt();
            System.out.println("������� ���� ������:");
            plan = in.nextInt();
            System.out.println("������� ����������� ����� ����:");
            min = in.nextInt();
            years = 0;
            if ((zapas>min)&(zapas>plan)){
            	for (int i=0;((zapas>min)&(zapas>plan));i++){
            		zapas=(zapas*1.15)-plan;
            		years++;
            	}
            	System.out.println("���� ����� ������ ��� " +years+ " ���" );
            	}
            else
            	System.out.println("� ������ ������� ���� ���� ��� ������ ������");
	}
}
