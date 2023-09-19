package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1978 {
	
	public static boolean isPrime(int M) {
		if(M==1) return false;
		
		for(int i =2; i<M;i++)
		{
			if(M%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(st.nextToken());
			
			if(isPrime(M))
				count++;
		}
		sb.append(count);
		System.out.println(sb);
	}

}
