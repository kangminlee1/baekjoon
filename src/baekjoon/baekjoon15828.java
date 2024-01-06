package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Queue;
import java.util.LinkedList;

public class baekjoon15828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		while(true) {//큐를 사용하는 것은 알았지만 사용하지 않고 풀었었음
			int number = Integer.parseInt(br.readLine());
			if( number == -1) {
				break;
			}
			
			if(number == 0) {//이 부분들을 큐를 사용해 해결하는 것이 바로 떠오르지 않았음
				que.remove();
			} else if(N > que.size()) {
				que.add(number);
			}
			//그 결과 배열을 사용하여 해결하였었음
		}
		StringBuffer sb = new StringBuffer();
		
		if(que.isEmpty())
			System.out.println("empty");
		
		for(int i : que) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}
