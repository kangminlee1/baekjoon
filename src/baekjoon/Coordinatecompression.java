package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;//HashMap사용하기 위해 임폴트
public class Coordinatecompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();//int타입 HashMap
		int A=in.nextInt();
		int[] arr=new int[A];
		int[] temp=new int[A];
		int count=0;
		for(int i=0;i<A;i++) {
			arr[i]=in.nextInt();
		}
		temp=arr.clone();//원본을 복사해둔다.
		Arrays.sort(arr);
		for(int i=0;i<A;i++) {
			if(!hash.containsKey(arr[i])) {//값이 중복되지 않을때만 map에 원소와 순위 대입
				hash.put(arr[i], count);
				count++;//hashmap에 넣고난 다음 count중가
			}
		}
		for(int i=0;i<A;i++) {
			System.out.print(hash.get(temp[i])+" ");
		}
		//HashMap 더 공부해보기
	}

}
