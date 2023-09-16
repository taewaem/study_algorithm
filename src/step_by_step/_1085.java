	package step_by_step;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class _1085 {
	
		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
	
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			int xcount = Math.min((w - x), x);
			int ycount = Math.min((h - y), y);
			
			System.out.println(Math.min(xcount, ycount));
			
			br.close();
		}
	}
