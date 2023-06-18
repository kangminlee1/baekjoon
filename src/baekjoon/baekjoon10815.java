package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
public class baekjoon10815 {
	public static int binarySearch(int[] arr1, int n) {
		int first=0;
		int last=arr1.length-1;//마지막 인덱스
		
		while(first <= last) {
			int mid=(first+ last)/2;//중간 위치
			
			if(arr1[mid]>n) {//찾는 값이 더 작은 경우
				last=mid-1;
			}
			else if(arr1[mid]<n) {//찾는 값이 더 큰 경우
				first=mid+1;
			}
			else//찾는 값이랑 일치할 경우
				return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int A=in.nextInt();
		int[] arr1=new int[A];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=in.nextInt();
		}
		
		Arrays.sort(arr1);
		
		int B=in.nextInt();
		
		for(int i=0;i<B;i++) {
			if(binarySearch(arr1, in.nextInt())==1)
				System.out.print(1+" ");
			else
				System.out.print(0+" ");
		}
		
		
	}

}
