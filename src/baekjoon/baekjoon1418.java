package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1418 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		int count = 0;
		for(int i = 1; i<=N;i++) {//N보다 작거나 같은 자연수
			int max = 0;
			int now = i;
			
			for(int j = 2; j <=Math.sqrt(i);) {//해당 자연수의 소인수를 찾고 최대값을 찾을 것
				
				if(now%j==0) {//j가 소인수일 경우
					now /= j;
					max = j;
				}
				else {//나눠지지 않으면 j ++
					j++;
				}
			}
			if(now != 1) {//반복문이 끝나고 값이 1이 아니면 현재 값 최댓값에 저장
				max = now;
			}
			
			if(max <= K) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
