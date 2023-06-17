package baekjoon;
import java.util.*;


public class baekjoon10816 {
	
	static int upper(int[] arr1, int n) {
		int low=0;
		int high=arr1.length;
		while(low<high) {
			int mid=(low+high)/2;
			if(n<arr1[mid])//찾고자 하는 값이 mid보다 작은 경우
				high=mid;
			else 
				low=mid+1;//중복 원소를 찾음
				
		}
		return low;
	}
	
	static int lower(int[] arr1, int n) {
		int low =0;
		int high=arr1.length;
		while(low<high) {
			int mid = (low+high)/2;
			if(n<=arr1[mid])//키 값이 mid의 값보다 작거나 같을 경우
				high=mid;
			else
				low=mid+1;
		}
		
		return low;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A=in.nextInt();
		int[] arr1=new int[A];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=in.nextInt();
		}
		
		Arrays.sort(arr1);
		int B=in.nextInt();
		int[] arr2=new int[B];
		for(int i=0;i<B;i++) {
			arr2[i]=in.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print((upper(arr1, arr2[i])-lower(arr1, arr2[i]) )+ " ");
		}
		
	}
//기존 이진 탐색으로는 원하는 값을 찾는 것이기만 하여 upper, lower을 구분하지 않고
//한번에 찾았다면 이것은 원하는 값의 갯수를 찾는 조건이 있어 upper, lower 구분 사용
}
