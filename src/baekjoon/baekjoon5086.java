package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon5086 {
	
	public static StringBuffer sb = new StringBuffer();

	public static String what(int N, int M) {
		
		if(N%M==0) {
			return "multiple";
		}
		else if(M%N==0) {
			return "factor";
		}else {
			return "neither";
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(N==0&&M==0) {
				break;
			}
			sb.append(what(N,M)).append("\n");
		}
		System.out.println(sb);
	}

}
