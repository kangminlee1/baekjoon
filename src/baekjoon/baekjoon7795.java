package baekjoon;
//미완성
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon7795 {
	
	static int binarySearch(int[] arr, int n) {
		int start=0;
		int last=arr.length-1;
		
		int count=0;
		
		while(start<=last) {
			int mid=(start+ last)/2;
			
			if(n>arr[mid]) {
				count=mid;
				start=mid+1;
			}
			else {
				last=mid-1;
			}
			
		}
		return count+1;
			
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int T=in.nextInt();//테스트 케이스 수
		
		while(T-->0) {
		int A=in.nextInt();
		int[] arr=new int[A];
		int B=in.nextInt();
		int[] arrB=new int[B];
		
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		
		int result = 0;
		
		for(int i=0; i<B;i++) {
			arrB[i]=in.nextInt();
		}
		Arrays.sort(arrB);
		for(int i=0;i<A;i++) {
			result+= binarySearch(arrB, arr[i]);
		}
		System.out.println(result);
		
		}
		

	}

}
