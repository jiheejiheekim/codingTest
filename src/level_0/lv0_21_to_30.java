package level_0;

import java.util.Arrays;

import level_0.lv0_1_to_20.Solution;

public class lv0_21_to_30 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
			21) 배열 자르기
			정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
			numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int[] solution21(int[] numbers, int num1, int num2) {
			int[] answer = {};
	        answer = new int[num2 - num1 + 1];
	        for (int i = 0; i <= num2 - num1; i++) {
	            answer[i] = numbers[num1 + i];
	        }
	        return answer;
	    }
		
		/*
			22) 
			
		*/
		
		/*
			23) 
			
		*/
		
		/*
			24) 
			
		*/
		
		/*
			25) 
			
		*/
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//21
		//int []numbers21 = {1, 3, 5};
		int []numbers21 = {1, 2, 3, 4, 5};
		//int []numbers21 = {1, 2, 3, 4, 5 ,6, 7};
		//int []result21 = sol.solution21(numbers21, 1, 2);
		int []result21 = sol.solution21(numbers21, 1, 3);
		System.out.println("21번 문제 : "+Arrays.toString(result21));
		
		//22
		
		
		//23
		
		
		//24
		
		
		//25
		
		
		//26
		
		
		//27
		
		
		//28
		
		
		//29
		
		
		//30

	}

}
