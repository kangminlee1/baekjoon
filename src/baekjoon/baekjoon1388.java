package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1388 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[x][y];
		
		for(int i = 0; i<x; i++) {
			String str = br.readLine();
			for(int j = 0; j<y; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int count = 0;
		for(int i=0; i<x; i++) {
			int temp = 0;
			for(int j=0; j<y; j++) {
				if(arr[i][j] == '|') { //가로기준으로 탐색하다 |을 마주치면 초기화
					temp = 0;
				}else if(++temp == 1) {//--든 ------든 -든 1개임 
					count++;
				}
			}
		}

		for(int i = 0; i<y; i++) {
			int temp = 0;
			for(int j = 0; j<x; j++) {
				if(arr[j][i] == '-') {//세로 기준으로 탐색하다 -를 마주치면 초기화
					temp = 0;
				}else if(++temp == 1) {//(세로기준으로 생각)| 든 ||든 ||||||||||||||||||||||든 1개임
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
