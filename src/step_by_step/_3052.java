package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[10];
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n % 42;
		}
		for(int i=0; i<arr.length; i++) 
		{
			int count = 0;
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i] == arr[j])
				{
					count++; 
				}
			}
			if(count == 0)
				result++;
		}
		System.out.println(result);
		br.close();
	}

}
