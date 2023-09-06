package baekjoon;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1920 {
	
	public static int binarySearch(int[] arrN, int arrM) {
		int start = 0;
		int end = arrN.length-1;
		
		while(start<=end) {
			int middle=(start+end)/2;
			
			if(arrN[middle]<arrM) {
				start = middle+1;
			}
			else if(arrN[middle]>arrM) {
				end = middle-1;
			}
			else {
				return 1;
			}
			
		}
		return 0;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N;i++) {
			arrN[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");//Integer.parseInt(st.nextToken());이거 사용할 때마다 초기화 해야함
		for(int i=0;i<M;i++) {
			System.out.println(binarySearch(arrN, Integer.parseInt(st.nextToken())));
		}		

		
	}

}
//package baekjoon;
//
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class baekjoon1920 {
//	
//	public static int binarySearch(int[] arr1, int n) {
//		int first=0;
//		int last=arr1.length-1;//마지막 인덱스
//		
//		while(first <= last) {
//			int mid=(first+ last)/2;//중간 위치
//			
//			if(arr1[mid]>n) {//찾는 값이 더 작은 경우
//				last=mid-1;
//			}
//			else if(arr1[mid]<n) {//찾는 값이 더 큰 경우
//				first=mid+1;
//			}
//			else//찾는 값이랑 일치할 경우
//				return mid;
//		}
//		
//		return -1;
//	}
//
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int A;
//		
//		A=in.nextInt();
//		int[] arr1=new int[A];
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=in.nextInt();
//		}
//		Arrays.sort(arr1);//배열 정렬
//		
//		int B=in.nextInt();
//		
//		for(int i=0;i<B;i++) {
//			if(binarySearch(arr1, in.nextInt())>=0)
//				System.out.println(1);
//			else
//				System.out.println(0);
//		}
//
//	}
//
//}