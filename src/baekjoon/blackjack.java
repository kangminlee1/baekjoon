package baekjoon;
import java.util.Scanner;
public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int card=in.nextInt();
		int totNum=in.nextInt();
		int[] arr=new int[card];
		for(int i=0;i<arr.length;i++) {//카드 수 만큼 입력
			arr[i]=in.nextInt();
		}
		int findNum=blackjackNum(arr,card,totNum);
		System.out.println(findNum);
	}
	public static int blackjackNum(int[] arr,int card, int totNum) {
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length-2;i++) {//굳이 뒤에서 2번째 까지는 탐색 안해도 된다.
			for(int j=i+1;j<arr.length-1;j++) {//이것도 뒤에서 1번째 까지는 탐색 안해도 된다.
				for(int k=j+1;k<arr.length;k++) {//여기서 검사를 하기 때문
					sum=arr[i]+arr[j]+arr[k];
					if(sum<=totNum) {
						if(max<sum)//해당하는 값중에서 가장 큰값을 구한다.
							max=sum;
					}
				}
			}
		}
		return max;
	}
}
