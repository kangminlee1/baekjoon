package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1769 {
	
	public static int count = 0;
	
	public static String ez(String str) {
		
		while(true) {
			int sum = 0;
			
			if(str.length() == 1) {
				break;
			}

			for(int i =0; i<str.length();i++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}

			count++;
			str = String.valueOf(sum);
			
		}
		
		return str;
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		
		str = ez(str);
		
		System.out.println(count);
		if(Integer.parseInt(String.valueOf(str))%3 == 0) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		System.out.println(sb);
		
	}

}
