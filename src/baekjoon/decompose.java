package baekjoon;
import java.util.Scanner;
public class decompose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int result=0;
		for(int i=1;i<A;i++) {
			int num=digit(i);
			if(num==A) {
				result=i;
				break;
			}
		}
		System.out.println(result);
	}
	public static int digit(int num) {
		int sum=num;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}
