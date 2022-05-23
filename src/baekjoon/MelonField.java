package baekjoon;

import java.util.Scanner;

public class MelonField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();//참외수
		int[][] arr=new int[6][2];//가로 세로
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=in.nextInt();
			arr[i][1]=in.nextInt();
		}
		int widthMax=0;
		int widthNum=0;
		
		int heightMax=0;
		int heightNum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==1||arr[i][0]==2) {//가로
				if(widthMax<arr[i][1]) {
					widthMax=arr[i][1];
					widthNum=i;
				}
			}
			else if(arr[i][0]==3||arr[i][0]==4) {//세로
				if(heightMax<arr[i][1]) {
					heightMax=arr[i][1];
					heightNum=i;
				}
			}
		}
		int w=0;
		int h=0;
		if(widthNum==0)
			w=Math.abs(arr[5][1]-arr[widthNum+1][1]);
		else if(widthNum==5)
			w=Math.abs(arr[widthNum-1][1]-arr[0][1]);
		else
			w=Math.abs(arr[widthNum-1][1]-arr[widthNum+1][1]);
		if(heightNum==0)
			h=Math.abs(arr[5][1]-arr[heightNum+1][1]);
		else if(heightNum==5)
			h=Math.abs(arr[heightNum-1][1]-arr[0][1]);
		else
			h=Math.abs(arr[heightNum-1][1]-arr[heightNum+1][1]);
		
		int total=w*h;
		System.out.println((widthNum*heightNum-total)*A);
		// 5/23 쪽지 시험때문에 실패하였지만 내일 다시 시도
	}

}
