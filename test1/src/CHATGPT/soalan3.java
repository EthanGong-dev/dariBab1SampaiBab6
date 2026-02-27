package CHATGPT;

class Shape {
	String color;
	boolean isFilled;
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
}

class Circle extends Shape {
	double radius;
	
	public Circle (String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
}

public class soalan3 {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle("red", true, 3.15);
		System.out.println("warna: " + c1.color + "\ndiisi?: " + c1.isFilled + "\nradius:" + c1.radius);
		
	}
}
