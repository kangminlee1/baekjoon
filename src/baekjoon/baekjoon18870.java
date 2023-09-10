package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.HashMap;

public class baekjoon18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] temp = new int[N];//정렬 전 상태 값 저장

		HashMap<Integer, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			temp[i] = arr[i];
		}
		
		Arrays.sort(arr);//압축하기 위해 정렬
		
		int count =0;
		for(int i : arr) {
			if(!map.containsKey(i)) {//for each문으로 HashMap에 key값이 존재하지 않으면 put하여 값을 저장
				map.put(i, count);
				count++;//저장 이후에 ++을 하여 값을 1 증가 시킴
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : temp) {//for each문을 사용하여
			sb.append(map.get(key)).append(' ');//HashMap에 있는 Value 값을 가져옴 ex) map.get(1) == map에 있는 1번 키값을 가진 value값
		}
		
		System.out.println(sb);
		
	}

}
