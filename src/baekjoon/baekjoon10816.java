package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.HashMap;

public class baekjoon10816 {
	
	public static void main(String[] args) throws IOException {
		//HashMap을 사용하는 것보다 빠른 Counting이라는 게 있다함 그래서 코드를 보면서 공부함
		//이건 공부한 것
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] counting = new int[20000001]; // 입력받는 수의 범위 : -10,000,000 ~ 10,000,000

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < N; i++) {
			counting[Integer.parseInt(st.nextToken()) + 10000000]++;	// 해당 인덱스의 값 증가
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			sb.append(counting[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');
		}
		System.out.println(sb);
	}
}
/* //HashMap 쓰는 법도 있다해서 풀어봄
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i< N;i++) {
			int findNum = Integer.parseInt(st.nextToken());
			map.put(findNum, map.getOrDefault(findNum, 0) + 1);
			//getOrDefault를 몰라서 시간 복잡도가 O(n^2)인 코드가 나와서 찾아보고 다시함

			/*
			 * getOrDefault(Object key, V DefaultValue)
			 *  key : map 요소의 키이다.
			 *  defaultValue : 지정된 키로 매핑된 값이 없거나 null이면 반환하는 기본 값이다.
			 *  map.getOrDefault(key, 0) + 1 에 + 1 해주는 이유??
			 *  -> 원소에 갯수를 카운트하기 위해 +1씩 해주는 것
			 */
		/*}
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0;i < M;i++) {
			int number = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(number, 0)).append(" ");
		}
		
		System.out.println(sb);
		
 */

/*
 * public static int upperBound(int[] arr, int N) {
		int start = 0;
		int last = arr.length;
		
		while(start < last) {
			int mid =(start + last)/2;
			
			if(arr[mid]>N) {
				last = mid;
			}
			else {
				start = mid +1;
			}
		}

		return start;
	}
	
	public static int lowerBound(int[] arr, int N) {
		int start = 0;
		int last = arr.length;
		
		while(start<last) {
			int mid = (start + last)/2;
			
			if(arr[mid]>=N) {
				last = mid;
			}
			else {
				start = mid+1;
			}
		}
		
		return start;
	}


	public static void main(String[] args) throws IOException {
		//한번 푼건데 한동안 문제를 안푼적이 있었어서 풀었던거 복습 겸 Scanner 사용 안하고 풀어보기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arrN[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrN);//Collections안쓰는 이유 전에 푼 문제에 씀  + 이건 배열이므로
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<M;i++) {
			int number = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arrN, number) - lowerBound(arrN, number)).append(" ");
		}
		System.out.println(sb);
 */




//static int upper(int[] arr1, int n) {
//	int low=0;
//	int high=arr1.length;
//	while(low<high) {
//		int mid=(low+high)/2;
//		if(n<arr1[mid])//찾고자 하는 값이 mid보다 작은 경우
//			high=mid;
//		else 
//			low=mid+1;//중복 원소를 찾음
//			
//	}
//	return low;
//}
//
//static int lower(int[] arr1, int n) {
//	int low =0;
//	int high=arr1.length;
//	while(low<high) {
//		int mid = (low+high)/2;
//		if(n<=arr1[mid])//키 값이 mid의 값보다 작거나 같을 경우
//			high=mid;
//		else
//			low=mid+1;
//	}
//	
//	return low;
//}
//
//
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	
//	int A=in.nextInt();
//	int[] arr1=new int[A];
//	
//	for(int i=0;i<arr1.length;i++) {
//		arr1[i]=in.nextInt();
//	}
//	
//	Arrays.sort(arr1);
//	int B=in.nextInt();
//	int[] arr2=new int[B];
//	for(int i=0;i<B;i++) {
//		arr2[i]=in.nextInt();
//	}
//	for(int i=0;i<arr2.length;i++) {
//		System.out.print((upper(arr1, arr2[i])-lower(arr1, arr2[i]) )+ " ");
//	}
//	
//}
//기존 이진 탐색으로는 원하는 값을 찾는 것이기만 하여 upper, lower을 구분하지 않고
//한번에 찾았다면 이것은 원하는 값의 갯수를 찾는 조건이 있어 upper, lower 구분 사용
