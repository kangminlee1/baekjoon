package baekjoon;
import java.util.Scanner;

public class baekjoon2563 {
	
	public static void main(String[] args) {
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
		
	}

}
