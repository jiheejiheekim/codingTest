package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_101_to_110_sample {
	
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
	        
	        System.out.println(Arrays.toString(arr));
	        
	        for(int j=0; j<arr.length; j++) {
	        	if(arr[j].equals(is_prefix)) {
	        		answer = 1; 
	        		break;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	102) 
		*/
		
		
		/*
		 	103) 
		*/
		
		
		/*
		 	104) 
		*/
		
		
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
		
		//System.out.println("102번 문제 : "+result102);
		
		//103
		
		//System.out.println("103번 문제 : "+result103);
		
		//104
		
		//System.out.println("104번 문제 : "+result104);
		
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
