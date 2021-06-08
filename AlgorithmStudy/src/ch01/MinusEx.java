package ch01;

import java.util.Scanner;

public class MinusEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("b - a 의 값을 구합니다.");
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		System.out.print("a의 값: ");
		a = stdIn.nextInt();
		System.out.print("b의 값: ");
		b = stdIn.nextInt();
		while(b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");
			b = stdIn.nextInt();
		}
		
		int result = b - a;
		System.out.println("b-a는"+result+"입니다");

	}

}
