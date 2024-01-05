package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1358 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());//직사각형 가로
		int H = Integer.parseInt(st.nextToken());//직사각형 세로
		int X = Integer.parseInt(st.nextToken());//원의 x좌표
		int Y = Integer.parseInt(st.nextToken());//원의 y좌표
		int P = Integer.parseInt(st.nextToken());//선수의 수
		int radius = H/2;//반지름의 길이
		
		int count = 0;
				
		for(int i =0; i<P; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x>=X && x<=X+W && y>=Y && y<=Y+H) {
				count++;
			} else if((X-x)*(X-x) + (Y+radius - y)*(Y+radius - y) <= radius*radius) {
				count++;
			} else if((X+W-x)*(X+W-x) + (Y+radius-y)*(Y+radius-y) <= radius*radius) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
