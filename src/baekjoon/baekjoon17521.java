package baekjoon;
//bite coin
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon17521 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int date = Integer.parseInt(st.nextToken());
		long money = Long.parseLong(st.nextToken());
		
		int[] price = new int[date];
		
		for(int i = 0; i<date; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		
		long coin = 0;//구매 수
		//money랑 coin long으로 안해서 틀렸다 나왔음
		for(int i = 0; i<date -1 ; i++) {// 1~ <date까지로 했다가 수정
			if(coin == 0 && price[i] < price[i+1]) {
				coin = money/price[i];
				money -= coin * price[i];
			}
			
			if(price[i] > price[i+1]) {
				money += coin * price[i];
				coin = 0;
			}
			
		}
		
		money += coin*price[date-1];
		
		System.out.println(money);
		
	}

}
