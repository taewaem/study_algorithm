package step_by_step;

import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int time = scanner.nextInt();
		
		if((minute +time) > 60) {
			hour = hour + ((minute +time)/60);
			if(hour == 24)
				hour = 0;
			minute = (minute +time) %60;
			System.out.printf("%d %d", hour, minute);
		}
		else {
			minute += time;
			System.out.printf("%d %d", hour, minute);
		}
	}

}
