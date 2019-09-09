/*
 Noel Lkhagvatsogt 8/29/19
 Period 3
 This code calculates things from Access Calculate
 */
public class Calculate {
	//A call to square returns the square of the input. The method accepts an integer and returns an integer
	public static int square(int num) {
		int sum = num * num;
		return sum;
	}
	
	//A call to cube returns the cube of the input. The method accepts an integer and returns an integer.
	public static int cube(int num) {
		int sum = num * num * num;
		return sum;
	}
	
	//A call to average returns the average of 2 inputs.
	//The method accepts 2 doubles and returns a double.
	public static double average(double num1, double num2) {
		double avg = (num1 + num2)/2;
		return avg;
	}
	
	//A call to average returns the average of 3 inputs.
	//The method accepts 3 doubles and returns a double.
	public static double average(double num1, double num2, double num3) {
		double avg = (num1 + num2 + num3)/3;
		return avg;
	}
	
	//A call to toDegrees converts and returns radians to degrees
	//The method accepts a double and returns a double.
	public static double toDegrees(double radians) {
		double degrees = radians * 57.2958;//57.2958 is equal to 180/pi
		return degrees;
	}
	
	//A call to toRadians converts and returns degrees to radians
	//The method accepts a double and returns a double
	public static double toRadians(double degrees) {
		double radians = degrees * 0.01745;//0.01745 is equal to pi/180
		return radians;
	}
	
	//A call to discriminant returns the discriminant of the inputs.
	//Accepts 3 doubles as the coefficients a, b, and c. Returns a double.
	public static double discriminant(double a, double b, double c) {
		double disc = (b*b) - 4 * a * c;
		return disc;	
	}
	
	//A call to toImproperFrac converts and returns a mixed number into an improper fraction
	//Accepts 3 integers, the whole number, the numerator, and the denominator, and returns a string
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int mixedNumerator = (whole * denominator) + numerator;
		return mixedNumerator + "/"+ denominator;
	}
	
	//a call to toMixedNum converts and returns an improper fraction into a mixed number
	//Accepts 2 integers, numerator and denominator, and returns a string
	public static String toMixedNum(int numerator, int denominator) {
		int mixedNumberWhole = numerator/denominator;
		int mixedNumberNumerator = numerator - (mixedNumberWhole*denominator);
		return (mixedNumberWhole + "  " + mixedNumberNumerator + "/" + denominator);
	}
	
	//a call to foil converts and returns a binomial to quadratic form
	//Accepts four integers and a string from (ax+b)(cx+d) as (int a, int b, int c, int d, "x")
	//returns a string in the quadratic form
	public static String foil(int a, int b, int c, int d, String x) {
		int firstTerm = a * c;
		int secondTerm = (a * d) + (c * b);
		int thirdTerm = b * d;
		return firstTerm + x + "^2 + " + "(" + secondTerm + x +") + (" + thirdTerm + ")";
	}
	
	
	
	
	
	
	
}
	
	