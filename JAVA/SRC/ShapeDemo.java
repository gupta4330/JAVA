class ShapeDemo{
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(10,20);
		Triangle T1 = new Triangle(10, 20);
		Shape s;
		s.area();
		s.display_area();
		s=T1;
		s.area();
		s.diaplay_area();
	}
}