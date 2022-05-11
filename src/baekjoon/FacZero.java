package baekjoon;
import java.util.Scanner;
public class FacZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int count2=0;
		int count5=0;
		for(int i=1;i<=A;i++) {
			int num=i;
			while(num%2==0) {
				count2++;
				num/=2;
			}
			while(num%5==0) {
				count5++;
				num/=5;
			}
		}
		System.out.println(Math.min(count2, count5));
	}

}
