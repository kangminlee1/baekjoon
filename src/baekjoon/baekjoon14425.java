package baekjoon;

import java.util.Scanner;
import java.util.HashSet;

public class baekjoon14425 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		
		int M=in.nextInt();
		int N=in.nextInt();
		
		for(int i=0; i<M; i++) {
			hs.add(in.next());
		}
		
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(hs.contains(in.next()))
				count++;
		}
		
		System.out.println(count);
		
	}

}
