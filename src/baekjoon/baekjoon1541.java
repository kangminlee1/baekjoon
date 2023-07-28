package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon1541 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int sum= Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
		StringTokenizer str = new StringTokenizer(in.nextLine(), "-");
		
		while(str.hasMoreTokens()) {
			int temp = 0;
			
			//뻴셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰 더함.
			StringTokenizer addition = new StringTokenizer(str.nextToken(), "+");
			
			//덧셈으로 나뉜 토큰들 모두 더함.
			while(addition.hasMoreTokens()) {
				temp += Integer.parseInt(addition.nextToken());
			}
			
			//첫번째 토큰일 경우에는 temp 값이 첫 번째 수가 된다.
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}else
				sum -=temp;
			
		}
		System.out.println(sum);

	}

}


//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	
//	
//	int sum= Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
//	String[] str = in.nextLine().split("-");
//	
//	for(int i=0;i<str.length;i++) {
//		int temp = 0;
//		
//		//뻴셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰 더함.
//		String[] addition = str[i].split("\\+");
//		
//		//덧셈으로 나뉜 토큰들 모두 더함.
//		for(int j=0;j<addition.length;i++) {
//			temp += Integer.parseInt(addition[j]);
//		}
//		
//		//첫번째 토큰일 경우에는 temp 값이 첫 번째 수가 된다.
//		if(sum == Integer.MAX_VALUE) {
//			sum = temp;
//		}else
//			sum -=temp;
//		
//	}
//	System.out.println(sum);
//
//	//split() 메소드 주의점 : 온전하게 문자 그자체로 이용하기 위해서는 이스케이프 처리를 해야함 하지만 \를 단독으로 출력할 수 없어
//	// \자체를 이스케이프 해야함 \\+를 해야 우리가 분리하고자 하는 +문자 그대로 분리 가능
