package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
//import java.util.HashMap;

public class baekjoon1244 {
//	public static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int person = Integer.parseInt(br.readLine());//남녀 수
		
		for(int i =0; i<person; i++) {
			st = new StringTokenizer(br.readLine());

			int sex = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if(sex==1) {
				for(int j = 0; j<N; j++) {
					if((j+1)%num==0) {
						if(arr[j]==1) {
							arr[j]=0;
						}else {
							arr[j]=1;
						}
					}
				}

			} else {//여자일 경우
				if(arr[num-1]==1) {
					arr[num-1]=0;
				}else {
					arr[num-1]=1;
				}
				//무조건 선택한 숫자는 변경 됨
				
				for(int j=1; j<N; j++) {
					if((num-1)-j < 0 || (num-1)+j >=N) {
						break;
					}
					if(arr[num-1+j] == arr[num-1-j]) {
						if(arr[num-1+j] == 1) {
							arr[num-1+j]=0;
						}else {
							arr[num-1+j]=1;
						}
						
						if(arr[num-1-j] == 1) {
							arr[num-1-j]=0;
						}else {
							arr[num-1-j]=1;
						}
					}else {
						break;
					}
				}
				
			}
		}
		
			
		for(int i=0; i<N;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
