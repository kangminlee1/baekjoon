package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon11004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A=in.nextInt();
		int B=in.nextInt();
		
		int[] arr=new int[A];
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		
		Arrays.sort(arr);
		
		
		System.out.println(arr[B-1]);
		
	}

}
