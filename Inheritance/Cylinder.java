class Cylinder extends Circle
{
	private double height;
	double volume;
	Cylinder()
	{
		super();
		height=1;

	}
	Cylinder(double r,double h) {
		super(r);
		height=h;

	}
	public void setDimension(double a,double b)
	{
	super.setDimension(a);
	height=b;
	}
	public double getheight()
	{
		return height;

	}
	public double volume()
	{
		volume=3.14*getRadius()*getRadius()*height;
		return volume;
	}
	public void print()
	{
		System.out.print("Volume is:"+volume);
		}

}