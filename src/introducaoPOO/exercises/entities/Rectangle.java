package introducaoPOO.exercises.entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area( double width, double height ) {
		this.width = width;
		this.height = height;
		
		double area = width * height;
		return area;
	}
	
	public double Perimeter ( double width, double height ) {
		this.width = width;
		this.height = height;
		
		double perimeter = ( 2 * width ) + ( 2 * height );
		return perimeter;
	}
	
	public double Diagonal ( double width, double height ) {
		this.width = width;
		this.height = height;
		
		double diagonal = Math.sqrt( (width * width) + (height * height) );
		return diagonal;
	}
}
