package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2485 {
	
	public static int gcd (int a, int b) {
		while(b>0) {
			int temp =a%b;
			a=b;
			b=temp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//이미 심어진 가로수의 수
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());//이미 심어진 가로수 위치
		}
		int gcd = 0;//최대 공약수 저장할 변수
		
		for(int i = 0; i<N-1; i++) {
			int distance = arr[i+1]-arr[i];//가로수 사이 간격
			gcd = gcd(distance, gcd);//가로수 사이 최대 공약수
		}
		//(마지막 나무 - 첫번째 나무)/gcd == 총 간격의 수
		//추가로 심어야할 나무의 개수는 전체 나무 개수 - 심어진 나무 수
		//즉, 총 간격의 수 - 심어진 나무 간격 == (마지막 나무 - 첫번째 나무)/gcd - (N-1)
		System.out.println((arr[N-1]-arr[0])/gcd -(N-1));
		
	}

}
