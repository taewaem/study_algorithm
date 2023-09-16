package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		//일의 자리 n%10
		//십의 자리 (n/10)%10
		//백의 자리 n%100
		int search =0;	
		
		for(int i=0; i<n; i++) {
			int sum =0;
			int num = i;
			
			while(num!=0) {
				sum += num % 10;
				num/=10;
			}
			
			if(sum + i == n) {
				search = i;
				break;
			}
		}
		
		System.out.println(search);
	}

}	
