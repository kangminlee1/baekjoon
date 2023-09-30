package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Stack;

public class baekjoon17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		
		boolean flag = false;// <인지 >인지 구분용
		StringBuffer sb = new StringBuffer();
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == '<') {
				flag = true;
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
			else if( str.charAt(i) == '>') {
				flag = false;
				sb.append(str.charAt(i));
				continue;//이것 안해주면 다음조건에 나오는 flag == false일 떄 또 나옴
			}
			
			if(flag == true) {//<>안에 있는 것은 뒤집지 않고 출력
				sb.append(str.charAt(i));
			}else {//<>안에 있는 것이 아닌 경우 뒤집기
				if(str.charAt(i)==' ') {//띄어 쓰기가 있을 경우
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');//뒤집은 후 추가
				}else {
					stack.add(str.charAt(i));
				}
			}
			
			if(i == str.length()-1) {//마지막 자리일 경우
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}//모두 출력
			}
		}
		
		
		System.out.println(sb);
		
	}

}