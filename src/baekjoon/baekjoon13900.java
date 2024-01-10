package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon13900 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
//		long[] arr = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i = 0; i<N; i++) {
//			arr[i] = Long.parseLong(st.nextToken());
//		}
//		long sum = 0;
//		for(int i = 0; i<N; i++) {
//			for(int j = i+1; j<N; j++) {
//				sum += arr[i] * arr[j];
//			}
//		}
		//내가 생각 한 방법 이였음
		
		//이 방법은 B*(A) + C*(A+B)...+(n-1)*(A+B+C+...+n-2)+ n*(A+B+C+...+n-1)
		//이런 식으로 계산하여 O(n^2)아니라 O(n)이므로 더욱 빠름
		int n;
		long sum = 0;
		
		long[] arr = new long[N+1];
		long[] num_sum = new long[N+1];
		
		for(int i =1; i<=N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			num_sum[i] = arr[i] + num_sum[i-1]; 
		}
		for(int i = 2; i<=N; i++) {
			sum += arr[i] * num_sum[i-1];
		}
		
		
		System.out.println(sum);
	}

}
