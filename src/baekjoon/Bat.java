package baekjoon;
import java.util.Scanner;
public class Bat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(true) {
		int input=in.nextInt();
		if(input==0)break;
		int count=0;
		for(int i=input+1;i<=input*2;i++) {
			if(prime(i))
				count++;
		}
		System.out.println(count);
		}
	}
	public static boolean prime(int num) {
		if(num==1)return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
