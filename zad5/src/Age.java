import java.util.Scanner;

class Age
{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        final int Age_Now = 2017;
        System.out.println("Write age : ");
        int age = input.nextInt();

        int ageN = Age_Now - age;
        System.out.println("Your year of birth is: " + ageN);
    }
}

