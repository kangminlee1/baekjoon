package baekjoon;
import java.util.Scanner;
public class chess {
	public static boolean[][] arr;
	public static int min = 64;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X=in.nextInt();
		int Y=in.nextInt();
		arr=new boolean[X][Y];
		for (int i=0;i<X;i++) {
			String str = in.next();//문자열 입력받기
			for (int j=0;j<Y;j++) {
				if (str.charAt(j) == 'W') { 
					arr[i][j] = true;		// W일 때는 true 
				} else {
					arr[i][j] = false;		// B일 때는 false
				}
			}
		}
		for (int i = 0; i < X-7; i++) {
			for (int j = 0; j <Y-7; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
	public static void find(int x, int y) {
		int count=0;
		boolean BW=arr[x][y];	// 첫 번째 칸의 색 
		for (int i=x;i<x+8;i++) {
			for (int j=y;j<y+8;j++) { 
				if (arr[i][j]!=BW) { //색을 비교했을때 올바르지 않을경우 count++	
					count++;
				}
				BW=!BW;// 다른 색으로 변경
			}
			BW=!BW;//싸이클이 한번 끝났으므로 시작 색을 변경
		}
		count = Math.min(count, 64 - count);//8x8로 잘랐으므로 64개
		min = Math.min(min, count);//최소값을 찾는데 전에 구했던 최솟값과 현재중 최솟값으로 변경
	}
}