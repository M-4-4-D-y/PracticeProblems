package practiceproblems;

import java.util.Scanner;

public class palindrome {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number to be checked for Palindrome:");
        int num=sc.nextInt();
        int  reverse = 0, rem, temp;
        temp = num;
        while (temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        };
        if (num == reverse)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is not Palindrome");
    }
}
