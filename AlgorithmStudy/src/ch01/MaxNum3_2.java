package ch01;

public class MaxNum3_2 {
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		return max;
	}

	public static void main(String[] args) {		
		System.out.println("max3(3,2,1)의 결과: "+ max3(3,2,1));
		System.out.println("max3(3,2,2)의 결과: "+ max3(3,2,2));
		System.out.println("max3(3,1,2)의 결과: "+ max3(3,1,2));
		System.out.println("max3(3,2,3)의 결과: "+ max3(3,2,3));
		System.out.println("max3(2,1,3)의 결과: "+ max3(2,1,3));
		System.out.println("max3(3,3,2)의 결과: "+ max3(3,3,2));
		System.out.println("max3(3,3,3)의 결과: "+ max3(3,3,3));
		System.out.println("max3(2,2,3)의 결과: "+ max3(2,2,3));
		System.out.println("max3(2,3,1)의 결과: "+ max3(2,3,1));
		System.out.println("max3(2,3,2)의 결과: "+ max3(2,3,2));
		System.out.println("max3(1,3,2)의 결과: "+ max3(1,3,2));
		System.out.println("max3(2,3,3)의 결과: "+ max3(2,3,3));
		System.out.println("max3(1,2,3)의 결과: "+ max3(1,2,3));
	}

}
