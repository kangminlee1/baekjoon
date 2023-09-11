package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1312 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for(int i=0;i<N;i++) {
			A= A%B *10;//나누고 남은 나머지에 10을 곱해 다시 나누는 것 반복
			result = A/B;			//내가 구해야 할 값은 N번째 몫이기 때문에 몫은 따로 저장해준다
		}
		
	}

}

/*
double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		double ans = A/B;
		
		String str = Double.toString(ans);
		
		System.out.println(str.charAt(N+1));
*/