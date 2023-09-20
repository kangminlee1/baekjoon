package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1259 {
	
	public static StringBuffer sb = new StringBuffer();
	public static void findPDR(String str) {
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt((str.length()-1)-i)) {
				sb.append("no").append("\n");
				return;
			}
		}
		sb.append("yes").append("\n");
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			findPDR(str);
			
		}
		System.out.println(sb);
	}

}
