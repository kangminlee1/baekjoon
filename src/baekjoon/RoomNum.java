package baekjoon;
import java.util.Scanner;
public class RoomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String A=in.next();
		int count=0;
		int[] arr=new int[10];
		for(int i=0;i<A.length();i++) {
			int digit=A.charAt(i)-'0';
			if(digit==9)
				digit=6;
			arr[digit]++;
		}
		arr[6]=arr[6]/2+arr[6]%2;
		for(int i=0;i<10;i++) {
			count=Math.max(count, arr[i]);
		}
		System.out.println(count);
	}

}
