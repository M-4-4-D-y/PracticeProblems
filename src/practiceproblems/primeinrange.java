package practiceproblems;

import java.util.Scanner;

public class primeinrange {
    public static void main (String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no");
        int lower=sc.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 2nd no");
        int upper =sc.nextInt();
        for (int i = lower; i <= upper; i++)
            if (isPrime (i))
                System.out.println (i);
    }

    static boolean isPrime (int n)
    {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i < n / 2; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
