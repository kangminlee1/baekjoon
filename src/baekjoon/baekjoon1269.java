package baekjoon;

import java.util.Scanner;
import java.util.HashMap;

public class baekjoon1269 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		HashMap<Integer, Integer>hm1=new HashMap<>();
		HashMap<Integer, Integer>hm2=new HashMap<>();
		int A=in.nextInt();
		int B=in.nextInt();
		
		int count=0;
		
		for(int i=0;i<A;i++) {
			int num=in.nextInt();
			hm1.put(num, num);
		}
		
		for(int i=0;i<B;i++) {
			int num=in.nextInt();
			hm2.put(num, num);
		}
		
		for(int i: hm1.keySet()) {
			if(!hm2.containsKey(i))
				count++;
		}
		
		for(int i: hm2.keySet()){
			if(!hm1.containsKey(i))
				count++;
		}
		
		
		System.out.println(count);
		
	}

}
