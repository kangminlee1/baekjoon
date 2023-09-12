package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class baekjoon1308 {
	

	public static int[] calcYear(int y) {
		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		/*
		if(y%4==0) {//윤년

			if(y%100==0) {//평년

				if(y%400==0) {//윤년

				}
			}
		}//무식한 방법
		*/
		
		if(y%4==0 && y%100!=0 || y%400==00) {//운년
			day[1]=29;
		}
		return day;
		
	}
	
	public static long calcDay(int y, int m, int d) {
		int[] day;
		
		long sum = 0;
		for (int i = 1; i < y; i++) {
			day = calcYear(i);
			for (int j = 0; j < 12; j++) {
				sum+=day[j];
			}
		}//해당 년도 전까지는 1월~12월까지 윤년 계산해서 날짜를 더해줌 
		
		day = calcYear(y);
		for (int i = 0; i < m-1; i++) {
			//해당 년도에 해당월 까지 더함
			sum += day[i];
			
		}

		return sum + d;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int ty = Integer.parseInt(st.nextToken());
		int tm = Integer.parseInt(st.nextToken());
		int td = Integer.parseInt(st.nextToken());
		//t== Today
		st = new StringTokenizer(br.readLine(), " ");
		int ddy = Integer.parseInt(st.nextToken());
		int ddm = Integer.parseInt(st.nextToken());
		int ddd = Integer.parseInt(st.nextToken());
		//dd==D-Day
		
		
		if((ddy-ty > 1000) || ((ddy - ty == 1000) && ddm > tm ) 
				||( (ddy - ty == 1000) && ddm==tm && ddd >= td )) {
			//년도 차이가 1000년이 넘으면 gg, 년도 차가 1000년인데 1. 월 차이가 난다면 gg 2. 월도 같은데 날짜가 같거나 d-day가 더 크면 gg
			System.out.println("gg");
		}else {
			long T_day = calcDay(ty, tm, td);
			long D_day = calcDay(ddy, ddm, ddd);
			
			System.out.println("D-" + (D_day - T_day));
		}
		
	}

}
