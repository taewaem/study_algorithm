
package step_by_step;

import java.util.Scanner;

public class _9498 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
