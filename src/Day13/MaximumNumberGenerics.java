package Day13;

import java.util.Scanner;

public class MaximumNumberGenerics {

	public static <T extends Comparable<T>> T genericMax(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Integer No.: ");
		System.out.println("Greatest Integer No.:" + genericMax(sc.nextInt(), sc.nextInt(), sc.nextInt()));

	}
}
