class DemoCylinder{
	public static void main(String args[])
	{
	Cylinder mycylinder1=new Cylinder(10.0,20.0);
	Cylinder mycylinder2=new Cylinder();
	double volume;
	volume=mycylinder1.volume();
	System.out.print("The volume is:"+volume);
	mycylinder1.print();
	volume=mycylinder2.volume();
	System.out.print("The volume is:"+volume);
	mycylinder2.print();

}
}