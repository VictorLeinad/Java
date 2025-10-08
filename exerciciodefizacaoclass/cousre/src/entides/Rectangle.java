package entides;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double area () {
		return width * heigth;
	}
	
	public double perimeter() {
		return  2 * (width + heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width,2) + Math.pow(heigth,2));
	}
	
	public String toString() {
		return "Area = " + String.format("%.2f %n", area()) 
				+ "PERIMETER = " + String.format("%.2f %n", perimeter())
				+ "DIAGONAL = " + String.format("%.2f %n", diagonal()); 
	}
	
}
