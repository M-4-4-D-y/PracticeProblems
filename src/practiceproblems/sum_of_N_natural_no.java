package practiceproblems;

import java.util.Scanner;

public class sum_of_N_natural_no {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to whose sum is to be called");
        int num=sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++)
            sum += i; //sum=sum+i
        System.out.println (sum);
    }
}
