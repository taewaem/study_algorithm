package step_by_step;

import java.util.Scanner;

public class _2739 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<10; i++){
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		
		scanner.close();
	}
}
