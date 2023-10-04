package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon2993 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		while(TC-->0) {
			long N = Long.parseLong(br.readLine());
			long[] arr = new long[6];

			StringTokenizer st = new StringTokenizer(br.readLine());

			int count =1;
			long feed = 0;
			for(int i = 0; i<6; i++) {
				arr[i] = Long.parseLong(st.nextToken());
				feed += arr[i];
			}
			
			while(feed <= N) {
				feed *= 4;// 나, 양옆 , 맞은편 만큼 더하기 때문에 예를 들어 1번 돼지는 총 4번 더해지게 되므로 4배씩 늘어남
				count++;
			}
			
			sb.append(count).append("\n");
			
			
		}
		System.out.println(sb);
	}

}
