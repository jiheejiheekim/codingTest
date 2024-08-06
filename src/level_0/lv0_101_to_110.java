package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_101_to_110 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	101) 접두사인지 확인하기
		 	어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 
		 	예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
		 	문자열 my_string과 is_prefix가 주어질 때, 
		 	is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution101(String my_string, String is_prefix) {
	        int answer = 0;
	        String[] arr = new String[my_string.length()];
	        for(int i=0; i<arr.length; i++){
	        	arr[i] = my_string.substring(0, i+1);
	        }
	        
	        //System.out.println(Arrays.toString(arr));
	        
	        for(int j=0; j<arr.length; j++) {
	        	if(arr[j].equals(is_prefix)) {
	        		answer = 1; 
	        		break;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	102) 문자열의 앞의 n글자
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution102(String my_string, int n) {
	        String answer = "";
	        for(int i=0; i<n; i++){
	            answer += my_string.charAt(i);
	        }
	        return answer;
	    }
		
		/*
		 	103) 접미사인지 확인하기
			어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
			예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
			문자열 my_string과 is_suffix가 주어질 때, 
			is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution103(String my_string, String is_suffix) {
	        int answer = 0;
	        //is_suffix = "nan";
	        String[] arr = new String[my_string.length()];
	        for(int i=0; i<arr.length; i++){
	            arr[i] = my_string.substring(i, arr.length);
	        }
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i].equals(is_suffix)) {
	        		answer = 1;
	        	}
	        }
	        //System.out.println(Arrays.toString(arr));
	        return answer;
	    }
		
		/*
		 	104) 문자열의 뒤의 n글자
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution104(String my_string, int n) {
	        String answer = "";
	    	
	        StringBuilder sb = new StringBuilder();
	        for(int i=my_string.length()-1; i>=my_string.length()-n; i--) {
	        	sb.append(my_string.charAt(i));
	        }
	        answer = sb.reverse().toString();
	        return answer;
	    }
		
		/*
		 	105) 
		*/
		
		
		/*
		 	106) 
		*/
		
		
		/*
		 	107) 
		*/
		
		 
		/*
		 	108) 
		*/ 
		
		
		/*
		 	109) 
		*/
		
		
		/*
		 	110) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//101
		String my1011 = "banana";
		String my1012 = "ban";
		int result101 = sol.solution101(my1011, my1012);
		System.out.println("101번 문제 : "+result101);
		
		//102
		String my102 = "ProgrammerS123";
		int n102 = 11;
		String result102 = sol.solution102(my102, n102);
		System.out.println("102번 문제 : "+result102);
		
		//103
		String my1031 = "banana";
		String my1032 = "ana";
		int result103 = sol.solution103(my1031, my1032);
		System.out.println("103번 문제 : "+result103);
		
		//104
		String my104 = "He110W0r1d";
		int n104 = 5;
		String result104 = sol.solution104(my104, n104);
		System.out.println("104번 문제 : "+result104);
		
		//105
		
		//System.out.println("105번 문제 : "+result105);
		
		//106
		
		//System.out.println("106번 문제 : "+result106);
		
		//107
		
		//System.out.println("107번 문제 : "+result107);
		
		//108
		
		//System.out.println("108번 문제 : "+Arrays.deepToString(result108));
		
		//109
		
		//System.out.println("109번 문제 : "+Arrays.toString(result109));
		
		//110
		
		//System.out.println("70번 문제 : "+result110);

	}

}
