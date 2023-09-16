package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9063 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int min_x =999999, max_x=-999999, min_y=999999, max_y=-999999;
		int area;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x =Integer.parseInt(st.nextToken());
			int y =Integer.parseInt(st.nextToken());
			
			if(min_x > x)
				min_x =x;
			if(max_x < x)
				max_x = x;
			if(min_y > y)
				min_y = y;
			if(max_y < y)
				max_y = y;
		}
		
		if(n == 1)
			area = 0;
		else
			area = (max_x - min_x) * (max_y - min_y);
		
		System.out.println(area);
	}

}
