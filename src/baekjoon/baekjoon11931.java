package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Collections;
import java.util.ArrayList;

public class baekjoon11931 {
//sb.reverse로 풀었다가 리스트를 내림차순으로 저장하는 방법 발견
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		StringBuffer sb = new StringBuffer();
		for(int i  =0 ; i<N ; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list, Collections.reverseOrder());//내림차순 정렬 방법

		for(int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
