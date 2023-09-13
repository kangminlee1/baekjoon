package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;

public class baekjoon10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			int num= Integer.parseInt(st.nextToken());
			map.put(i+1, num);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(map.containsValue(num)) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
}

/* scanner X
 * import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;

public class baekjoon10815 {
	
	public static int binarySearch(int[] arr, int N) {
		int start = 0;
		int last = arr.length;
		
		while(start <= last) {
			int mid = (start + last)/2;
			
			if( arr[mid]> N) {
				last = mid -1;
			}
			else if(arr[mid] < N) {
				start = mid + 1;
			}
			else {//찾았을때
				return 1;
			}
			
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i= 0;i< N;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<M;i++) {
			int number = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, number)).append(" ");
		}
		System.out.println(sb);
	}
 */

/*시간 초과 발생 다시 풀기
Scanner in= new Scanner(System.in);
HashMap<Integer, Integer> hm=new HashMap<>();

int A=in.nextInt();
int[] arr=new int[A];
for(int i=0;i<A;i++) {
	arr[i]=in.nextInt();
	hm.put(i+1, arr[i]);
}
int B=in.nextInt();
for(int i=0;i<B;i++) {
	if(hm.containsValue(in.nextInt()))
	System.out.print(1+" ");
	else
		System.out.print(0+" ");
}

}
*/


//이건 이진 탐색으로 해결
//package baekjoon;
//import java.util.Arrays;
//import java.util.Scanner;
//public class baekjoon10815 {
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
//				return 1;
//		}
//		
//		return 0;
//	}
//
//	public static void main(String[] args) {
//		Scanner in= new Scanner(System.in);
//		
//		int A=in.nextInt();
//		int[] arr1=new int[A];
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=in.nextInt();
//		}
//		
//		Arrays.sort(arr1);
//		
//		int B=in.nextInt();
//		
//		for(int i=0;i<B;i++) {
//			if(binarySearch(arr1, in.nextInt())==1)
//				System.out.print(1+" ");
//			else
//				System.out.print(0+" ");
//		}
//		
//		
//	}
//
//}
