package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashSet;

public class baekjoon11723 {
	
	public static HashSet<Integer> set = new HashSet<>();
	
	public static void add(int x) {
		if(set.contains(x)) {
			return;
		}
		set.add(x);
	}
	
	public static void remove(int x) {
		if(set.contains(x)) {
			set.remove(x);
		}
	}
	public static int check(int x) {
		if(set.contains(x)) {
			return 1;
		}
		
		return 0;
	}
	public static void toggle(int x) {
		if(set.contains(x)) {
			set.remove(x);
		}
		set.add(x);
	}
	public static void all() {
		set.clear();
		for(int i =1; i<=20; i++) {
			set.add(i);
		}
	}
	public static void empty() {
		set.clear();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<M;i++) {
			String str = st.nextToken();
			
			if(str.equals("add")) {
				add(Integer.parseInt(br.readLine()));
			}
			else if(str.equals("check")) {
				sb.append(check(Integer.parseInt(br.readLine()))).append("\n") ;
			}
			else if(str.equals("remove")) {
				remove(Integer.parseInt(br.readLine()));
			}
			else if(str.equals("toggle")) {
				toggle(Integer.parseInt(br.readLine()));
			}
			else if(str.equals("all")) {
				all();
			}
			else if(str.equals("empty")) {
				empty();
			}
		}
		
		System.out.println(sb);
		
	}

}
