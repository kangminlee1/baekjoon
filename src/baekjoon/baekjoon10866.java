package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class baekjoon10866 {
	
	public static Deque<Integer> deq = new ArrayDeque<>();
	
	
	public static void push_front(int num) {
		deq.addFirst(num);
	}
	public static void push_back(int num) {
		deq.addLast(num);
	}
	public static int pop_front() {
		if(deq.isEmpty()) {
			return -1;
		}
		return deq.removeFirst();
	}
	public static int pop_back() {
		if(deq.isEmpty()) {
			return -1;
		}
		return deq.removeLast();
	}
	public static int size() {
		return deq.size();
	}
	public static int empty() {
		if(deq.isEmpty()) {
			return 1;
		}else
			return 0;
	}
	public static int front() {
		if(deq.isEmpty()) {
			return -1;
		}
		return deq.peekFirst();
	}
	public static int back() {
		if(deq.isEmpty()) {
			return -1;
		}
		return deq.peekLast();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i =0;i < N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String str = st.nextToken();
			
			if(str.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());
				push_back(num);
			}
			if(str.equals("push_front")) {
				int num = Integer.parseInt(st.nextToken());
				push_front(num);
			}
			if(str.equals("pop_back")) {
				sb.append(pop_back()).append("\n");
			}
			if(str.equals("pop_front")) {
				sb.append(pop_front()).append("\n");
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
 * static int front=0;
	static int rear=0;
	static int size=0;
	static int[] arr;
	
	static void push_front(int item) {
		arr[front]=item;
		front=(front-1+arr.length)%arr.length;
		size++;
	}
	
	static void push_back(int item) {
		rear=(rear+1)%arr.length;
		size++;
		arr[rear]=item;
	}
	static int pop_front() {
		if(size==0) 
		return -1;
		else {
			int item=arr[(front+1)%arr.length];
			front=(front+1)%arr.length;
			size--;
			return item;
		}
	}
	static int pop_back() {
		if(size==0) {
			return -1;
		}
		else {
		int item=arr[rear];
		rear=(rear-1+arr.length)%arr.length;
		size--;
		return item;
		}
	}
	static int size() {
		return size;
	}
	static int empty() {
		if (size==0)
			return 1;
		else
			return 0;
	}
	static int front() {
		if(size==0)
			return -1;
		else
			return arr[(front+1)%arr.length];
	}
	static int back() {
		if(size==0)
			return -1;
		else
			return arr[rear];
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int A=in.nextInt();		
		arr=new int[A];
		for(int i=0;i<A;i++) {
			String str=in.next();
			
			switch(str) {
			case "push_back": 
				push_back(in.nextInt());
				break;
			case "push_front":
				push_front(in.nextInt());
				break;
			case "front":
				System.out.println(front());
				break;
			case "back": 
				System.out.println(back());
				break;
			case "size":
				System.out.println(size());break;
			case "empty":
				System.out.println(empty());break;
			case "pop_back":
				System.out.println(pop_back());break;
			case "pop_front":
				System.out.println(pop_front());break;
			}
		}
		
		

	}

}
 * 
 */
