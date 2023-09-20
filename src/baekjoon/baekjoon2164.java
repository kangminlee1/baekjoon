package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Queue;
import java.util.LinkedList;

public class baekjoon2164 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N;i++) {
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(que.size() == 1) {
				sb.append(que.peek());
				
				break;
			}
			
			que.poll();
			que.add(que.poll());
		}
		System.out.println(sb);
	}

}



/*
 * 
 * Scanner in=new Scanner(System.in);
		Queue<Integer> que= new LinkedList<>();
		int A=in.nextInt();
		//queue는 linkedlist와 함께 선언을 해야함
		for(int i=1;i<=A;i++) {//1~A까지 큐에 저장
			que.offer(i);
		}
		
		while(que.size()>1) {//poll=remove, offer=add
			que.poll();//맨앞 원소 제거
			que.offer(que.poll());//맨 앞 원소 제거와 동시에 버려진 원소 맨 뒤 삽입
		}
		System.out.println(que.peek());//남은 원소 출력
	}

}
 * 
 * */
