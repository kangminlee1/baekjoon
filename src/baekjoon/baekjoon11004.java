package baekjoon;

import java.util.Scanner;

public class baekjoon11004 {
	
	static void quickSorting(int[] arr, int start, int end) {
		int L=start;
		int R=end;
		int temp;
		int pivot=arr[(start+end)/2];
		
		while(L<=R) {
			while(arr[L]<pivot) {
				L++;
			}
			while(arr[R]>pivot)
				R--;
		
		if( L<=R) {
			if(L!=R) {
				temp=arr[L];
				arr[L]=arr[R];
				arr[R]=temp;
			}
			L++;
			R--;
		}
		
	 }
		if(start<R)
			quickSorting(arr, start, R);
		if(L<end)
			quickSorting(arr, L, end);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A=in.nextInt();
		int B=in.nextInt();
		
		int[] arr=new int[A];
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		
		quickSorting(arr, 0 , A-1);
		
		System.out.println(arr[B-1]);
	}

}
