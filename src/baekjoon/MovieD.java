package baekjoon;
import java.util.Scanner;
public class MovieD {
//valueOf()메소드는 원하는 타입으로 변환가능
//contains()메소드는 String타입에서 원하는 문자열 포함 여부 확인
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=1;
		int movieNum=666;
		while(count!=num) {
			movieNum++;
			if(String.valueOf(movieNum).contains("666")) {
				count++;
			}
		}
		System.out.println(movieNum);
	}
}
