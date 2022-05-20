package baekjoon;

import java.util.Scanner;

public class LostBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=Integer.MAX_VALUE;
		String[] str=in.nextLine().split("-");
		
		for(int i=0;i<str.length;i++) {
			int temp=0;
			String[] arr=str[i].split("\\+");
			for(int j=0;j<arr.length;j++) {
				temp+=Integer.parseInt(arr[j]);
			}
			if(sum==Integer.MAX_VALUE) {
				sum=temp;
			}
			else {
				sum-=temp;
			}
		}
		System.out.println(sum);
	}
}
