package step_by_step;

import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println((a*((b%100) - (b%10))/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		scanner.close();
	}

}
