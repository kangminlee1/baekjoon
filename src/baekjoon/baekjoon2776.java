package baekjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class baekjoon2776 {
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		//HashSet 사용 방법
		while(T-->0) {
			HashSet<Integer> hs =new HashSet<>();
			int N=in.nextInt();
			for(int i=0;i<N;i++) {
				hs.add(in.nextInt());
			}
			int M=in.nextInt();
			for(int i=0;i<M;i++) {
				if(hs.contains(in.nextInt()))
					System.out.println(1);
				else
					System.out.println(0);
			}
			
		}
		

	}

}

//이진 탐색 사용 방법
//static int binarySearch(int[] arr, int n) {
//	int start= 0;
//	int last = arr.length-1;
//	while(start<=last) {
//		int mid=(start+last)/2;
//		
//		if(n<arr[mid]) {
//			last=mid-1;
//		}
//		else if(n>arr[mid]) {
//			start=mid+1;
//		}
//		else 
//			return 1;
//		
//	}
//	return 0;
//	
//}
//
//public static void main(String[] args) {
//	Scanner in=new Scanner(System.in);
//	int T=in.nextInt();
//	
//	while(T-->0) {
//	int N=in.nextInt();
//	int[] arrN=new int[N];
//	for(int i=0;i<N;i++) {
//		arrN[i]=in.nextInt();
//	}
//	
//	Arrays.sort(arrN);
//	
//	int M=in.nextInt();
//	for(int i=0; i<M;i++) {
//		System.out.println(binarySearch(arrN, in.nextInt()));
//	}
//	}
//	
//	
//
//}
