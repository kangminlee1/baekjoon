package baekjoon;

import java.util.Scanner;

public class baekjoon1789 {

	public static void main(String[] args) {
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

}
