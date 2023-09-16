package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		
		if(str.toString().equals(str.reverse().toString()))
		{			System.out.println(1);
		}
		else {
			System.out.println(0);
		}		
		br.close();
	}

}
	