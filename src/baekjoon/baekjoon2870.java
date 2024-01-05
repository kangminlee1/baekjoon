package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.math.BigInteger;
//문제에서  100자 까지 입력이 가능하므로 그냥 int로 해결하였을 때 or Integer로 해결 하였을 때는
//No such 문제가 발생하였음
//BigInteger를 찾아 해결하였음

public class baekjoon2870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int count = 0;
		String temp = "";
		ArrayList<BigInteger> list = new ArrayList<>();
				
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i <M; i++) {
			String str = br.readLine();
			
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j)-'0' == 0) {
					for(int k = j; k < str.length(); k++) {
						if((str.charAt(k) - '0'<=9)) {
							temp+=Character.toString(str.charAt(k));
							j++;	
						} else {
							break;
						}
					}
//					list.add(Integer.parseInt(temp));
					list.add(new BigInteger(temp));
					
				} else if(str.charAt(j) - '0' <=9) {
					for(int k = j; k<str.length(); k++) {
						if(str.charAt(k) - '0' <=9) {
							temp+=Character.toString(str.charAt(k));
							j++;
						}else {
							break;
						}
						
					}
//					list.add(Integer.parseInt(temp));
					list.add(new BigInteger(temp));

				}
				temp="";
			}
			
		}
		Collections.sort(list);

		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
