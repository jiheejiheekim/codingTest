package level_0;

import java.util.ArrayList;
import java.util.Arrays;

import level_0.lv0_1_to_20.Solution;

public class lv0_31_to_40 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	31) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public String solution31(String my_string, int n) {
	        String answer = "";
	        char[] array = my_string.toCharArray();
	        for(int i=0; i<array.length; i++) {
	        	for(int j=0; j<n; j++) {
	        		answer += array[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	32) 배열의 유사도
		 	두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution32(String[] s1, String[] s2) {
	        int answer = 0;
	        for(int i=0; i<s1.length; i++) {
	        	for(int j=0; j<s2.length; j++) {
	        		if(s1[i].equals(s2[j])) {
	        			answer++;
	        			System.out.println(s1[i]+"  ==  "+s2[j]);
	        		}
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	33) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	34) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	35) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	36) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	37) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	38) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	39) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		/*
		 	40) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		
		
		
		
	
	
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//31
		String myString31 = "hello";
		int n31 = 3;
		String result31 = sol.solution31(myString31, n31);
		System.out.println("31번 문제 : "+result31);
		
		//32
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int result32 = sol.solution32(s1, s2);
		System.out.println("32번 문제 : "+result32);
		
		//33
		
		System.out.println("33번 문제 : ");
		
		//34
		
		System.out.println("34번 문제 : ");
		
		//35
		
		System.out.println("35번 문제 : ");
		
		//36
		
		System.out.println("36번 문제 : ");
		
		//37
		
		System.out.println("27번 문제 : ");
		
		//38
		
		System.out.println("28번 문제 : ");
		
		//29
		
		System.out.println("29번 문제 : ");
		
		//40
		
		System.out.println("40번 문제 : ");

	}

}
