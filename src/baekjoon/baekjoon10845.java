package baekjoon;
import java.util.Scanner;
public class baekjoon10845 {
	public static int[] queue;
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

	public static void main(String[] args) {
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
	}

}