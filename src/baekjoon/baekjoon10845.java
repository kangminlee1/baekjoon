package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon10845 {
	
	public static StringBuilder sb = new StringBuilder();
	public static Queue<Integer> que = new LinkedList<>();
	public static int back = 0;
	
	public static void push(int num) {
		que.add(num);
		back = num;
	}
	
	public static int pop() {
		if(que.isEmpty()) {
			return -1;
		}
		int result = que.poll();
		
		return result;
	}
	
	public static int size() {
		int result = que.size();
		
		return result;
	}
	
	public static int empty() {
		if(que.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front () {
		if(que.isEmpty()) {
			return -1;
		}else {
			return que.peek();
		}
	}
	
	public static int back() {
		if(que.isEmpty()) {
			return -1;
		}else {
			return back;
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i< N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				push(num);
			}
			if(str.equals("pop")) {
				sb.append(pop()).append("\n");
				
			}
			if(str.equals("size")) {
				sb.append(size()).append("\n");
			}
			if(str.equals("empty")) {
				sb.append(empty()).append("\n");
			}
			if(str.equals("front")) {
				sb.append(front()).append("\n");
			}
			if(str.equals("back")) {
				sb.append(back()).append("\n");
			}
			
		}
		
		System.out.println(sb);
		
	}

}


/*
 * 
 * public static int[] queue;
	public static int rear=0;
	public static int front=0;
	
	static void push(int item) {
		queue[rear]=item;
		rear++;
	}
	static int pop() {
		if(rear==front)
			return -1;
		else {
			int item=queue[front];
			queue[front]=0;
			front++;
			return item;
		}
	}
	static int size() {
		return rear-front;
	}
	static int empty() {
		if(front==rear)
			return 1;
		else
			return 0;
	}
	static int front() {
		if(front==rear)
			return -1;
		else
			return queue[front];
	}
	static int back() {
		if(front==rear)
			return -1;
		else
			return queue[rear-1];
	}
 * 
 */

/*
Scanner in= new Scanner(System.in);
int A=in.nextInt();

queue=new int[A];
for(int i=0;i<A;i++) {
	String str=in.next();
	
	switch(str) {
	case "push": 
		push(in.nextInt());
		break;
	case "pop":
		System.out.println(pop());
		break;
	case "size":
		System.out.println(size());
		break;
	case "empty":
		System.out.println(empty());
		break;
	case "front":
		System.out.println(front());
		break;
	case "back":
		System.out.println(back());
		break;
	}
}
}*/