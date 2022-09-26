public class sum_of_N_natural_no {
    public static void main (String[]args)
    {

        int n = 7;
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i; //sum=sum+i
        System.out.println (sum);
    }
}
