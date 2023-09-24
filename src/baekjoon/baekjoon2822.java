package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.Comparator;

public class baekjoon2822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[8][2];
		int[] result = new int[5];
		int sum = 0;
		
		for(int i = 0; i< 8;i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i;
		}
		Arrays.sort(arr, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
						if(o1[0]<o2[0])
							return 1;
						else if(o1[0] == o2[0])
							return 0;
						else
							return -1;
				}
		});

		for(int i =0; i <5; i++) {
			sum += arr[i][0];
			result[i] = arr[i][1] + 1;
		}
		StringBuffer sb = new StringBuffer();
		
		Arrays.sort(result);//다시 오름 차수능로 정렬
		sb.append(sum).append("\n");
		for(int i =0; i<5; i++) {
			sb.append(result[i]).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
