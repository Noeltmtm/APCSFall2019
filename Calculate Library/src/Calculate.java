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
	
	//A call to idDivisibleBy determines if one integer is evenly divisible by another
	//This method accepts 2 integers and returns a boolean
	public static boolean isDivisibleBy (int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException("denominator cannot be 0");
		}
		boolean divisible = false;
		if (numerator % denominator == 0) {
			divisible = true;
			return divisible;
		} else {
			return divisible;
		}
	}
	
	//A call to absValue returns the absolute value of the number passed
	//This method accepts a double and returns a double
	public static double absValue (double num) {
		if (num < 0) {
			return num * -1;
		}else {
			return num;
		}
	}
	
	//A call to max returns the larger of the variables passed.
	//The method accepts 2 doubles and returns a double
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	//A call to max returns the larger of the variable passed.
	//The method accepts 3 doubles and returns a double.
	public static double max (double a, double b, double c) {
		if (a >= b && a >= c) {
			return a;
		} else if(b >= a && b >= c) {
			return b;
		}else {
			return c;
		}
	}
	
	//A call to min returns the smaller of the values passed.
	//The method accepts 2 integers and returns a int.
	public static int min (int a, int b) {
		if (a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	//A call to round2 rounds a double correctly to 2 decimal places
	//The method accepts a double and returns a double.
	public static double round2 (double num) {
		if(num >= 0) {
			num = (num * 100) + 0.5;
			num = (int) num;
			return num/100;
		}else {
			num = (num * 100) 
					- 0.5;
			num = (int) num;
			return num/100;
		}
	}
	
	//A call to exponent raises a value to a positive integer power
	//The method accepts a double and an integer and returns a double
	public static double exponent(double number, int exponent) {
		if (exponent < 1) {
			throw new IllegalArgumentException("exponent cannot be less than 1");
		}
		double value = number;
		for(int i = 1; i < exponent; i++) {
			value = value * number;
		}
		return value;
	}
	
	//A call to factorial returns the factorial of the value passed.
	//The method accepts an integer and returns an integer.
	public static int factorial(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("integer cannot be negative");
		}
		int value = num;
		for (int i = num - 1; i > 0; i--) {
			value = value * i;
		}
		return value;
	}
	
	//A call to isPrime determines if an integer is prime.
	//The method accepts an integer and returns a boolean.
	public static boolean isPrime(int num) {
		boolean prime = true;
		int test  = 2;
		while(test < num) {
			if (test % num == 0) {
				prime = false;
				return prime;
			}
			test++;
		}
		return prime;
	}
	
	//A call to gcf finds the greatest common factor of two integers.
	//The method accepts two positive integers and returns an integer.
	public static int gcf(int a, int b) {
		int test = 1;
		int gcf = 1;
		while (test <= a && test <= b) {
			if (a % test == 0 && b % test == 0) {
				gcf = test;
			}
			test++;
		}
		return gcf;
	}
	
	//A call to sqrt returns an approximation of the square root of the value passed, rounded to 2 decimal places.
	//Method accepts a double and returns a double.
	public static double sqrt (double num) {
		if(num < 0) {
			throw new IllegalArgumentException("cannot find square root of negative");
		}
		double guess = 1.0;
		while (Calculate.absValue(guess*guess - num) > 0.005) {
			guess = (num/guess + guess)/2;
		}
		guess = Calculate.round2(guess);
		return guess;
	} 
	
	//A call to quadForm uses coefficients of a quadratic in standard form and uses quadratic formula to approximate the real roots, if any.
	//Method accepts 3 integers and returns a string  
	public static String quadForm(int a, int b, int c) {
		if (Calculate.discriminant(a, b, c) < 0){
			return "no real roots";
		}
		
		double root1 = (-b + Calculate.sqrt(Calculate.square(b) - 4*a*c))/(2*a);
		double root2 = (-b - Calculate.sqrt(Calculate.square(b) - 4*a*c))/(2*a);
		if (root1 == root2) {
			root1 = Calculate.round2(root1);
			return "" + root1;
		}else {
			root1 = Calculate.round2(root1);
			root2 = Calculate.round2(root2 );
			return root1 + " and " + root2;
		}
	}
	 
	
}
		
	
	
	
	


	
	