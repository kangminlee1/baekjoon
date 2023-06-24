package baekjoon;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
//import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class beakjoon7785 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		HashMap<String, String>hm=new HashMap<>();
		int num=in.nextInt();
		
		for(int i=0;i<num;i++) {
			String name=in.next();
			String str=in.next();
			if(str.equals("enter")) {
				hm.put(name, str);
			}
			else if(str.equals("leave")) {
				hm.remove(name);
			}
		}
//		for(Map.Entry<String,String> entry : hm.entrySet()) {
//		    System.out.println(entry.getKey());
//		}
		ArrayList<String> list = new ArrayList<String>(hm.keySet());
		Collections.sort(list,Collections.reverseOrder());//역순 정렬
		for(String key: list) {
			System.out.println(key);
		}
		
	}

}//Collections에 대한 지식 부족으로 해맸음 추가 공부 필요
