package baekjoon;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Yose {
	public static int size=0;
	public static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Queue<Integer>q=new LinkedList<>();
		int A=in.nextInt();
		int B=in.nextInt();
		
		for(int i=1;i<=A;i++) {
			q.add(i);
		}
		
		StringBuilder people=new StringBuilder();
		people.append('<');
		while(q.size()>1) {
			for(int i=0;i<B-1;i++) {
				int value=q.poll();
				q.offer(value);
			}
			people.append(q.poll()).append(" , ");
		}
		people.append(q.poll()).append('>');
		System.out.println(people);
	}

}
