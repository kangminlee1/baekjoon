package baekjoon;
//박 터뜨리기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon19939 {
	
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i =1; i<K+1; i++) {
			N -= i;
			if(N < 0) {//더 이상 공을 넣을 수 없다.
				break;
			}
		}
		
		if(N >= 0) {
			if(N%K > 0) {//나머지가 있을 경우 
				/*
				 예를 들어, 공은 10개, 바구니는 3개이다. 각 바구니에 1, 2, 3개의 공을 넣는다. 그럼 남은 공의 개수는 4개.
				 그럼 각 바구니에 1개 씩 분배 후 남은 한 개를 제일 개수가 많은 바구니에 넣는다
				 (그래야 공의 개수가 일치하는 수가 없으니까, 만약 공이 11개여서 
				 맨 마지막에 공이 2개가 남는다면, 두번째 세번째 바구니에 각각 하나씩 넣으면 된다.)
				 그렇게 되면 각 바구니는 2, 3, 5개의 공을 가지고 있고, 5 - 2는 3, 바구니의 개수와 같다.
				 */
				System.out.println(K);
			}else {
				/*
				 만약 공이 9개라면, 처음에 1, 2, 3개 분배, 각 바구니에 1개 씩 분배하면
				  2, 3, 4 개, 4 - 2 = 2 이므로 바구니 개수 - 1 과 같다.
				 */
				System.out.println(K-1);
			}
			
		}else {//음수 일 경우에는 공을 분배 불가
			System.out.println(-1);
		}
		
	}
}
