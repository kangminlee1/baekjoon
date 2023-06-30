package baekjoon;

import java.util.Scanner;

public class baekjoon10866 {
	
	static int front=0;
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
