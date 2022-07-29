package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class baekjoon {
	static int n, m;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		m=in.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<m;i++) {
			int num=in.nextInt();
			if(binarySearch(num))System.out.print("1");
			else System.out.print("0");
		}
	}
	 private static boolean binarySearch(int num) {
	        int leftIndex = 0;
	        int rightIndex = n - 1;

	        while(leftIndex <= rightIndex){
	            int midIndex = (leftIndex + rightIndex) / 2;
	            int mid = arr[midIndex];

	            if(num < mid) rightIndex = midIndex - 1;
	            else if(num > mid) leftIndex = midIndex + 1;
	            else return true;
	        }
	        return false;
	    }
}
