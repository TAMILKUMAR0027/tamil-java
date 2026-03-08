package TKSCJC;

interface Shapes{
	double default_value=1.0;
	double area();
	double perimeter();
	default String getDescription() { 
		return"A shape with unspecified dimensions.";
		}
}
 class Circle implements Shapes{
	private double radius;
	double PI=3.14;
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
		this.radius = default_value;
	}
	public double perimeter() {
		return 2*PI*radius;
	}
	public double area() {
		return PI*radius*radius;
	}
	public String getDescription() {
		return"A circle with radius "+ radius;
		}
}
class Rectangle implements Shapes{
	private double length;
	private double breadth;
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		this.length = default_value;
		this.breadth = default_value;
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public String getDescription() {
		return"A rectangle with length "+ length+" and breadth "+breadth;
		}
}
