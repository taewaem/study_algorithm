package step_by_step;

import java.util.Scanner;

public class _25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int total_price = scanner.nextInt();
		int n = scanner.nextInt();
		int sum =0;
		
		for(int i=0; i<n; i++) {
			int product = scanner.nextInt();
			int price = scanner.nextInt();
			
			sum += product *price;
		}
		
		if(sum == total_price)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		scanner.close();
		
	}

}
