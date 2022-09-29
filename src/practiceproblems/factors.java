package practiceproblems;

import java.util.Scanner;

public class factors {
    public static void main (String[]args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no whose factors are to be searched");
        int num=sc.nextInt();
        System.out.println( "Factors of " + num + " are " );
        Factors (num);
    }

    static void Factors (int num)
    {

        for (int i = 1; i <= (num/2); i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.print(num); //to print the no entered no aslo

    }
}
