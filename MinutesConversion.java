import java.util.*;
public class MinutesConvrersion {

    public static void main(String[] Strings) {


        Scanner s1 = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = s1.nextDouble();

        double years = (long) (min / 60*24*365);
        float days = (int) (min / 60*24) ;
        float months = (int) (min/60*24*30) ;

        System.out.println((int) min + " minutes is approximately " + years + " years  " + months + " months and " + days + " days");
    }}