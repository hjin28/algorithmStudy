package ch01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int num;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력: ");
			num = stdIn.nextInt();
		}while(num <10 || num >99);
		
		System.out.println("변수 num의 값은 "+num+"이(가) 되었습니다.");

	}

}
