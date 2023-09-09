package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.HashSet;

public class baekjoon11478 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<=str.length();i++) {
			for(int j=i+1; j<=str.length();j++) {
				if(!set.contains(str.substring(i, j))) {
					set.add(str.substring(i, j));
				}
			}
		}
		
		System.out.println(set.size());
	}

}
