package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[100][100];
		int i=0;
		int area = 0;
		
		while(i<n){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			int length = Integer.parseInt(st.nextToken());
			
			for(int j=width; j<width+10; j++) {
				for(int k = length; k<length+10; k++) {
					if(arr[j][k] == 1)
						continue;
					arr[j][k] = 1;
					area += 1;
				}
			}
			i++;
		}
		
		br.close();
		System.out.println(area);
	}

}
