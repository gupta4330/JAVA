class Rectangle extends Shape{

	Rectangle(double a, double b){

		super(a,b);

	}
	public double area(){
		double area;
		area = a*b;
		return area;
	}
	void display_area(){
		System.out.println("The area is "+area());
	}
}

