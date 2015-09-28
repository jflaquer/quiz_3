

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void setSide3(double side3){
		this.side3 = side3;
	}
	

	@Override
	public double getArea() {
		double semiper = (getPerimeter())/2;
		double a = side1;
		double b = side2;
		double c = side3;
		double x = (semiper)*(semiper-a)*(semiper-b)*(semiper-c);
		return Math.sqrt(x);
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString(){
		return ("This triangle has side lengths of a= "+side1+", b= "+side2+", c= "+side3+". The area is: "+getArea()+" and the perimeter is: "+getPerimeter());
	}
}
