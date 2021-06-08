package ch01;

import java.util.Scanner;

public class GaussSum {
	
	static int gaussSum(int n) {
		int sum = (1 + n) * (n/2) + ((n%2)==0 ? 0: (n+1)/2);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 n까지의 합을 구합니다.");
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		System.out.println("1부터 n까지의 합은 "+gaussSum(n)+"입니다.");

	}

}
