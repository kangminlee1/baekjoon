package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class Coin0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int C=in.nextInt();
		int money=in.nextInt();
		int[] arr=new int[C];
		for(int i=0;i<10;i++) {
			arr[i]=in.nextInt();
		}
		int count=0;
		for(int i=C-1;i>=0;i--) {
			if(arr[i]<=money)
			count+=money/arr[i];
			money=money%arr[i];
		}
		System.out.println(count);
	}
}
