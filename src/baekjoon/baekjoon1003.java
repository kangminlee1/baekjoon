package baekjoon;

import java.util.Scanner;

public class baekjoon1003 {
	
	//int 를 사용하지 않고 Integer를 사용하면 null값을 이용할 수 있다.(SQL에 용이하게 쓰임)

	static Integer[][] dp = new Integer[41][2];
	
	static Integer[] fibonacci(int N) {
		//N에 대한 0, 1의 호출 횟수가 없을 때(즉, 탐색하지 않은 값일 경우)
		
		if(dp[N][0] == null || dp[N][1] == null) {
	
			//각 N에 대한 0 호출 횟수와 1 호출 횟수 재귀 호출
			dp[N][0]=fibonacci(N-1)[0]+ fibonacci(N-2)[0];
			dp[N][1]=fibonacci(N-1)[1]+ fibonacci(N-2)[1];
			
		}//N에 대한 0과 1 -> [N][0]과 [N][1]을 담고있는 [N] 반환
			return dp[N];
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		dp[0][0]=1;
		dp[0][1]=0;
		//N=0일 경우의 0과 1의 호출 횟수
		
		dp[1][0]=0;
		dp[1][1]=1;
		//N=1일 경우의 0과 1의 호출 횟수
		
		int Tc=in.nextInt();
		
		while(Tc-->0) {
			int N=in.nextInt();
			
			fibonacci(N);
			System.out.println(dp[N][0]+ " " + dp[N][1]);
			
		}
		
						
		}
		
	}




//반복문으로 해결한 문제 처음에는 문제를 해결하였지만 시간 초과가 많이 발생하여 다른 사람의 코드 참조 하였음

//static int zero_count=0;
//static int one_count=0;
//	
//static void fibonacci(int N) {
//	int tempA=0;
//	int tempB=1;
//	int temp=0;
//	
//	if(N == 0) {
//		zero_count++;
//	}
//	else if(N == 1) {
//		one_count++;
//	}
//	else {
//		for(int i=1; i<N;i++) {
//			temp=tempA + tempB;
//			tempA=tempB;
//			tempB=temp;
//		}
//		zero_count = tempA;
//		one_count = tempB;
//	}
//}
//
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	int Tc = in.nextInt();
//	
//	while(Tc-->0) {
//		int N = in.nextInt();
//		fibonacci(N);
//		System.out.println(zero_count + " "+ one_count);
//		
//		zero_count=0;
//		one_count=0;
//					
//	}
//	
//}
//
//}
//


//이것은 새로운 방법으로 메모제이션을 활용하는 방법인데 Integer울 사용하는 방법이다
//int 를 사용하지 않고 Integer를 사용하면 null값을 이용할 수 있다.(SQL에 용이하게 쓰임)

//static Integer[][] dp = new Integer[41][2];
//
//static Integer[] fibonacci(int N) {
//	//N에 대한 0, 1의 호출 횟수가 없을 때(즉, 탐색하지 않은 값일 경우)
//	
//	if(dp[N][0] == null || dp[N][1] == null) {
//
//		//각 N에 대한 0 호출 횟수와 1 호출 횟수 재귀 호출
//		dp[N][0]=fibonacci(N-1)[0]+ fibonacci(N-2)[0];
//		dp[N][1]=fibonacci(N-1)[1]+ fibonacci(N-2)[1];
//		
//	}//N에 대한 0과 1 -> [N][0]과 [N][1]을 담고있는 [N] 반환
//		return dp[N];
//}
//
//
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	
//	dp[0][0]=1;
//	dp[0][1]=0;
//	//N=0일 경우의 0과 1의 호출 횟수
//	
//	dp[1][0]=0;
//	dp[1][1]=1;
//	//N=1일 경우의 0과 1의 호출 횟수
//	
//	int Tc=in.nextInt();
//	
//	while(Tc-->0) {
//		int N=in.nextInt();
//		
//		fibonacci(N);
//		System.out.println(dp[N][0]+ " " + dp[N][1]);
//		
//	}
//	
//					
//	}
//	
//}

//int는 자료형
//
//산술 연산 가능
//null로 초기화 불가능
//저장공간이 4Byte라고 작음
// 
//
//Integer
//
//Unboxing하지 않을 시 산술 연산이 불가능
//null 값으로 처리 가능
//저장공간이 큼
//null값으로 처리가 가능해 SQL에 용이하게 쓰인다.


