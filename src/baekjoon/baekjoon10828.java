package baekjoon;
import java.util.Scanner;
public class baekjoon10828 {
	public static int[] stack;
	public static int size = 0;
 
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);

		
		int N = in.nextInt();
 
		stack = new int[N];
		
		for(int i = 0; i < N; i++) {
        
			String str = in.next();
 
			switch (str) {
            
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
                
			case "top":
				System.out.println(top());
				break;
			}
 
		}
		
	}
 
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
    
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
    
	public static int size() {
		return size;
	}
    
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
    
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
	
}
