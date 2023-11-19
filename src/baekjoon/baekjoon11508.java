package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

public class baekjoon11508 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//유제품 수
		Integer[] arr = new Integer[N];
		
		for(int i =0; i< N; i++) {
			int price = Integer.parseInt(br.readLine());
			arr[i] = price;
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			//내림차순으로 정렬한 다음 0,1,2 3,4,5 ... 이런식으로 묶어서 계산하는게 최소이므로
			//반복문에서 3으로 %연산을 하였을 때 2가 나오면 continue하면 된다.
			if(i%3 == 2) {
				continue;
			}
			sum+=arr[i];

		}
		
		System.out.println(sum);

	}

}
