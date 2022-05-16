package baekjoon;
import java.util.Scanner;
public class HCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String name=in.next();
		char[] nameLen=new char[name.length()];
		for(int i=0;i<name.length();i++) {
			nameLen[i]=name.charAt(i);
		}
		int A=in.nextInt();
		for(int i=0;i<A;i++) {
			int count=0;
			String str=in.next();
			int x=in.nextInt();
			int y=in.nextInt();
			char a=str.charAt(0);
			for(int j=x;j<=y;j++) {
				if(a==nameLen[j]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
