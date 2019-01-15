import java.util.Scanner;
public class Rhmbs {
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = console.nextInt();
        int count = 1;
        int count2 = 1;
        int i, a;
        int j;
        char c = 'A';

        for (i = 1; i < (n * 2); i++) 
        {
            for (a = n - count2 ; a > 0; a--)   
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (j = 0; j < count; j++) 
            {
                System.out.print(c);
                if (j < count / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}