package ch01;

import java.util.Scanner;

public class PrintRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: ");
		int n = stdIn.nextInt();
		for(int i = 0; i < n ; i++) {
			for(int j=0; j <n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
