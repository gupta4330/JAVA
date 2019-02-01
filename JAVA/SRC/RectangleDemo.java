class Shape{
	public void display(){
		System.out.println("Shape is rectangle");
	}
	public void IncreaseLength(){
		System.out.println("The lenght is increased");
	}

}
class Rectangle extends Shape{
	public void display(){
		System.out.println("Rectangle");
	}
	public void IncreaseLength(){
		System.out.println("Length is increased");
	}
	}
	class RectangleDemo{
		public static void main(String[] args) {
			Shape s;
			s = new Rectangle();
			//s.display();
			Rectangle c = (Rectangle) s;
			c.IncreaseLength();
			c.display();
			//s.IncreasedLength();
		}
	}