package level_0;

public class lv0_1_to_20 {
	
	static class Solution{
		/*
			8) 두 수의 나눗셈
			정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
		*/
		public int solution8(int num1, int num2) {
			int answer = 0;
	        double num11 = num1;
	        double num22 = num2;
	        if(num1>0 && num1<=100 && num2>0 && num2<=100){
	            double answer1 = (num11 / num22);
	            answer = (int)(answer1 * 1000);
	        }
	        return answer;
	    }
		
		/*
			9) 배열의 평균값
			정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
		*/
		public double solution9(int[] numbers) {
			double answer = 0;
	        int result = 0;
			double inum = 0;
			for(int i = 0; i<numbers.length; i++) {
				result += numbers[i];
				inum = i+1;
			}
			answer = result / inum;
	        return answer;
	    }
		
		/*
			10) 각도기
			각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 
			각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution10(int angle) {
	        int answer = 0;
	        return answer;
	    }
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//8
		int answer8 = sol.solution8(3, 2);
		System.out.println("8번 문제 : "+answer8);
		
		//9
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer9 = sol.solution9(numbers);
       	System.out.println("9번 문제 : "+answer9);
       	
       	//10
       	
       	//11
		
	}

}
