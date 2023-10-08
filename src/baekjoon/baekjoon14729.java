package baekjoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Collections;
import java.util.ArrayList;

public class baekjoon14729 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double N = Integer.parseInt(br.readLine());
		ArrayList<Double> list = new ArrayList<>();
		
		
		for(int i = 0; i<N; i++) {
			double num = Double.parseDouble(br.readLine());
			
			if(list.size() >= 7) {//메모리 제한이 이 256MB이므로 7개까지만 담아둠
				for(int j=0; j < list.size(); j++) {//정렬된 값 비교
					if(list.get(j) >= num ) {//정렬된 값이 새로운 값보다 크거나 같으면
						list.remove(list.size()-1);
						list.add(num);
						break;//값을 바꾸고 반복문 종료
					}
				}
			}
			
			else {
				list.add(num);
			}
			Collections.sort(list);//값을 계속 정렬함.
		}
		
		StringBuffer sb = new StringBuffer();
		for(double i : list) {
			sb.append(String.format("%.3f\n", i));
		}
		System.out.println(sb);
	}

}


