class Cube extends rectangle
{
	private double height;
	double area,perimeter;
	Cube();
	{
	super();
	height=10;
	}
	Cube(double l,double w,double h){
	super(1,w);
	height=h;
	public void setDimension(double l,double w,double h)
	{
	super(l,w);
	height=h;
	}
	public double getheight()
	{
	return height;
	}
	public double area()
	{
	volume=height*getwidth()*getlength();
	return area;
	}
	public double perimeter()
	{
	perimeter =2*height+2*getwidth()+2*getlenght();
	return perimeter;
	}
	public void print()
	{
	System.out.print("area is" +area);
	Systenm.out.print("the perimeter is"+perimeter);
	}
}