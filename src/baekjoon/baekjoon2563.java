package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2563 {
	
	public static final int x = 100;
	public static final int y = 100;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());

		boolean[][] TF = new boolean[x][y];
		
		int area = 0;
		for(int i =0; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int point_x = Integer.parseInt(st.nextToken());
			int point_y = Integer.parseInt(st.nextToken());
			
			for(int j = point_x; j<point_x+10; j++) {
				for(int k= point_y; k<point_y+10; k++) {
					if(!TF[j][k]) {
						TF[j][k]=true;
						area++;
					}
				}
			}
		}
		
		System.out.println(area);
		
		
	}

}


/*
Scanner in = new Scanner(System.in);
		
		int total=0;
		int num = in.nextInt();
		int[][] arr=new int[100][100];
		
		for(int i=0;i<num;i++) {
			int w=in.nextInt();
			int h=in.nextInt();
			
			for(int j=w;j<w+10; j++) {
				for(int k=h;k<h+10; k++) {
					arr[k][j]=1;
				}
			}
		}

		for(int i=0; i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j]==1) {
					total+=arr[i][j];
				}
			}
		}
		
		System.out.println(total);

*/
