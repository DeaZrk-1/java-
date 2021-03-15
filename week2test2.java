package test2;

import java.util.Scanner;

public class week2test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i, j, m;
		System.out.println("Enter n");
		n = scanner.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (m = 0; m < i; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}