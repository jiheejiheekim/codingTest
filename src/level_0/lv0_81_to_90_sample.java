package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_81_to_90_sample {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	81) 문자열 계산하기
		 	my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
		 	문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
		*/
		public int solution81(String my_string) {
	        int answer = 0;
	        String[] arr = my_string.split(" ");
	        //System.out.println(Arrays.toString(arr));
	        answer = Integer.parseInt(arr[0]);
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i].equals("+")) {
	        		answer += Integer.parseInt(arr[i+1]);
	        	}else if(arr[i].equals("-")) {
	        		answer -= Integer.parseInt(arr[i+1]);
	        	}
	        }
	        //System.out.println();
	        return answer;
	    }
		
		/*
		 	82) 
		*/
		
		
		/*
		 	83) 
		*/
		
		
		/*
		 	84) 
		*/
		
		
		/*
		 	85) 
		*/
		
		
		/*
		 	86) 
		*/
		
		
		/*
		 	87) 
		*/
		
		 
		/*
		 	88) 
		*/ 
		
		
		/*
		 	89) 
		*/
		
		
		/*
		 	90) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//81
		String my81 = "3 + 4 - 5 + 9";
		int result81 = sol.solution81(my81);
		System.out.println("81번 문제 : "+result81);
		
		//82
		
		//System.out.println("82번 문제 : "+result82);
		
		//83
		
		//System.out.println("83번 문제 : "+result83);
		
		//84
		
		//System.out.println("84번 문제 : "+result84);
		
		//85
		
		//System.out.println("85번 문제 : "+result85);
		
		//86
		
		//System.out.println("88번 문제 : "+result86);
		
		//87
		
		//System.out.println("87번 문제 : "+result87);
		
		//88
		
		//System.out.println("88번 문제 : "+Arrays.deepToString(result88));
		
		//89
		
		//System.out.println("89번 문제 : "+Arrays.toString(result89));
		
		//90
		
		//System.out.println("70번 문제 : "+result90);

	}

}
