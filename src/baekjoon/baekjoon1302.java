package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;

public class baekjoon1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N;i++) {
			String str = br.readLine();
			map.put(str, map.getOrDefault(str, 0)+1);
			
		}
		
		int max = Integer.MIN_VALUE;
		String best = "";

		for(String str : map.keySet()) {
			if(map.get(str) > max) {
				max = map.get(str);
				best = str;
			}else if(map.get(str)==max) {
				if(best.compareTo(str) > str.compareTo(best)) {
					best = str;
				}
			}
		}
		System.out.println(best);
	}

}
