package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;


public class baekjoon1337 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; i<N; i++)
			list.add(Integer.parseInt(br.readLine()));


		Collections.sort(list);
		//숫자를 정렬 해둠
		
		int count = 0;//겹치는 숫자 갯수
		int max = 0;//겹치는 숫자 최대 값 찾기

		for(int i = 0; i<N; i++) {
			count = 0;
			//정렬된 첫번쨰 숫자에서 1 2 3 4만큼 더해진 숫자가 존재하면 count 증가
			for(int j= list.get(i); j < list.get(i) + 5; j++) {
				if(list.contains(j) ) {
					count++;
				}
				max = Math.max(max, count);
			}
			
		}

		System.out.println(5-max);
	}

}
