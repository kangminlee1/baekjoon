package baekjoon;
//유기농 배추
//깊이 우선 탐색과 너비 우선 탐색은 아직 많이 부족한 듯 따로 기본을 구현부터 해보고
//다시 한번 더 풀자
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1012 {
	
	public static int M, N, K;
	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {0, 0, -1, 1};
	public static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());//테스트 케이스
		
		StringTokenizer st;
		while(TC-- > 0) {
			int count = 0;
			
			st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());//행
			N = Integer.parseInt(st.nextToken());//열
			K = Integer.parseInt(st.nextToken());//배추 심어진 수
			
			arr= new int[M][N];//심어진 위치
			visit = new boolean[M][N];//방문했는지
			
			for(int i = 0; i < K; i++) {			
				st = new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 1 && !visit[i][j]) {
						DFS(i, j);
						count++;
					}
					
				}
			}
			
			
			System.out.println(count);
			
			
		}	
	}
	public static void DFS(int x, int y) {
		visit[x][y]= true;
		
		for(int i = 0; i < 4; i++) {
			int cx = x+ dx[i];
			int cy = y+ dy[i];
			
			 if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
		            if (arr[cx][cy] == 1 && !visit[cx][cy]) {
		               DFS(cx, cy);
		            }
		         }
		}
	}
	
	
}
