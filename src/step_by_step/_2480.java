package step_by_step;

import java.util.Scanner;

public class _2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int cash =0;
		
		
		if(x == y && y == z) {
			cash = 10000+x*1000;
		}
		else if(x==y || x==z || y==z) {
			if(y==z)
				cash = 1000+y*100;
			else
				cash = 1000+x*100;
		}
		else {
			if(x > y && x>z)
				cash = x *100;
			else if(y >x && y>z)
				cash = y *100;
			else if(z>x && z> y)
				cash = z *100;
		}
		System.out.println(cash);
	}

}
