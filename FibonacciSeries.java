package week1.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, inputRange = 8, Fibonaccivalue = 0;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = num1; i < inputRange - 2; i++) {

			Fibonaccivalue = num1 + num2;
			num1 = num2;
			num2 = Fibonaccivalue;

			System.out.println(Fibonaccivalue);

		}

	}

}
