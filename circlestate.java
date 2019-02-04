interface geometricobjects
{
	double getperimeter();
	double getarea();
} 
class circle implements geometricobjects
{
double radius=1;
	circle(double radius)
	{
	this.radius=radius;
	}
	double getperimeter()
	{
	return 2*3.14*radius;
	}
    double getarea()
    {
    return 3.14*radius*radius;
    }
    }
    interface resizable
    {
    void resize(int percent);
    }
    class resizablecircle extends circle implements resizable
    {
    resizablecircle(double radius){
    this.radius=radius;}
    void resize(int percent){
    radius=radius*percent/100;
    }
    }
    class circlestate
    {
    public static void main(String[] args){
    	double num1,num2;
    resizablecircle c= new resizablecircle(20);
    num1=c.getperimeter();
    num2=c.getarea();
    c.resize();
    }
    }    