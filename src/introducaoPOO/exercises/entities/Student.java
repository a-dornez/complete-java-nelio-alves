package introducaoPOO.exercises.entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double finalGrade;
	public final double MININUM_PASSING_GRADE = 60;
	
	public double FinalGrade() {
		return finalGrade = grade1 + grade2 + grade3;
	}
	
	public String toString() {
		if ( finalGrade > MININUM_PASSING_GRADE) {
			return "Final Grade: " + finalGrade
					+ "\nPASSED";
		}
		else {
			return "Final Grade: " + finalGrade
					+ "\nFAILED"
					+ "\nMissing Points: "
					+ (MININUM_PASSING_GRADE - finalGrade);
		}
	}

}
