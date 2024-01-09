package baekjoon;
//문자열
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon1120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int result = a.length();
		//앞 뒤로 붙여보면서 가장 차이가 작을 떄를 찾는 것이 아님
		
		//B문자열을 하나씩 A문자열만큼 돌면서 A문자열과의 차이가 가장 적을 떄 그 차이를 출력하면 되는 문제
		for(int i =0; i< b.length() - a.length()+1; i++) {
			int temp = 0;
			for(int j = 0; j< a.length(); j++) {
				if(a.charAt(j)!=b.charAt(j+i)) {
					temp++;
				}
			}

			result = Math.min(result, temp);
			
		}
		System.out.println(result);
	}

}
