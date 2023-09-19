package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class baekjoon1402 {
	
	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		while(testCase-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				sb.append("yes").append("\n");	
		}
		System.out.println(sb);
		

	}

}
