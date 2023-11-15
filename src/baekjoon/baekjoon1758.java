package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class baekjoon1758 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//명 수
		
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		
		long total = 0;
		for(int i = 0; i<N; i++) {
			if(arr[i] - i > 0) {
				total += arr[i] -i;
			}else {
				break;
			}
		}
		
		System.out.println(total);
		
	}

}



/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//명 수
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list, Comparator.reverseOrder());
//		Collections.reverse(list);
		
		int total = 0;
		for(int i = 0; i<N; i++) {
			if(list.get(i)-i>0) {
				total += list.get(i) -(i);
			}else {
				break;
			}
		}
		
		System.out.println(total);

*/