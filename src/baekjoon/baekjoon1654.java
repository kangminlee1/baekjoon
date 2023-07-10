package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class baekjoon1654 {
	
	static long binarySearch(int[] arr, int N) {
		long start = 1;
		long last = arr[arr.length-1];
		long result=0;//이것은 예를들어 198: 11개, 200: 11개일 때 200을 선택하기 위한 변수
		
		while(start<=last) {
			long count=0;//갯수
			long mid = (start + last)/2;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=mid) {
					count+=arr[i]/mid;
				}
			}
			if(count<N) {//자를려는 길이가 너무 길때
				last = mid -1;
			}
			else {
				result=Math.max(result, mid);//기존에 자를려는 길이와 지금 길이를 비교
				start = mid+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int K=in.nextInt();
		int[] arr=new int[K];
		int N=in.nextInt();
		
		for(int i=0;i<K;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr, N));
		
		
	}

}
