package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

//import java.util.Deque;
import java.util.LinkedList;

public class baekjoon1021 {

//	public static Deque<Integer> dq = new LinkedList<>();
	public static LinkedList<Integer> que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[M];
		
		for(int i =1; i<=N;i++) {
			que.add(i);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for(int i = 0; i<M ; i++) {
			int mid = 0;
			int target = que.indexOf(arr[i]);//위치 찾기 찾으면 인덱스값 못찾으면 -1
			//target에 값은 0~size-1까지
			
			if(que.size()%2 == 0) {//인덱스 기준으로 봐야함 -> -1 하는 이유
				mid = que.size()/2 -1;
			}else{
				mid = que.size()/2;
			}
			
			if(target<=mid) {//찾고자 하는 것이 중앙보다 작을 경우
				for(int j = 0; j<target; j++) {
					que.addLast(que.pollFirst());//앞에서 빼서 뒤로 보냄
					count++;
				}
				
			}else{//중앙보다 크면
				for(int j = 0; j<que.size() - target;j++){
					que.addFirst(que.pollLast());//뒤에서 뺴서 앞으로 보냄
					count++;
				}
			}
			
			que.poll();
		}
		
		System.out.println(count);
		
	}

}
