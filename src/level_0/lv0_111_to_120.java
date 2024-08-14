package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_111_to_120 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	111) 원소들의 곱과 합
		 	정수가 담긴 리스트 num_list가 주어질 때, 
		 	모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution111(int[] num_list) {
	        int answer = 0;
	        int num1 = 1;
	        int num2 = 0;
	        
	        for(int i : num_list) {
	        	num1 *= i;
	        	num2 += i;
	        }
	        num2*=num2;
	        //System.out.println(num1+"  /  "+num2);
	        if(num1 < num2) answer = 1;
	        
	        return answer;
	    }
		
		/*
		 	112) 홀짝에 따라 다른 값 반환하기
		 	양의 정수 n이 매개변수로 주어질 때, 
		 	n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
		 	n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution112(int n) {
			int answer = 0;
	        for(int i=1; i<=n; i++){
	            if(n%2!=0){
	                if(i%2!=0) {
	                    answer += i;
	                }
	            }else{
	            	if(i%2==0) {
	                    answer += i*i;
	                }
	            }
	        }
	        return answer;
	    }
		
		/*
		 	113) 
		*/
		
		
		/*
		 	114) 
		*/
		
		
		/*
		 	115) 
		*/
		
		
		/*
		 	116) 
		*/
		
		
		/*
		 	117) 
		*/
		
		 
		/*
		 	118) 
		*/ 
		
		
		/*
		 	119) 
		*/
		
		
		/*
		 	120) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//111
		int[] list111 = {3, 4, 5, 2, 1};
		int result111 = sol.solution111(list111);
		System.out.println("111번 문제 : "+result111);
		
		//112
		int n112 = 7;
		int result112 = sol.solution112(n112);
		System.out.println("112번 문제 : "+result112);
		
		//113
		
		//System.out.println("113번 문제 : "+result113);
		
		//114
		
		//System.out.println("114번 문제 : "+result114);
		
		//115
		
		//System.out.println("115번 문제 : "+result115);
		
		//116
		
		//System.out.println("116번 문제 : "+result116);
		
		//117
		
		//System.out.println("117번 문제 : "+result117);
		
		//118
		
		//System.out.println("118번 문제 : "+Arrays.deepToString(result118));
		
		//119
		
		//System.out.println("119번 문제 : "+Arrays.toString(result119));
		
		//120
		
		//System.out.println("120번 문제 : "+result120);

	}

}
