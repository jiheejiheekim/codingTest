package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_91_to_100_sample {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	91) 조건에 맞게 수열 변환하기
		 	정수 배열 arr가 주어집니다. 
		 	arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 
		 	그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
		*/
		public int[] solution91(int[] arr) {
	        int[] answer = {};
	        answer = new int[arr.length];
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i]>=50 && arr[i]%2==0) {
	        		answer[i] = arr[i]/2;
	        	}else if((arr[i]<50 && arr[i]%2==1) || arr[i]==1) {
	        		answer[i] = arr[i]*2;
	        	}else {
	        		answer[i] = arr[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	92) n보다 커질 때까지 구하기
		 	정수 배열 numbers와 정수 n이 매개변수로 주어집니다. 
		 	numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 
		 	이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution92(int[] numbers, int n) {
	        int answer = 0;
	        for(int i=0; i<numbers.length; i++) {
	        	answer += numbers[i];
	        	if(answer > n) {
	        		break;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	93) 
		*/
		
		
		/*
		 	94) 
		*/
		
		
		/*
		 	95) 
		*/
		
		
		/*
		 	96) 
		*/
		
		
		/*
		 	97) 
		*/
		
		 
		/*
		 	98) 
		*/ 
		
		
		/*
		 	99) 
		*/
		
		
		/*
		 	100) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//91
		int[] arr91 = {1, 2, 3, 100, 99, 98};
		int[] result91 = sol.solution91(arr91);
		System.out.println("91번 문제 : "+Arrays.toString(result91));
		
		//92
		int[] arr92 = {34, 5, 71, 29, 100, 34};
		int n92 = 123;
		int result92 = sol.solution92(arr92, n92);
		System.out.println("92번 문제 : "+result92);
		
		//93
		
		//System.out.println("93번 문제 : "+result93);
		
		//94
		
		//System.out.println("94번 문제 : "+result94);
		
		//95
		
		//System.out.println("95번 문제 : "+result95);
		
		//96
		
		//System.out.println("96번 문제 : "+result99);
		
		//97
		
		//System.out.println("97번 문제 : "+result97);
		
		//98
		
		//System.out.println("98번 문제 : "+Arrays.deepToString(result98));
		
		//99
		
		//System.out.println("99번 문제 : "+Arrays.toString(result99));
		
		//100
		
		//System.out.println("100번 문제 : "+result70);

	}

}