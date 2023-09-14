package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Stack;

public class baekjoon10828 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			st= new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}else if(str.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");
				}
			}else if(str.equals("size")) {
				sb.append(stack.size()).append("\n");
			}else if(str.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}else if(str.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.lastElement()).append("\n");

				}
			}
		}
		System.out.println(sb);
	}
	
}

/*
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
 */
