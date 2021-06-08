package ch01;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int num;
		System.out.print("입력: ");
		num = stdIn.nextInt();
		while(num < 0) {
			System.out.println("양의 정수를 입력하세요");
			System.out.print("입력: ");
			num = stdIn.nextInt();
		}
		
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}

		System.out.println("그 수는 "+count+"자리입니다.");
		
	}

}
