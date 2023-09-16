package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10807 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int search = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		br.close();
		
		
		
	}

}
