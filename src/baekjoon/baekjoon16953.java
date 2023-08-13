package baekjoon;

import java.util.Scanner;

public class baekjoon16953 {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A=in.nextInt();
		int B=in.nextInt();
		
		int count = 1;//0이아니라 1인 이유는 A -> B에 필요한 연산의 최솟값 +1을 출력하기 위함

		while(A!=B) {
			if(A>B) {
				count=-1;
				break;
			}
			
			String str = String.valueOf(B);
			//자릿수 계싼하기 위해 str에 B를 문자열로 입력
			
			if(B%2!=0&&str.charAt(str.length()-1)!='1') {
				//B가 2로 나누어떨어지지 않고 끝자리가 1이 아닐 경우 A를 B로 만들 수 없음
				count=-1;
				break;
			}
			else if(B%2==0) {
				//B가 짝수 일 경우 즉, 2로 나누어 떨어질 경우
				B/=2;//B를 2로 나눈다.
			}
			else {//끝자리가 1이기만 할경우 1을 제거한다
				str=str.substring(0,str.length()-1);
				B=Integer.parseInt(str);//B에 끝자리를 지운 값을 저장 == 0부터 str.length()-1전 까지의 문자 저장
			}
			count++;//횟수 증가
		}
		System.out.println(count);
	}

}
