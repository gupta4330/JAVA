public class rectangle
{
	private double length;
	private double width;
	double area, perimeter;
	public rectangle()
	{
	length= 10;
	width= 10;
	}
	public rectangle(double l, double w)
	{
	length= l;
	width = w;
	}
	public void setDimension(double a, double b)
	{
	length= a;
	width = b;
	}


	public double getLength()
	{
	return length;
	}
	public double getWidth()
	{
	return width;

	}
	public double area()
	{
	area= length*width;
	return area;
	}
	public double perimeter()
	{
	perimeter= 2*(length + width);
	return perimeter;
	}
	public void print()
	{
	System.out.print(" the area is :" +area);
    System.out.print(" the perimeter is :" +perimeter);
	}
}