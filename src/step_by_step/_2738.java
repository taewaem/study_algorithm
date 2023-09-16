	package step_by_step;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class _2738 {
		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
	
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
			StringTokenizer st = new StringTokenizer(br.readLine());
	
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
	
			int a[][] = new int[n][m];
			int b[][] = new int[n][m];
	
	
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
	
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					b[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					System.out.printf("%d ", a[i][j] + b[i][j]);
				}
			}
		}
	
	}
