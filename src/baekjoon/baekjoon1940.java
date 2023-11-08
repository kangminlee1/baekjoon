package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class baekjoon1940 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//재료 수
		int M = Integer.parseInt(br.readLine());//갑옷 만드는 데 필요한 수
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0;i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for(int i =0;i <N; i++) {
			for(int j= N-1; j>i;j--) {
				if(arr[i]+arr[j]==M) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
