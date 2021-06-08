package ch01;

public class MinNum3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		return min;
	}

	public static void main(String[] args) {
		System.out.println(min3(1,2,3));
		System.out.println(min3(4,2,3));
		System.out.println(min3(20,22,13));

	}

}
