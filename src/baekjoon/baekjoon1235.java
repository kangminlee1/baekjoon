package baekjoon;
//학생번호 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

public class baekjoon1235 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] list = new String[N];
		Set<String> set = new HashSet<>();
		
		for(int i =0; i<N; i++) {
			list[i] = br.readLine();
		}
		int sl = list[0].length(); //문자열의 길이
		
		for(int i = 1; i<=sl; i++) {
			for(int j = 0; j<list.length; j++) {
				set.add(list[j].substring(sl-i));
			}
			if(set.size() == N) {//set은 중복을 허용하지 않기 때문에
				//원소 수와 학생 수가 같아질 때 값을 구한다 -> 학생 번호를 서로 다르게 만들 수 있는 최소의 수
				System.out.println(i);
				return; //종료
			}
			set.clear();//초기화 시켜주면서 해야 원소 수와 학생 수가 같아질 때를 구할 수 있음
		}
		

	}

}
