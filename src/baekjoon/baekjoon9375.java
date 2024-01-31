package baekjoon;
//패션왕 신해빈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int TC = Integer.parseInt(br.readLine());//테스트 케이스

		StringTokenizer st;
		for(int i = 0; i < TC; i++) {
			HashMap<String, Integer> map = new HashMap<>();//종류와 개수
			
			int N = Integer.parseInt(br.readLine());//옷의 수
			
			for(int j =0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				
				String name = st.nextToken();//옷 이름
				String kind = st.nextToken();//옷 종류
				
				if(map.containsKey(kind)) {//옷의 종류가 있을 경우
					map.put(kind, map.get(kind) + 1);//겹칠떄마다 +1을 함
				} else {
					map.put(kind, 1);//옷의 종류가 없을 때
				}
				
				
			}	
			
			//예제 처럼 입력을 할경우 경우의 수는
			//모자 = 야구모자, 비니, 안입음 = 3가지
			//안경 = 선글라스, 안입음 = 2가지
			//따라서 모자는 3개중에 1개, 안경은 2개중에 1개를 고르면 된다.
			//조합에 따른 총 횟수는 3*2 = 6이다.
			//그럴경우 모자와 안경을 쓰지 않는 경우가 1가지 발생하므로 -1을 하여
			//아무것도 입지 않은 상태를 제거한다.
			int count = 1;
			for(int val : map.values()) {
				count *=(val + 1);//+1은 그 종류를 입지 않았을 때의 경우를 의미
			}
			System.out.println(count - 1);//아무것도 안입은 상태 제외
			
		}
		
		
		
	}

}
