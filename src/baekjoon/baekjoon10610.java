package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class baekjoon10610 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String str=in.next();
		int[] arr=new int[str.length()];
		int arrTotalCount=0;
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i)-48;//문자열을 int로 변환하여 저장
			arrTotalCount += arr[i];//각 자리수에 총합을 구함
		}
		Arrays.sort(arr);//배열의 저장된 정수를 정렬 시킴
		
		if((arrTotalCount%3==0)&&(arr[0]==0)) {//각 자리수에 총합이 3의 배수이고 0이 1개라도 들어 있을 경우 30의 배수가 가능함
			for(int i=str.length()-1;i>=0;i--) {//배열은 0~n-1까지임
				System.out.print(arr[i]);
			}
		}else//자리수 총합이 3의 배수가 아니거나 0이 1개라도 없으면 불가
			System.out.println(-1);
		
	}

}
//처음 이해했을 떄는 charAt()을 활용하여 1글자씩 떼서 조합하여 푸는 문제로 인식
//하지만 구글링을 통해 0이 1개라도 있고 자리수의 총합이 3의 배수일 때만 30의 배수가 가능하다는 것 인식
//그 후 문자열로 입력을 받고 charAt()을 활용하여 배열의 값 저장 + 자리 수 총합 반복문으로 저장
//배열을 정렬한 후 조건문으로 자리수 총합이 3의 배수이고 0이 1개라도 있을 경우에만 반복문으로 뒤에서부터 출력
//자리수 총합이 3의 배수가 아니거나 0이 없을 경우에는 -1 출력
