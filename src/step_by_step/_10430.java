package step_by_step;

import java.util.Scanner;

public class _10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println( (A*B)%C );
		System.out.println(((A%C)*(B%C))%C);
		
		scanner.close();
	}

}
