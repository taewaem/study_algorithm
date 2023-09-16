package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1546 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double arr[] = new double[n];
		double max = -1;
		double avg = 0.0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			if(arr[i] > max)
				max = arr[i];
		}
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (arr[i]/max)*100;
			avg += arr[i];
		}
		System.out.println(avg/n);
		br.close();
	}

}
