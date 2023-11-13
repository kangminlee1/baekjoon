package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon10157 {
	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};
	//델타 탐색

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());//x축
		int R = Integer.parseInt(st.nextToken());//y축
		
		boolean[][] arr = new boolean[C+2][R+2];//1,1부터 시작하기 때문
		for(int i =0; i< R+2; i++) {
			arr[0][i]= true;
			arr[C + 1][i] = true;
		}
		for(int i = 0; i<C+2; i++) {
			arr[i][0] = true;
			arr[i][R + 1] = true;
		}
		
		int K = Integer.parseInt(br.readLine());//대기 인원 수
		int count = 1;
		
		int i = 1;
		int j = 1;
		//맨 처음 배치하는 것은 (1,1)
		
		int dir = 0;// 상 우 하 좌 -> 0 1 2 3
		
		if(K > C*R) {
			System.out.println(0);
			return;
		}
		
		while(true) {
			arr[i][j] = true;
			
			if(count == K) {
				System.out.println(i + " " + j);
			}
			
			if(arr[i + dx[dir]][j + dy[dir]] != false) {
    			dir = (dir + 1) % 4;
    		}
			
			i += dx[dir];
			j += dy[dir];
			
			count++;
			if(count > C*R) {
				break;
			}
			
		}
		

	}

}

/*
if(arr[i][j+1] == false) {
				arr[i][j] = true;//예약
				tempx=i;
				tempy=j;
				j++;
			} 
			else if(arr[i+1][j] == false) {
				arr[i][j] = true;
				tempx=i;
				tempy=j;
				i++;
			}
			else if(arr[i][j-1] == false) {
				arr[i][j] = true;
				tempx=i;
				tempy=j;
				j--;
			}
			else if(arr[i-1][j] == false) {
				arr[i][j] = true;
				tempx=i;
				tempy=j;
				i--;
			}
			이건 처음에 위 오른쪽 아래로 갔을 때 까진 OK지만
			왼쪽으로 한칸 움직인 후 다시 위로 올라가는 문제점 발견

 */
