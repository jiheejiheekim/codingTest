package level_0;

import java.util.ArrayList;
import java.util.List;

public class lv0_121_to_130 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	121) 꼬리 문자열
		 	문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다. 
		 	꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다. 
		 	예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 
		 	문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
			문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, 
			str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
		*/
		public String solution121(String[] str_list, String ex) {
	        String answer = "";
	        for(int i=0; i<str_list.length; i++) {
	        	if(str_list[i].contains(ex)) {
	        		//System.out.println(str_list[i]);
	        	}else {
	        		answer +=str_list[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	122) 부분 문자열
		 	어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 
		 	예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
			문자열 str1과 str2가 주어질 때, 
			str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution122(String str1, String str2) {
	        int answer = 0;
	        for(int i=0; i<=str2.length(); i++) {
	        	if(str2.contains(str1)) {
	        		//System.out.println(str1);
	        		answer = 1;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	123) 홀수 vs 짝수
		 	정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 
		 	홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 
		 	두 값이 같을 경우 그 값을 return합니다.
		*/
		public int solution123(int[] num_list) {
	        int answer = 0;
	        int hap1 = 0;
	        int hap2 = 0;
	        
	        for(int i=1; i<num_list.length; i+=2){
	        	if(num_list.length%2==0) {
	        		hap1 += num_list[i-1];
	        	}else {
	        		hap1 += num_list[i-1];
	        		if(i == num_list.length-2) {
	        			hap1 += num_list[num_list.length-1];
	        		}
	        	}
	        	//System.out.println("i는 : "+i+" / 합1 : "+num_list[i-1]);
	        	hap2 += num_list[i];
	        }
	        //System.out.println(hap1 + " / " + hap2);
	        answer = (hap1 >= hap2)? hap1:hap2;
	        return answer;
	    }
		
		/*
		 	124) 정수 찾기
		 	정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution124(int[] num_list, int n) {
	        int answer = 0;
	        for(int i=0; i<num_list.length; i++){
	            if(num_list[i] == n){
	            	//System.out.println(num_list[i]);
	            	answer = 1;
	            }
	        }
	        return answer;
	    }
		
		/*
		 	125) 부분 문자열인지 확인하기
		 	부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 
		 	예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, 
		 	"aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
		 	문자열 my_string과 target이 매개변수로 주어질 때, 
		 	target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution125(String my_string, String target) {
	        int answer = 0;
	        if(my_string.contains(target)) answer = 1;
	        return answer;
	    }
		
		/*
		 	126) 
		*/
		
		
		/*
		 	127) 
		*/
		
		 
		/*
		 	128) 
		*/ 
		
		
		/*
		 	129) 
		*/
		
		
		/*
		 	130) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//121
		String[] arr121 = {"abc", "def", "ghi"};
		String ex121 = "ef";
		String result121 = sol.solution121(arr121, ex121);
		System.out.println("121번 문제 : "+result121);
		
		//122
		String str1221 = "abc";
		String str1222 = "aabcc";
		int result122 = sol.solution122(str1221, str1222);
		System.out.println("122번 문제 : "+result122);
		
		//123
		int[] arr123 = {-1, 2, 5, 6, 3};
		int result123 = sol.solution123(arr123);
		System.out.println("123번 문제 : "+result123);
		
		//124
		int []list = {1,2,3,4,5};
		int n124 = 3;
		int result124 = sol.solution124(list, n124);
		System.out.println("124번 문제 : "+result124);
		
		//125
		String st125 = "banana";
		String st1252 = "ana";
		int result125 = sol.solution125(st125, st1252);
		System.out.println("125번 문제 : "+result125);
		
		//126
		
		//System.out.println("1212번 문제 : "+result126);
		
		//127
		
		//System.out.println("127번 문제 : "+result127);
		
		//128
		
		//System.out.println("128번 문제 : "+Arrays.deepToString(result128));
		
		//129
		
		//System.out.println("129번 문제 : "+Arrays.toString(result129));
		
		//130
		
		//System.out.println("10번 문제 : "+result130);

	}

}
