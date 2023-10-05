package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class baekjoon25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		String[] arr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		
		double totalSum = 0;
		double sum = 0;
		int count = 0;
		
		for(int i = 0; i<20; i++) {		
			StringTokenizer st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			double num = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			if(grade.equals("P")) {
				count++;
				continue;
			}
			sum += num;
			for(int j =0; j<9;j++) {
				if(arr[j].equals(grade)) {
				totalSum += (score[j]*num);	
				} 
			}
			
		}
		
		System.out.println( totalSum /(sum));
	}

}
