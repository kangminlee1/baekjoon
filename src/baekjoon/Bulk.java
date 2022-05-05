package baekjoon;
import java.util.Scanner;
public class Bulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int[][] arr=new int[A][2];
		for(int i=0;i<A;i++) {
			arr[i][0]=in.nextInt();
			arr[i][1]=in.nextInt();
		}
		for(int i=0;i<A;i++) {
			int rank=1;
			for(int j=0;j<A;j++) {
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		}
	}

}
