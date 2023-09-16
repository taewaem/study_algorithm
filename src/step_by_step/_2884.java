package step_by_step;

import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute= scanner.nextInt();
		 	
		if(minute < 45) 
		{
			if(hour == 0)
				hour = 24;
			hour = hour - 1;
			minute = minute + 60 - 45;
			System.out.printf("%d %d", hour, minute);
		}
		else 
		{
			minute = minute - 45;
			System.out.printf("%d %d", hour, minute);
		}
	}
}
