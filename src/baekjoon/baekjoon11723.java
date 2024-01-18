package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashSet;
//실패했었음 비스마스킹 사용문제임
public class baekjoon11723 {
	
	public static HashSet<Integer> set = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int S = 0;//집합
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			if(str.equals("all"))
				S =(1<<21) -1 ;
			//all이면 S를 1~20으로 바꿈
			else if(str.equals("empty"))
				S = 0;
			else {
				int num = Integer.parseInt(st.nextToken());
				
				if(str.equals("add"))
					S |= (1<<num);
				
				else if(str.equals("remove"))
					S &= ~(1<<num);
				
				else if(str.equals("toggle"))
					S ^= (1<<num);
				
				else if(str.equals("check"))
					sb.append((S & (1<<num)) != 0 ? 1:0).append("\n");			
			}
			
		}
			
			System.out.println(sb);
		
	}

}
