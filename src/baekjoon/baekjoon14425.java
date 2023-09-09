package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.HashSet;

public class baekjoon14425 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<N;i++) {
			set.add(br.readLine());
		}
		
		int count = 0;
		for(int i=0;i<M;i++) {
			if(set.contains(br.readLine())) {
				count++;
			}
		}
		
		System.out.println(count);
				
	}
}

/*
 * 		Scanner in = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		
		int M=in.nextInt();
		int N=in.nextInt();
		
		for(int i=0; i<M; i++) {
			hs.add(in.next());
		}
		
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(hs.contains(in.next()))
				count++;
		}
		
		System.out.println(count);
		
	}
 */
