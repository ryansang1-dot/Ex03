
public class Calc {
	
	public static void main( ) {
		int	birthYear = 1995;
		int	thisYear  = 2026;
		int age		  = thisYear - birthYear;
		System.out.printf("당신은 %d살입니다.", age);
		birthYear = 1800;
		thisYear  = 2026;
		int age		  = thisYear - birthYear;
		System.out.printf("당신은 %d살입니다.", age);
	}
}
