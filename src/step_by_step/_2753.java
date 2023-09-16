package step_by_step;

import java.util.Scanner;

public class _2753 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(year%4 == 0 && year%100!=0)
			System.out.println("1");
		else if(year%400 == 0)
			System.out.println("1");
		else 
			System.out.println("0");
	}

}
