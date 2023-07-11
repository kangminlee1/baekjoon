package baekjoon;

import java.util.Scanner;

public class baekjoon1439 {
	
	static void checking(String str) {
		int zero=0;
		int one=0;
		
		if(str.charAt(0)=='0')//char로 읽으니 0이 아니라 '0'으로
			zero++;
		else 
			one++;
		
		//이러면 11111이나 0000일 경우 0이 나올 수 있음
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {//앞이랑 현재랑 다를 경우
				if(str.charAt(i)=='1')
					one++;
				else 
					zero++;
				//또 현재 문자를 보고 그 문자가 나온것 ++
			}
		}
		System.out.println(Math.min(zero, one));//둘중 최소 반환
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		checking(str);
		
	}

}
