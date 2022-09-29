package practiceproblems;

import java.util.Scanner;

public class reverse_num {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber to be reversed:");
        int number=sc.nextInt();
        int reverse = 0, rem;  //variables initialization
        while (number != 0)//loop to find reverse number
        {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        };
        System.out.println ("Reversed Number: " + reverse);
    }
}
