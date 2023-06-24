package baekjoon;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class baekjoon18258 {
	
	
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Deque<Integer> que= new LinkedList<>();
		
		int A=in.nextInt();
		
		for(int i=0;i<A;i++) {
			String str=in.next();
			
			switch(str) {
			case "push": que.offer(in.nextInt()); break;
			case "front": System.out.println(que.peek());break;
			case "back": System.out.println(que.peekLast());break;
			case "size": System.out.println(que.size()); break;
			case "empty": 
				if(que.isEmpty())
				System.out.println(1); 
				else
					System.out.println(0);
				break;
			case "pop": 
				Integer item=que.pop();
				if(item==null)
				System.out.println(-1);
				else
					System.out.println(item);
				break;
			}
			
			
		}
		
	}

}
