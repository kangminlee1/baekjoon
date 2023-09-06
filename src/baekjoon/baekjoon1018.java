package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class baekjoon1018 {

	public static boolean[][] arr; //WB를 문자 대신 TF로 저장
	public static int min = 64; //8*8체스판에 바꿔야할 최소 개수

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");//" "읽어 드릴 수 있는 라인 추가
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();//W와 B 입력
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				}
				else
					arr[i][j] = false;
			}
		}
		
		int n = N - 7;
		int m = M - 7;
		//1. 8*8로 잘라 체스판을 만들것이기 때문
		//2. 시작 색이 W일 경우와 B일 경우 2가지
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<m; j++) {
				findMin(i,j);
			}
		}
		System.out.println(min);
		
	}
	
	public static void findMin(int n, int m) {
		int end_n = n+8;//for문에서 들어온 i 값의 +8? -> ex) 1-9까지의 체스판
		int end_m = m+8;//위와 같음
		int count = 0;//변경할 색 수
		
		boolean TF= arr[n][m];//첫번째 칸 색
		
		for(int i=n; i<end_n; i++) {
			for(int j=m; j<end_m; j++) {
				if(arr[i][j] != TF) {//색을 바꿔야 하면
					count++;
				}
				TF = !(TF); //첫번째 칸을 검사하고 다음 번째 칸을 검사할때 반대 색으로 검사
			}
			TF=!TF;//맨 처음이 W이면 다음줄 시작은 B이어야 함
		}
		
		//검사가 끝나면 위에서 본 2가지 경우 생각
		count = Math.min(count, 64-count);
		//시작이 W일 경우를 계산 한것이 count 이면 B일 경우는 64-count가 됨 둘중 최소로 min값 변경
		
		min = Math.min(min, count);//이전 까지 경우 중 최소값보다 현재 count가 더 작으면 갱신
	}
	
}
	

