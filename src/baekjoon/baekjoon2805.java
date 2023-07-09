package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon2805 {
	
	static int binarySearch(int[] arr, int H) {
		int start = 0;
		int last = arr[arr.length-1];//가장 긴 나무
		
		while(start<=last) {
			long sum=0;//H랑 비교할 값(자르고 생긴 나무의 길이 합)
			int mid=(start + last)/2;//자를 높이
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>mid) {
					sum+=arr[i] - mid;
				}//나무보다 자를 높이가 넘으면 더하지 않음
			}
			if(sum<H) {//원하는 길이보다 작을 경우 (너무 높이 잘라서 부족함)
				last=mid -1;//자를 높이를 낮춤
			}

			else if(sum>H) {//큰 경우 자를 높이를 높여 줌(너무 짧게 짤라서 넘침)
				start= mid+1;
			}
			else//sun==H 자르고 남은 나무 길이 합이 원하는 나무 길이랑 일치하는 경우
				return mid;//자를 높이를 반환
				
		}
		return last;//while문을 벗어나면 last가 자를 높이임
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int M=in.nextInt();//나무 미터 수
		int[] arr=new int[M];
		int H=in.nextInt();//?미터
		
		for(int i=0;i<M;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr, H));

	}
}
