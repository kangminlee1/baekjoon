package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon11866 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		
		int A=in.nextInt();
		int B=in.nextInt();
		
		for(int i=1;i<=A;i++) {//큐에 1~7까지 입력
			que.offer(i);
		}
		System.out.print("<");
		
		while(que.size()>1) {//마지막 원소만 남을때 까지 반복
			for(int i=0;i<B-1;i++) {
				int val=que.poll();
				que.offer(val);
			}//3번째 원소 출력을 위해 1번째, 2번째 원소 뒤로 보냄
			System.out.print(que.poll()+", ");//3번째 원소 출력
			
		}
		System.out.println(que.poll()+">");//마지막 원소 출력
		
		
	}

}
