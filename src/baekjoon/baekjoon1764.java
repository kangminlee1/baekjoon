package baekjoon;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon1764 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		
		int A=in.nextInt();
		int B=in.nextInt();
		
		for(int i=0;i<A;i++) {
			hs.add(in.next());
		}
		
		ArrayList<String> list = new ArrayList<String>();
	
		for(int i=0;i<B;i++) {
			String str=in.next();
			if(hs.contains(str)) {
				list.add(str);
			}
		}
		//Collections.sort(list,Collections.reverseOrder());//역순 정렬
		Collections.sort(list);
		
		System.out.println(list.size());
		for(String key: list) {
			System.out.println(key);
		}
	}

}
