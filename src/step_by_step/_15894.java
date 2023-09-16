package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15894 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Long n = Long.parseLong(br.readLine());
		
		Long area;
		
		area = 4+(4*(n-1));
				
		System.out.println(area);
	}

}
