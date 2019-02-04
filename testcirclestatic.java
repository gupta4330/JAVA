class CircleStatic {
	private double radius;

	private static int numberofobjects = 0;

	public void setradius(double a)
{
	radius=a;
	numberofobjects++;
}
public double getradius(){
	return radius;
}
public static int getnumberofobject()
{
	return numberofobject;
}
public void findarea()
{
	return numberofobject;
}
public void findarea()
{
	double area;
	area=3.14*radius*radius;
	System.out.println("the area is" +area);
}
}
public class testcirclestatic{
public static void main(String arghs[]){
	circlestatic circle=new circlestatic();
	System.out.print("circle1 information");
	circle1.setradius(5);
system.out.print("circle1 radius"=circle1.getradius());
System.out.println("the no.of circle object " = circlestatic.getnumberofobject());
circlestatic circle2=new circlestatic();
circle1.findarea();
circle2.setradius(5);
System.out.print("circle radius" +circle2.getradius());
System.out.print("the number of circle objects" +circlestatic.getnumberofobjects());
circle2.findarea();
}
}