package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int quarter = 0;
			int dime =0 ;
			int nickel =0;
			int penny =0;
			
			int price = Integer.parseInt(br.readLine());
			
			while(price!=0) {
				if(price>=25) {
					price -= 25;
					quarter++;
				}
				else if(price >=10) {
					price -= 10;
					dime++;
				}
				else if(price >= 5) {
					price -= 5;
					nickel++;
				}
				else if(price >= 1) {
					price -=1;
					penny++;
				}				
			}
			System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
		}
		
		br.close();
	}

}
