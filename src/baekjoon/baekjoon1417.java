package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class baekjoon1417 {
	
	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr= new int[N-1];
		
		int dasom = Integer.parseInt(br.readLine());
		
		if(N==1) {
			System.out.println(0);
			return;
		}
		
		for(int i=0;i<N-1;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}

		int count = 0;
		while(true) {
			
			Arrays.sort(arr); //계속 정렬해줘서 큰 숫자 찾기 쉽게함
			
			if(arr[N-2]<dasom) {
				break;
			}
			
			arr[N-2]--;
			dasom++;
			count++;

		}
		
		sb.append(count);
		
		System.out.println(sb);
		
	}

}
