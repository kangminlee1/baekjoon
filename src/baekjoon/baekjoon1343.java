package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1343 {//좀더 간단하게 코드를 줄일 방법을 생각해보자

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = "AAAA";
		String B = "BB";
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		int count =0;
		for(int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if(chr == '.') {
				if(count%2 != 0) {
					sb = new StringBuilder();
					sb.append(-1);
					break;
				}
				else if(count%4 == 0) {
					for(int j=0; j< count/4;j++) {
						sb.append(A);
					}
					sb.append(".");
				}
				else if(count%4 == 2) {
					for(int j = 0; j< count/4;j++) {
						sb.append(A);
					}
					sb.append(B).append(".");
				}

				count = 0;
			}else {
				count++;
			}
		}
		if(count%2 != 0) {
			sb = new StringBuilder();
			sb.append(-1);
		}
		else if(count%4 == 0) {
			for(int j=0; j< count/4;j++) {
				sb.append(A);
			}
		}
		
		else if(count%4 == 2) {
			for(int j = 0; j< count/4;j++) {
				sb.append(A);
			}
			sb.append(B);
		}
		
		System.out.println(sb);
		

	}

}
