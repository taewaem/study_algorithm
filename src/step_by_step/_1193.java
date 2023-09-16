package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int cross = 1, prev = 0;
		
		while(true)	{
			if(x <= prev + cross) {
				
				if(cross % 2 == 1) {
					System.out.print((cross - (x - prev - 1)) + "/" + (x - prev));
					break;
				}
				else{
					System.out.println((x-prev)+"/"+(cross-(x-prev-1)));
					break;
				}
			}
			else {
				prev += cross;
				cross++;
			}	
		}
		
		br.close();
	}

}
