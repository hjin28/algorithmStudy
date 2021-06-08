package ch01;

import java.util.Scanner;

public class MaxNum3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		int max = a ;
		if(b > max) 
			max = b;
		if(c > max)
			max = c;
		
		System.out.println("가장 큰 값은 "+max+" 입니다.");
		

	}

}
