package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class baekjoon1380 {
	
	public static StringBuffer sb = new StringBuffer();
	public static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int scene_num =1; //시나리오 번호는 1번부터라 써있음
		while(true) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				break;
			
			}
			String[] arr = new String[N];
			for(int i=0; i < N;i++) {
				String str = br.readLine();
				arr[i] = str;
			}
			
			List<String> list = new ArrayList<>();
			
			for(int i = 0; i < (2*N-1); i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String num = st.nextToken();
				String AB = st.nextToken();
				//AB여부는 두번째로 등장할 때 A와 B가 뒤집혀서 적는 조건이 있음

				if(list.contains(num)) {
					list.remove(num);//숫자가 존재하면 뺴기
				}else {
					list.add(num);//숫자가 없으면 더함
				}
				
			}
			Integer name_num =Integer.parseInt(list.get(0))-1;
			//String to Integer 하고 배열에 첫번째 인덱스 값 0부터
			
			sb.append(scene_num++).append(" ").append(arr[name_num]).append("\n");
			
		}
		
		System.out.println(sb);
	}

}
