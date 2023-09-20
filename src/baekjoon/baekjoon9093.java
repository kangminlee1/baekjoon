package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon9093 {
	//이 문제는 sb.reverse를 사용하는 것은 알았지만 문자열로 받고 그 문자를 배열에 저장하여 틀렸음
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				StringBuffer sb2 = new StringBuffer(st.nextToken());
				sb.append(sb2.reverse()).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
