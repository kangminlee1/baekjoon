package baekjoon;
import java.util.Scanner;
public class Zero {
	public static int size=0;
	public static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int sum=0;
		arr=new int[A];
		for(int i=0;i<A;i++) {
			int num=in.nextInt();
			if(num==0)pop();
			else push(num);
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static void push(int item) {
		arr[size]=item;
		size++;
	}
	public static int pop() {
		if(size==0)return -1;
		else {
			int temp=arr[size-1];
			arr[size-1]=0;
			size--;
			return temp;
		}
	}
}
