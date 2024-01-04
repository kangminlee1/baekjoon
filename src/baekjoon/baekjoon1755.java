package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Arrays;


public class baekjoon1755 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String [] num = new String [] {"zero", "one","two","three","four","five","six","seven","eight","nine"};
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
				
		String [] str = new String [M-N+1];
		int[] arr = new int[M-N+1];
		
		for(int i = N; i<=M; i++) {
			if(i<10) {
				str[count++] = num[i];
			}else {
				str[count++] = num[i/10] + " " + num[i%10];
			}
		}
		Arrays.sort(str);
		
		for(int i =0; i<count; i++) {
			st=new StringTokenizer(str[i]);
			arr[i] = Integer.parseInt(st.nextToken());
			if(st.hasMoreTokens()) {
				arr[i] = arr[i]*10+Integer.parseInt(st.nextToken());
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i =0;i <arr.length; i++) {
			sb.append(arr[i]+" ");
			if(i%10 == 9) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}

}

