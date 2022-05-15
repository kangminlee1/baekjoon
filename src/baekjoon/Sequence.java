package baekjoon;
import java.util.Scanner;
public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int[] arr=new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		int max=0;
		int sum=0;
		for(int i=0;i<=A-B;i++) {
			sum=0;
			for(int j=i;j<i+B;j++) {
				sum+=arr[j];
			}
			if(max<sum)
				max=sum;
		}
		System.out.println(max);
	}
}
