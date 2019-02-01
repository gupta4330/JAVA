import java.util.*;
class box {
double width, w;
double height, h;
double depth, d;
void setDim ()
{
	w=width;
	h=height;
	d=depth;

}
double volume ();
{
	Scanner input = new Scanner(System.in);
	return w*h*d;
}
class boxdemo1
{
	public static void main(Strings args[])
	{
	box b1 = new box();
	box b2 = new box();
	System.out.println("Enter the radius for box 1");
	b1.width = input.nextInt();
	b1.height= input.nextInt();
	b1.depth= input.nextInt();
	b1.setDim();
	vol = b1.volume;
	System.out.println("Volume is " + vol);
	}
}
}