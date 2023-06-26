package baekjoon;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class baekjoon1620 {

	static boolean isNumber(String str) {//문자열 숫자인지 체크
		try {
			int num=Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap<String, Integer> hm =new HashMap<>();
		
		int A=in.nextInt();
		int B=in.nextInt();
		String[] arr=new String[A+1];
		
		for(int i=1;i<=A;i++) {
			arr[i]=in.next();//문자열 출력 위한 배열
			hm.put(arr[i], i);
		}
		
		for(int i=0;i<B;i++) {
			String str=in.next();
			if(isNumber(str)) {
				int num=Integer.parseInt(str);
				System.out.println(arr[num]);
			}
			else {
				System.out.println(hm.get(str));
			}
		}
	}

}
