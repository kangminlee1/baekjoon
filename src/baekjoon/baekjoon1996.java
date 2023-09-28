package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[N][N];
		for(int i =0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N;j++) {
				arr[i][j] = str.charAt(j);
				
			}	
		}
		char[][] temp = new char[N][N];
		
		//8방탐색 전용 델타 배열
		int[] dt1= {0,0,-1,1,-1,1,-1,1};
		int[] dt2= {-1,1,0,0,1,-1,-1,1};
		for(int i =0; i<N;i++) {
			for(int j =0; j<N;j++) {
				if(arr[i][j] != '.') {
					temp[i][j] = '*';
				}else {
					int sum = 0;
					for(int k = 0; k<8; k++) {
						int x = i+dt1[k];
						int y = j+dt2[k];
						
						if(x >=0 && x <N && y>=0 &&y<N && arr[x][y] !='.') {
							sum += (arr[x][y] - '0');
						}
						
					}
					if(sum>=10) {
						temp[i][j] = 'M';
					}else {
						temp[i][j] = (char)(sum+'0');
					}
				}			
		}
	}
		for(int i =0; i<N; i++) {
			for(int j = 0; j<N;j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println();
		}

	}
}