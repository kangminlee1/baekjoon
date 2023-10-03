package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashMap;

public class baekjoon17219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<String, String> map = new HashMap<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i =0; i<N;i++) {
			st = new StringTokenizer(br.readLine());

			String str = st.nextToken();
			String password = st.nextToken();
			
			map.put(str, password);
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());

			String str = st.nextToken();
			
			sb.append(map.get(str)).append("\n");
		}
		System.out.println(sb);
	}

}
