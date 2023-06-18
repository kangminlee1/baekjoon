package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
public class baekjoon11651 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int[][] arr=new int[A][2];
		for(int i=0;i<A;i++) {
			arr[i][0]=in.nextInt();
			arr[i][1]=in.nextInt();
		}
		Arrays.sort(arr, (e1,e2)-> {
			if(e1[1]==e2[1]) {
				return e1[0]- e2[0];
			}
			else {
				return e1[1]- e2[1];
			}
		});
		
//		Arrays.sort(arr, (e1,e2)-> {
//			if(e2[0]==e1[0]) {
//				return e2[1]- e1[1];
//			}
//			else {
//				return e2[0]- e1[0];
//			}
//		});//내림차순(x좌표 기준)
//		Arrays.sort(arr, (e1,e2)-> {
//			if(e1[0]==e2[0]) {
//				return e1[1]- e2[1];
//			}
//			else {
//				return e1[0]- e2[0];
//			}
//		});//오름차순(x좌표 기준)
		
		
		for(int i=0;i<A;i++) {
			System.out.print(arr[i][0]+" "+arr[i][1]);
			System.out.println();
		}
		
	}

}