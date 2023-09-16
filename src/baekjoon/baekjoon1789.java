package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long S = Long.parseLong(br.readLine());
		long max = 0;//1부터 더해나가서 sum == S가 되게 더할 값들
		long sum = 0;

		int i = 1;
		while(sum<=S) {
				sum += i++;
				max++;
		}
		
		if(sum == S) {
			System.out.println(max);
		}else if(sum > S) {
			System.out.println(max - 1);
		}
	}
}

	
	










	/*
	
			Scanner in=new Scanner(System.in);
		
		long num=in.nextLong();
		long sum=0;
		int count=0;
		
		int i=0;
		while(sum<=num) {
			
			sum+=++i;
			count++;
		}
		
		if(sum==num)
			System.out.println(count);
		else if(sum>num)
			System.out.println(count-1);//초과했을경우는 1개를 빼줘야 같음
	}
	*/