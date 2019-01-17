public class Circle{
	String color="red";
	private double radius;
	
	double area;
	public Circle() {
		radius = 1;

	}
	public Circle(double r) {
		radius=r;

	}
	public void setDimension(double a)
	{
		radius = a;
	}
	public double getRadius()
	{
		return radius;
	}
	public double area()
	{
		area=3.14*radius*radius;
		return area;

	}
	public void print()
	{
		System.out.print("The area is :"+area);
	}
	}