package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1246 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());//겨란
		int M = Integer.parseInt(st.nextToken());//잠재적 구매자
		
		int[] price = new int[M];
		int[] sum = new int[M];
		
		for(int i =0; i< M; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(price);
		
		for(int i = 0; i<M; i++) {
			if(M > N) {//계란보다 사려는 사람이 많을 경우
				if(i<(M-N+1)){//계란을 모두 판매하는 경우 -> ex) N=4 M=6 이면
					//i가 0,1,2일 때는 계란의 수만큼 곱하면 됨
					//i가 3을 넘게 되면 3,4,5 3개 밖에 팔수 없음
					sum[i] = price[i] * N;
				}else {//계란을 일부 판매하는 경우
					sum[i] = price[i] * (M-i);
				}
			} else {
				sum[i] = price[i] * (M-i);
				//정렬해 뒀으므로 가장 낮은 금액부터
				//순서대로 M-i한 만큼 곱하면 사려는 사람들의 수의 최대값을 구할 수 있음
			}
		}
		int max = sum[0];
		int count = 0;
		
		for(int i =0; i<sum.length; i++) {
			if(max<sum[i]) {
				max = sum[i];
				count = price[i];
			}
//			max = Math.max(max, sum[i]);
		}
		System.out.println(count+ " " + max);
	}

}
