package baekjoon;

import java.util.Scanner;
import java.util.Arrays;
public class ATMsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int[] arr=new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		int pre=0;
		for(int i=0;i<A;i++) {
			sum+=pre+arr[i];
			pre+=arr[i];
		}
		System.out.println(sum);
	}

}//이중for문으로 풀었었지만 그건 O(n^2)이므로 다시 풀었음
