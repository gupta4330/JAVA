abstract class shape1{
double length;
double width;
//double base;
//double height;
shape1(double l, double w){
    length=l;
    width=w;
}

    abstract double area();

}
class rectangle extends shape1
{
    rectangle(double l,double w){
    super(l, w);
    }

    double area(){
    System.out.println("inside area for rectangle.");
    return length*width;
    }
}
   
    class triangle extends shape1{
    triangle(double b,double h){
    super(b, h);
    }

    double area(){
    System.out.println("inside area for triangle.");
    return 0.5*length*width;
    }
}
class display_area{
    public static void main(String args[])
    {
        shape1 s;
        rectangle r= new rectangle(8,9);
        triangle t=new triangle(6,7);
        s=r;
        r.area();
        s=t;
        t.area();
    }
}
    

    
