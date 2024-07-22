package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_71_to_80_sample {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	71) 숨어있는 숫자의 덧셈 (2)
		 	문자열 my_string이 매개변수로 주어집니다. 
		 	my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
		 	my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution71(String my_string) {
	        int answer = 0;
	        String[] my = my_string.replaceAll("[A-Z]", " ").replaceAll("[a-z]", " ").split(" ");
	        
	        for(int i=0; i<my.length; i++) {
	        	if(!(my[i].equals(""))) {
	        		answer += Integer.parseInt(my[i]);
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	72) A로 B 만들기
		 	문자열 before와 after가 매개변수로 주어질 때, 
		 	before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution72(String before, String after) {
	        int answer = 0;
	        char[] arr1 = before.toCharArray();
	        char[] arr2 = after.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	        before = new String(arr1);
	        after = new String(arr2);
	        
	        if(before.equals(after)) {
	        	answer = 1;
	        } else {
	        	answer = 0;
	        }
	        return answer;
	    }
		
		/*
		 	73) 가까운 수
		 	정수 배열 array와 정수 n이 매개변수로 주어질 때, 
		 	array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
		*/
		public int solution73(int[] array, int n) {
	        int answer = 0;
	        Arrays.sort(array);
	        System.out.println(Arrays.toString(array));
	        
	        for(int i=0; i<array.length-1; i++){
	        	if(n - array[i] >= 0) {
	        		if(n - array[i] < n - array[i+1]){
	            		answer = array[i];
	            	}else if(n - array[i] == n - array[i+1]){
	            		if(array[i] > array[i+1]) {
	            			answer = array[i+1];
	            		}else {
	            			answer = array[i];
	            		}
	            	}else{	            	
	            		answer = array[i+1];
	            	}
	        	}else {
            		if(n - (array[i] * -1) < n - (array[i+1] * -1)) {
            			answer = array[i];
            		}else if(n - (array[i] * -1) == n - (array[i+1] * -1)) {
            			if(array[i] > array[i+1]) {
	            			answer = array[i+1];
	            		}else {
	            			answer = array[i];
	            		}
	        		}else {
            			answer = array[i+1];
            		}
            	}
	        }
	        return answer;
	    }
		
		/*
		 	74) 
		*/
		
		
		/*
		 	75) 
		*/
		
		
		/*
		 	76) 
		*/
		
		
		/*
		 	77) 
		*/
		
		 
		/*
		 	78) 
		*/ 
		
		
		/*
		 	79) 
		*/
		
		
		/*
		 	70) 
		*/
		
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//71
		String my71 = "aAb1B2cC34oOp";
		int result71 = sol.solution71(my71);
		System.out.println("71번 문제 : "+result71);
		
		//72
		String before = "olleh"; 
		String after = "hello";
		int result72 = sol.solution72(before, after); 
		System.out.println("72번 문제 : "+result72);
		
		//73
		int []arr73 = {21, 19, 12};
		int n73 = 20;
		int result73 = sol.solution73(arr73, n73);
		System.out.println("73번 문제 : "+result73);
		
		//74
		
		//System.out.println("74번 문제 : "+result74);
		
		//75
		
		//System.out.println("75번 문제 : "+result75);
		
		//76
		
		//System.out.println("77번 문제 : "+result76);
		
		//77
		
		//System.out.println("77번 문제 : "+result77);
		
		//78
		
		//System.out.println("77번 문제 : "+Arrays.deepToString(result78));
		
		//79
		
		//System.out.println("79번 문제 : "+Arrays.toString(result79));
		
		//80
		
		//System.out.println("70번 문제 : "+result80);

	}

}
