import java.util.*;
public class HeartRate{
	public static void main(String[] args) {
		Scanner input = new HeartRate[2];
		HeartRate myHeartRate[] = new HeartRate[2];
		for (int count=0; count<(myHeartRate.length) ; count++ ) {
			System.out.println("Enter First Name : ");
			String firstname = input.nextLine();
			System.out.println("Enter Last Name : ");
			String lastname= input.nextLine();
			System.out.println("Enter BirthDate: "+"\nmm"+"\ndd"+"\nyear");
			int month = input.nextInt();
			int day = input.nextInt();
			int year = input.nextInt();
			input.nextLine();
			myHeartRate[count] = new HeartRate(firstName, lastname, month, day, year);
			System.out.println("firstName"+"\t"+"last name"+"\n"+"Age in years"+"\n"+"Maximum HeartRate"+"\t"+"targetheartrate\n");
			System.out.println(firstName +"\t" + lastName+"\t" + myHeartRate[count].getAge()+"\t" + myHeartRate[count].MaximumHeartRate());
			myHeartRate[count].targetHeartRate();
		}
	}
}