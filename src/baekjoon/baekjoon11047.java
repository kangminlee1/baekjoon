package baekjoon;

import java.util.*;

public class baekjoon11047 {
//	static int counting(int[] arr, int price) {
//		int count=0;
//		int i=arr.length-1;
//		
//		while(price>=0) {
//			if(price-arr[i]>=0) {
//				count++;
//				price-=arr[i];
//			}
//			else if(price==0)
//				break;
//			else
//				i--;
//		}
//		
//		return count;
//	}//for문으로 하는 방법 하다가 막혀서 while문으로 만들었을 때
	
	static int counting(int[] arr, int price) {
		int count=0;
		for(int i=arr.length-1; i>=0;i--) {
			if(arr[i]<=price) {
				count+=price/arr[i];
				price%=arr[i];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int price=in.nextInt();
		
		int[] arr=new int[A];
		for(int i=0;i<A; i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println(counting(arr, price));
		
	}

}
