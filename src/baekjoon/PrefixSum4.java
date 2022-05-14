package baekjoon;
import java.util.Scanner;
public class PrefixSum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int[] arr=new int[5];
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<B;i++) {
			int x=in.nextInt();
			int y=in.nextInt();
			int sum=0;
			for(int j=x-1;j<y;j++) {
				sum+=arr[j];
			}
			System.out.println(sum);
		}
	
	}

}
