package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class sortRTr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		
		int A[] = new int[num];
		int B[] = new int[num];
		
		for(int i=0; i<A.length; i++) {
			A[i] = in.nextInt();
		}
		for(int i=0; i<A.length; i++) {
			B[i] = in.nextInt();
		}
		
		Arrays.sort(A); // A배열 정렬
		Arrays.sort(B); // B배열 정렬
		
		for(int i=0; i<num; i++) {      // sum에 A배열은 최소값부터 
			sum += A[i]*B[num-1-i]; // B배열은 최대값부터 곱해서 더하기
		}
		System.out.println(sum);
	}
}
