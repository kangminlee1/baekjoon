package baekjoon;
import java.util.Scanner;

public class baek11659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] arr=new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=arr[i-1]+in.nextInt(); // 입력한것 누적 값
		}
		for(int i=0;i<M;i++) {//3번 반복
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(arr[b]-arr[a-1]);//값 구하기
		}
	}

}
