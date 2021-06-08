package ch01;

import java.util.Scanner;

public class SumOf {
	static int sumof(int a, int b) {
		int sum = 0;
		int max = 0;
		int min = 0;
		if(a > b) {
			max = a;
			min = b;
		} else if(b > a) {
			max = b;
			min = a;
		} else{
			return a;
		}
		while(min <= max) {
			sum += min;
			min++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a와 b사이의 모든 정수의 합을 구합니다.");
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.println("a와 b사이의 모든 정수의 합은 "+sumof(a,b)+"입니다.");

	}

}
