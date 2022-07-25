package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class baekjoon1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int num=in.nextInt();
		int[] arr=new int[num];
		int[] brr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<num;i++) {
			brr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(brr);
		int sum=0;
		for(int i=0;i<num;i++) {
			sum+=arr[i]*brr[(num-1)-i];
		}
	System.out.println(sum);	
	}

}
