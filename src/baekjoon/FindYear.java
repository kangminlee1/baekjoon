package baekjoon;
import java.util.Scanner;
public class FindYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		int year=1;//연도 초기화
		int a=1,b=1,c=1;
		while(true) {
			if(A==a&&B==b&&C==c)break;
			a++;
			b++;
			c++;
			year++;
			if(a>15)a=1;
			if(b>28)b=1;
			if(c>19)c=1;
		}
		System.out.println(year);
	}

}
