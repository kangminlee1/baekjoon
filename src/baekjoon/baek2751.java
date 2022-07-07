package baekjoon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class baek2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		StringBuilder sb=new StringBuilder();
		int A=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<A;i++) {
			arr.add(in.nextInt());
		}
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			sb.append(arr.get(i)).append('\n');
		}
		System.out.println(sb);
	}

}
