public class HeartRatedriver{
	String firstName, lastName;
	dob d;
	public HeartRate(String FName, String LName, int mon, int da, int ye){
		firstName= FName;
		lastName= LName;
		d= new dob();
		d.setdob(da,mon,ye);
	}
	public void setFirstName(String FName){
		firstName= FName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(){
		lastName = LName;
	}
	public String getlastName(){
		return firstName;
	}
	public int getAge(){
		return (2019 - d.year);
	}
	public int MaximumHeartRate(){
		return 220 - getAge();
	}
	public  void targetHeartRate(){
		System.out.println("Target Heart Rate Range: " + MaximumHeartRate()*0.5 + " to "+ MaximumHeartRate()*0.85);
}
}