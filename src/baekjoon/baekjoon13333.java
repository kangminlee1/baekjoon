package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon13333 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list);

		for(int i =N; i>=0; i--) {
			int count = 0;
			
			for(int j=0; j<N; j++) {
				if(list.get(j)>=i) {
					count++;
				}
			}
			
			if(count >= i) {
				System.out.println(i);
				return;
			}
		}
	}

}

/*
 for(int i =0; i<list.size(); i++) {
			int k = list.get(i);
			for(int j = i; j<list.size(); j++) {
				int count = list.size() - j;
				if(N-k <= count &&  k <= count ) {
					q_index = k;
					break;
				}
			}
			
		}
 */
