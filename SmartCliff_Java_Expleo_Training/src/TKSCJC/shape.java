package TKSCJC;

public abstract class shape {
	void draw() {
		System.out.println("Drawing...");
	}
	public abstract void area();
	public abstract void perimeter();
}
 class rectangle extends shape{
	private int len;
	private int bre;
	public rectangle(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}
	@Override
	public void area() {
		System.out.println("Area of rectangle : "+len*bre);
	}
	@Override
	public void perimeter() {
		System.out.println("Perimeter of rectangle : "+(2*(len+bre)));
	}
}
class square extends shape{
	private int side;

	public square(int side) {
		this.side = side;
	}
	@Override
	public void area() {
		System.out.println("Area of Square : "+side*side);
	}
	public void perimeter() {
		System.out.println("Perimeter of square : "+4*side);
	}
	
}
class circle extends shape{
	private int radius;
    double pi=3.14;
	public circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
		System.out.println("Area of circle : "+(pi*radius*radius));
	}
	public void perimeter() {
		System.out.println("Perimeter of circle : "+2*pi*radius);
	}
}
