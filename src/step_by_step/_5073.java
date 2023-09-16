package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5073 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(true){     
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());

        if(x == 0 && y==0 && z==0)
        {
            break;
        }   
        int max = x;
   
        if(max < y){
            max = y;
        }
        if(max < z)
            max = z;
    
         if(max >= x+z+y - max){
             System.out.println("Invalid");
         }
		 else if(x == y && y == z ){
         System.out.println("Equilateral");
         }
         else if(x==y || y==z || x==z){
             System.out.println("Isosceles");
         }
         else{
            System.out.println("Scalene");
         }
        }
     
	}

}
