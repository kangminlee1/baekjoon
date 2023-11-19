package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Set;

public class baekjoon5568 {
	
	public static int N, K;
	public static String[] arr;
	public static boolean[] visited;
	public static HashSet<String> set = new HashSet<>();
	
	public static void select(int num, String str) {
		if(num == K) {
			set.add(str);
			return;
		}
		for(int i = 0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				select(num+1, str + arr[i]);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());//카드 수
		K = Integer.parseInt(br.readLine());//조합할 카드 수
		arr = new String[N];
		visited = new boolean[N];
		
		for(int i =0; i<N; i++) {
			arr[i] = br.readLine();
		}		

		select(0, "");
		
		System.out.println(set.size());
	}

}
