public class greater_of_3 {
    public static void main (String[]args)
    {
        int a= 10, b = 20, c = 30;
        if ((a>= b) && (a >= c))// comparing 10 with other numbers
            System.out.println (a + " is the greatest");
        else if (b >=a && b >= c)// checking if 20 is greatest
            System.out.println (b + " is the greatest");
        else
            System.out.println (c + " is the greatest");  // 30 has to be the greatest then if not above
    }
}
