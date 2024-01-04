package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashSet;

public class baekjoon26029 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> dancer = new HashSet<>();
		dancer.add("ChongChong");
		
		int N = Integer.parseInt(br.readLine());		

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String first = st.nextToken();
			String second = st.nextToken();

			if(dancer.contains(first) || dancer.contains(second)) {
				dancer.add(first);
				dancer.add(second);
			}
		}
		System.out.println(dancer.size());
	}

}
