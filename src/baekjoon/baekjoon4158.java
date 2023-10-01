package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
//import java.util.HashMap;
import java.util.HashSet;

public class baekjoon4158 {
	
	public static HashSet<Integer> set;
	public static StringBuffer sb = new StringBuffer();
	public static int sun;
	public static int sang;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine());

		sang= Integer.parseInt(st.nextToken());
		sun = Integer.parseInt(st.nextToken());
		
		if(sang == 0 && sun == 0) {
			break;
		}
		
		set = new HashSet<>();
		
		for(int i=0; i<sang; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		int count = 0;
		for(int i=0; i<sun; i++) {
			int CD = Integer.parseInt(br.readLine());
			if(set.contains(CD)) {
				count++;
			}
		}
		sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}
