import java.util.*;
class box
{
	double width,w;
	double height,h;
	double depth,d;
	void setDim()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return w*h*d;
	}
}
class boxdemo
{
	public static void main(String args[])
	{
double vol;
Scanner s1 =new Scanner(System.in);
	box b1 = new box();
	System.out.println("Enter the values of Width, Height and Depth")
	b1.width=s1.nextInt();
	b1.height=s1.nextInt();
	b1.depth=s1.nextInt();
	
	b1.width=2;
	b1.height=3;
	b1.depth=10;
	b1.setDim();
	vol=b1.volume();
	
	System.out.println("The volume is " +vol);
	}
}