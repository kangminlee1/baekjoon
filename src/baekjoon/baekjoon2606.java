package baekjoon;
//바이러스
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2606 {

	public static int[][] arr;//인접행렬 표시
	public static boolean[] TF;//이미 바이러스에 감염된것 판단
	public static int count = 0;//감염된 컴퓨터 수
	
	public static int computer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		computer = Integer.parseInt(br.readLine());//컴퓨터 수
		int num = Integer.parseInt(br.readLine());
		
		arr = new int[computer+1][computer+1];
		TF = new boolean[computer+1];
		
		StringTokenizer st;
		for(int i =0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;//1,3과 3,1은 같은 의미
			
		}
		
		dfs(1);
		
		System.out.println(count -1 );
		
	}

	public static void dfs(int n) {
		int start = n;
		
		TF[start] = true;//감염돼서 true로 변경
		count++;//컴퓨터 수 증가
		
		for(int i = 0; i<=computer; i++) {
			if(arr[start][i] == 1 && !TF[i]) {//컴퓨터가 연결이 되어 있고 감염되지 않았을때
				dfs(i);
			}
		}
		
	}
	
}
