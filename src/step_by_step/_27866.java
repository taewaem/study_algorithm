package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(str.charAt(n-1));
	}

}
