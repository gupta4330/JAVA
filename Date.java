import java.util.*;
public class Date{
	private int month;
	private int day;
	private int year;

public Date (int month, int day, int year){
	this.month=month;
	this.day=day;
	this.year=year;
}
public void setmonth (int month) {
	if(month>=1 && month<=12){
	this.month=month;
	}
	else{
	System.out.print("invalid value");
	}
}
public int getmonth(){
	return month;
}
public void setday (int day){
	if(day>=1 && day<=31){
	this.day=day;
	}
	else{
	System.out.print("invalid input");
	}
} 
public int getday(){
	return day;
}
public void setyear (int year){
	if(year>=1900 && year<=2100){
	this.year=year;
	}
}
public int getyear(){
	return year;
}
public void displayDate (){
	System.out.printf("%d/%d/%d", getmonth(), getday(), getyear());
}
}