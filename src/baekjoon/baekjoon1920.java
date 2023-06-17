package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon1920 {
	
	public static int binarySearch(int[] arr1, int n) {
		int first=0;
		int last=arr1.length-1;
		
		while(first <= last) {
			int mid=(first+ last)/2;//중간 위치
			
			if(arr1[mid]>n) {//찾는 값이 더 작은 경우
				last=mid-1;
			}
			else if(arr1[mid]<n) {//찾는 값이 더 큰 경우
				first=mid+1;
			}
			else//찾는 값이랑 일치할 경우
				return mid;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int A;
		
		A=in.nextInt();
		int[] arr1=new int[A];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=in.nextInt();
		}
		Arrays.sort(arr1);//배열 정렬
		
		int B=in.nextInt();
		
		for(int i=0;i<B;i++) {
			if(binarySearch(arr1, in.nextInt())>=0)
				System.out.println(1);
			else
				System.out.println(0);
		}

	}

}
