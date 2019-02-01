class  Tringle extends Shape{

  Tringle (double a, double b){

		super(a,b);

	}
	public double area(){
		double area;
		area = 0.5*a*b;
		return area;
	}
	void display_area(){
		System.out.println("The area is "+area());
	}
}

