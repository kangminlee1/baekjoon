package baekjoon;

import java.util.Scanner;

public class baekjoon24060 {

	static int[] temp;
	static int count=0;
	static int result=-1;
	static int K;
	
	static void marge_sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid=(low+high)/2;
			marge_sort(arr, low, mid);
			marge_sort(arr, mid+1, high);
			marge(arr, low, mid, high);
		}
	}
	
	static void marge(int[] arr, int low, int mid, int high) {
		int i=low;
		int j=mid+1;
		int t=0;

		while(i<=mid &&j<=high) {
			if(arr[i]<=arr[j]) {
				temp[t++]=arr[i++];
			}else {
				temp[t++]=arr[j++];
			}
		}
		while(i<=mid){
			temp[t++]=arr[i++];
		}
		while(j<=high) {
			temp[t++]=arr[j++];
		}
		
		i=low;
		t=0;
		
		while(i<=high) {
			count++;
			if(count==K) {
				result=temp[t];
				break;
			}
			arr[i++]=temp[t++];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int A=in.nextInt();
		
		K=in.nextInt();
		temp=new int[A];
		
		int[] arr=new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		
		marge_sort(arr, 0, arr.length-1);
		System.out.println(result);
		
	}

}
