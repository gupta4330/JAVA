class circle1{
private double radius;
public double getradius(){
	return radius;
}
public void setradius(double r){
	radius=r;
}
public double findarea(){
 area = 3.14*radius*radius;
return 3.14*radius*radius;
}
public double displayarea(){
	System.out.println("the area is " findarea());
}
	
}
public class circlemaster1{
	public static void main(String[] args){
		double num;
	circle1 c = new circle1();
	c.setradius(2);
	num=c.getradius();
	c.findarea();
	c.displayarea();
}
}