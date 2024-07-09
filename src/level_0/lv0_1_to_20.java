package level_0;

import java.util.ArrayList;
import java.util.Arrays;

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
	        if(angle>0 && angle<90) {
	            answer=1;
	        }else if(angle==90){
	            answer=2;
	        }else if(angle>90 && angle<180){
	            answer=3;
	        }else if(angle==180){
	            answer=4;
	        }
	        return answer;
	    }
		
		/*
			11) 짝수의 합
			정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
		*/
		public int solution11(int n) {
			 int answer = 0;
		        if(n>0 && n<=1000){
		            for(int i=1; i<=n; i++){
		                if(i%2==0){
		                    answer+=i;
		                }
		            }
		        }
		        return answer;
	    }
		
		/*
			12) 배열 뒤집기
			정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
			num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution12(int[] num_list) {
			int[] answer = {};
	        int len = num_list.length;
	        answer = new int[len];
	        for(int i=0; i<len; i++){
	            answer[i] = num_list[len-i-1];
	        }
	        return answer;
	    }
		
		/*
			13) 중복된 숫자 개수
			정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, 
			array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution13(int[] array, int n) {
			int answer = 0;
	        for(int i=0; i<array.length; i++){
	            if(array[i]==n){
	                answer++;
	            }
	        }
	        return answer;
	    }
		
		/*
			14) 머쓱이보다 키 큰 사람
			머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
			머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 
			머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution14(int[] array, int height) {
			int answer = 0;
	        for(int i=0; i<array.length; i++){
	            if(height<array[i]){
	                answer++;
	            }
	        }
	        return answer;
	    }
		
		/*
			15) 배열 두 배 만들기
			정수 배열 numbers가 매개변수로 주어집니다. 
			numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution15(int[] numbers) {
			int[] answer = {};
	        answer = new int[numbers.length];
	        for(int i=0; i<numbers.length; i++){
	            answer[i] = numbers[i] * 2;
	        }
	        return answer;
	    }
		
		/*
		16) 중앙값 구하기
			중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
			예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution16(int[] array) {
			int answer = 0;
	        int n= array.length;
	        //Arrays.sort(array);
	        for(int i=0; i<n-1; i++) {
	            for(int j=0; j<n-i-1; j++) {
	                if(array[j] > array[j+1]) {
	                    int num = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = num;
	                }
	            }
	        }
	        int result = array.length/2;
	        answer = array[result];
	        return answer;
	    }
		
		/*
			17) 짝수는 싫어요
			정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution17(int n) {
	        int[] answer = {};
	        if(n%2==0){
	        	answer = new int[n/2];
	        	answer[0] = 1;
	            for(int i=1; i<answer.length; i++) {
	            	answer[i] = 2*i+1;
	            }
	        }else {
	        	answer = new int[n/2+1];
	        	answer[0] = 1;
	            for(int i=1; i<answer.length; i++) {
	            	answer[i] = 2*i+1;
	            }
	        }
	        return answer;
	    }
		
		/*
			18) 피자 나눠 먹기 (1)
			머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
			피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		*/
		public int solution18(int n) {
			int answer = 0;
	        if(7>=n){
	            answer = 1;
	        }else if(n%7==0){
	            answer = n/7;
	        }else{
	            answer = n/7+1;
	        }
	        return answer;
	    }
		
		/*
			19) 옷가게 할인 받기
			머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
			구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution19(int price) {
			int answer = 0;
	        if(price>=500000){
	            answer = (int)(price - (price * 0.2));
	        }else if(price>=300000){
	            answer = (int)(price - (price * 0.1));
	        }else if(price>=100000){
	            answer = (int)(price - (price * 0.05));
	        }else{
	            answer = price;
	        }
	        return answer;
	    }
		
		/*
			20) 아이스 아메리카노
			머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
			머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int[] solution20(int money) {
	        int[] answer = {};
	        answer = new int[2];
	        if(money<5500) {
	        	answer[0] = 0;
	        	answer[1] = money;
	        }else if(money>=5500) {
	        	answer[0] = money / 5500;
	        	answer[1] = money % 5500;
	        }
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
       	int result10 = sol.solution10(95);
       	System.out.println("10번 문제 : "+result10);
       	
       	//11
       	int result11 = sol.solution11(18);
       	System.out.println("11번 문제 : "+result11);
       	
       	//12
       	int[] num_list = {1, 2, 3, 4, 5};
       	
       	int[] answer = {};
        int len = num_list.length;
        answer = new int[len];
        //System.out.println(num_list[len-1]);
        for(int i=0; i<len; i++){
            answer[i] = num_list[len-i-1];
        }
        System.out.print("12번 문제 : "+Arrays.toString(answer));
	
		//13
        int[] array13 = {1, 2, 1, 4, 1};
        int n13 = 1;
        int result13 = sol.solution13(array13, n13);
        System.out.println("\n13번 문제 : "+result13);
        
		//14
        int[] array14 = {165, 182, 170, 164, 158};
        int result14 = sol.solution14(array14, 168);
        System.out.println("14번 문제 : "+result14);
		
		//15
        int[] array15 = {5, 2, 1, 14, 8};
        int[] result15 = sol.solution15(array15);
        System.out.println("15번 문제 : "+Arrays.toString(result15));
        
        //16
        int[] array16 = {9, -1, 0};
        int result16 = sol.solution16(array16);
        System.out.println("16번 문제 : "+result16);
        
        //17
        int[] result17 = sol.solution17(10);
        System.out.println("17번 문제 : "+Arrays.toString(result17));
        
        //18
        int result18 = sol.solution18(8);
        System.out.println("18번 문제 : "+result18);
        
        //19
        int result19 = sol.solution19(380000);
        System.out.println("19번 문제 : "+result19);
        
        //20
        int[] result20 = sol.solution20(8000);
        System.out.println("20번 문제 : "+Arrays.toString(result20));
        
	}
}
