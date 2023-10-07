package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class baekjoon10867 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<>(); 
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i =0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(list.contains(num)) {
				continue;
			}else {
				list.add(num);
			}
		}
		Collections.sort(list);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		
		System.out.println(sb);

	}

}
