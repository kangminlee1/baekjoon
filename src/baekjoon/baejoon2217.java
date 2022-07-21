package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class baejoon2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] arr=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);//정렬을 시킨후 뒤에서 부터 찾기
		for(int i=N-1;i>=0;i--) {
			arr[i]=arr[i]*(N-i);//무거운 순서이기 때문에 뒤에서부터 체크
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}
}