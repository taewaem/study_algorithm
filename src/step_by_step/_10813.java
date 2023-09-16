package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10813 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int tmp;
		
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}

		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.hasMoreTokens()) {
				int j = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				
				tmp = arr[j-1];
				arr[j-1] = arr[k-1];
				arr[k-1] = tmp;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		br.close();
	}

}
