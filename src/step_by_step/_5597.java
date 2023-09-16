package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[30];
		
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n-1] = n;
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] == 0)
				System.out.println(j+1);
		}
		br.close();
	}

}
