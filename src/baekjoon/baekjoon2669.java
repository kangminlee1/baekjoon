package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2669 {
	
	public static boolean[][] TF=new boolean[100][100];
	
	public static void find(int lx,int ly,int rx,int ry) {
		for(int i=lx; i<rx; i++) {
			for(int j=ly; j<ry; j++) {
				TF[i][j]=true;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		for(int i =0; i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
				int left_x =Integer.parseInt(st.nextToken());
				int left_y =Integer.parseInt(st.nextToken());
				int right_x =Integer.parseInt(st.nextToken());
				int right_y =Integer.parseInt(st.nextToken());
				
				find(left_x, left_y, right_x, right_y);
		}
		int count = 0;
		for(int i=0; i<100;i++) {
			for(int j=0; j<100;j++) {
				if(TF[i][j])
					count++;
			}
		}
		System.out.println(count);
	}

}
