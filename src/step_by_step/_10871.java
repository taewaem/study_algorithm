package step_by_step;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class _10871 {

	public static void main(String[] args) { //throws IOException {
//		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int number = scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] < number) {
				System.out.println(arr[i] + " ");
			}
		
		}
		scanner.close();
	}
}	
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		int n = Integer.parseInt(br.readLine());
//		int number = Integer.parseInt(br.readLine());
//		int arr[] = new int[n];
//		
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		for(int j=0; j<arr.length; j++) {
//			if(arr[j] < number) {
//				System.out.println(arr[j]);
//			}
//		}
//	}	
//

