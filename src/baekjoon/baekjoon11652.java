package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;

public class baekjoon11652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Long, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		// HashMap에서 가장 큰 값을 가진 Index 리턴 
				int max = Integer.MIN_VALUE;
				long  answer = 0;
				for(long x: map.keySet()) {
					if(map.get(x) > max) {
						max = map.get(x);
						answer = x;
					} else if(map.get(x) == max) {
						answer = Math.min(answer, x);
					}	
				}
				
				System.out.println(answer);
	}

}
