package ch01;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		System.out.println("1부터 n까지의 합을 구합니다.");
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의값:");
		int n = stdIn.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n;i++) {
			System.out.print(i);
			sum += i;
			if(i < n) {
				System.out.print(" + ");
			} else{
				System.out.print(" = ");
			}
		}
		
		System.out.print(sum);

	}

}
