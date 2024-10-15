package week1.homeassignments;

public class CheckNumberisPrimeOrNot {

	public static void main(String[] args) {

		int n = 13;
		boolean flag = true;
		for (int i = 2; i < n - 1; i++) {

			if (n % i == 0) {
				flag = false;
				break;
			}

		}
		if (!flag)
			System.out.println("The number " + n + " is not a Prime number");
		else
			System.out.println("The number " + n + " is Prime number");
	}

}
