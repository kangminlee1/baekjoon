package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class baekjoon1094 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Num = 64;
		
		int count=0;
		int sum = 0;
		while(X>0) {

			if(X<Num) {
				Num/=2;
			}
			else {
				count++;
				X -= Num;
			}

		}
		System.out.println(count);
	}

}
