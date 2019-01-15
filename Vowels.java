import java.util.Scanner;
public class Vowels{

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error! Not a alphabet.Please enter an uppercase or lowercase lettersssssss.");
        }
        else if (vowels)
        {
            System.out.println("Input alphabet is Vowel");
        }
        else
        {
            System.out.println("Input alphabet is Consonant");
        }
    }
}