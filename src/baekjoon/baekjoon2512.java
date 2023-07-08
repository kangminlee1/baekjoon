package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon2512 {
	
	static int binarySearch(int[] arr, int M) {
		int start = 0;//최소 예산
		int last = arr[arr.length-1];//최대 예산
		
		while(start<=last) {
			int sum=0;//모든 지방 예산의 합
			int mid = (start+ last)/2;// 세금
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>mid)
					sum+=mid;//세금 이상의 예산 요청은 세금 만큼 배정
				else
					sum+=arr[i];//세금 이하의 예산 요청은 그대로 배정
			}
			
			if(sum<=M)//예산의 합이 국가예산 총액보다 적음-> 세금 높여서 최적의 경우 찾기
				start=mid+1;
			else
				last=mid-1;//예산의 합이 국가 예산 총액보다 많음 -> 세금 줄이기
		}
		return last;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		
		int M=in.nextInt();
		
		System.out.println(binarySearch(arr, M));
		
	}

}
