package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon16503 {
	
	public static int calc(int N, String o, int M) {
		int result = 0;
		switch(o){
		case "+":
			result = N+M;
			break;
		case "*":
			result = N*M; 
			break;
		case "/":
			result = N/M;
			break;
		case "-":
			result = N-M;
			break;
			
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N1 = Integer.parseInt(st.nextToken());
		String calc1 =st.nextToken();
		int N2 = Integer.parseInt(st.nextToken());
		String calc2 = st.nextToken();
		int N3 = Integer.parseInt(st.nextToken());
		
		int result = 0;
		int total = 0;
		if(calc1.equals("*")) {
			result = N1 * N2;
			total = calc(result, calc2, N3);
			
		}else if(calc1.equals("/")) {
			result = N1 / N2;
			total = calc(result, calc2, N3);
			
		}else if(calc2.equals("*")) {
			result = N2*N3;
			total = calc(N1, calc1, result);
			
		}else if(calc2.equals("/")) {
			result = N2/N3;
			total = calc(N1, calc1, result);
			
		}
		else {
			total = calc(calc(N1,calc1,N2), calc2, N3);
		}
		System.out.println(total);
	}

}
