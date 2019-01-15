import java.util.Scanner;
class factorialseries
{
    public static int fact(int index)
    {
        int f = 1, i;
        for(i = 1; i <= index; i ++)
        {
            f = f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        int i , num, x;
        double frac, sum=0;
        System.out.println("Enter the number of terms");
        num = console.nextInt();
        System.out.println("Enter the value of x");
        x = console.nextInt();
        for(i = 1; i <= num; i ++)
        {
            frac = Math.pow(x, i)/fact(i);
            sum = sum + frac;
        }
        System.out.println("The sum is "+sum);
    }
}