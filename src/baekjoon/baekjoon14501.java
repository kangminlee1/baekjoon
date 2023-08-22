package baekjoon;

import java.util.Scanner;


public class baekjoon14501 {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int N= in.nextInt();
	
	int[] arrDate=new int[N];
	int[] arrPrice=new int[N];
	
	for(int i=0; i<N;i++) {
		arrDate[i]=in.nextInt();
		arrPrice[i]=in.nextInt();
	}
	
	int[] sum=new int[N+1];//N+1일 째 되는 날 퇴사하기 위해 N일 동안 최대한 많은 상담을 한 가격
	
	for(int i=0;i<N;i++) {
		if(i + arrDate[i]<=N) {
			sum[i + arrDate[i]] = Math.max(sum[i + arrDate[i]], sum[i] + arrPrice[i]);
		}
			sum[i+1]=Math.max(sum[i+1], sum[i]);
		//else로 해서 원하는 값이 안나와서 해맴
		
	}
	
	System.out.println(sum[N]);
	
		
	}

}
