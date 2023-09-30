package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		
		for(int i =0; i<N;i++) {
			String str = br.readLine();
			for(int j =0; j<N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int count_x = 0;
		int count_y = 0;
		
		for(int i =0;i <N;i++) {
			for(int j = 0; j<N; j++) {
				if(i + 1 < N) {
                    if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= N || arr[i+2][j] == 'X')) {
						count_y++;
					}
				}
				if(j + 1 < N) {
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= N || arr[i][j + 2] == 'X')) {

						count_x++;
					}
				}
				
				
			}
		}
		System.out.println(count_x +" "+ count_y);

	}

}
