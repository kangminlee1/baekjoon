package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class baekjoon1251 {
	/*뒤집는거 만들다가 더 간단한 방법 찾음
	public static void reverse(String[] arr) {
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				temp.append(Character.toString(arr[i].charAt(j)));
			}
		}
		
	}
	*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		//String[] arr = new String[3];//세 단어 저장할 공간으로 사용할려 했지만 StringBuilder 쓰는 방법이 간단하여 변경
		
		List<String> list = new ArrayList<>();
		for(int i=1;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
//				arr[0]=str.substring(0, i);
//				arr[1]=str.substring(i, j);
//				arr[2]=str.substring(j, str.length());
				StringBuilder sb1 = new StringBuilder(str.substring(0, i));
				StringBuilder sb2 = new StringBuilder(str.substring(i, j));
				StringBuilder sb3 = new StringBuilder(str.substring(j, str.length()));

				String str1 = sb1.reverse().toString();
				String str2 = sb2.reverse().toString();
				String str3 = sb3.reverse().toString();
				
				list.add(str1 + str2 + str3);
			}
		}
		Collections.sort(list);
		//보편적으로 배열을 정렬할 땐 Arrays.sort(), 컬렉션(List,Set..)을 정렬할 땐 Collections.sort()를 사용한다.
		//Arrays.sort를 왜 안쓰나 했다 찾아봄
		//Collections.sort는 삽입정렬과 합병정렬을 결합하여 평균 최악 모두 O(nlogn)이라 컬렉션 정렬할때 사용한다함
		
		System.out.println(list.get(0));
		
	}

}
