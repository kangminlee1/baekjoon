package baekjoon;

public class selfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr=new boolean[10001];//1~10000까지 사용할것임
		for(int i=1;i<=10000;i++) {
			int selfNum=find(i);
			if(selfNum<=10000) {
				arr[selfNum]=true;//생성자 있으면 true로 저장
			}
		}
		for(int i=1;i<=10000;i++) {
			if(!arr[i])//false인 경우만 출력
				System.out.println(i);
		}
	}
	public static int find(int num) {
		int sum=num;
		while(num!=0) {//디지트의 합
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

}
