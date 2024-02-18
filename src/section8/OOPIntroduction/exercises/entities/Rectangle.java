package section8.OOPIntroduction.exercises.entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		
		return ( 2 * width ) + ( 2 * height );
	}
	
	public double Diagonal () {
		
		return Math.sqrt( (width * width) + (height * height) );
	}
}
