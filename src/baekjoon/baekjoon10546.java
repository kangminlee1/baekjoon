package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;

public class baekjoon10546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i =0; i<N; i++) {
			String key = br.readLine();
			
			if(map.get(key) == null) {
				map.put(key, 1);
			}else {
				map.put(key, map.get(key) + 1);//동명 이인
			}
			
		}
		
		for(int i = 0; i<N-1; i++) {
			String key = br.readLine();
			map.put(key,  map.get(key) -1);//완주 한 사람 
		}

		for(String key : map.keySet()) {
			if(map.get(key) != 0) {//0이 아니면 완주하지 못한 사람
				System.out.println(key);
				break;
			}
		}

	}

}
