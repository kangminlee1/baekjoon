package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon2839 {
	
	public static void findMin(int N) {
		
		if(N==4||N==7)
            System.out.println(-1);
        else if(N%5==0)
            System.out.println(N/5);
        else if(N%5==1||N%5==3)
            System.out.println(N/5+1);
        else if(N%5==2||N%5==4)
            System.out.println(N/5+2);
		//이 조건은 다르게 풀어 하나 만족하지 못하는 것이 있었음
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		
		
		findMin(N);
		
	}

}
