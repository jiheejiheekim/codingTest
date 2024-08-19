package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_81_to_90 {
	
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
		 	82) 공백으로 구분하기 2
		 	단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
		 	my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String[] solution82(String my_string) {
	        String[] answer = {};
	        //my_string = "programmers";
	        String my = my_string.trim().replaceAll("  ", " ");
	        //System.out.println(my);
	        String arr[] = my.split(" ");
	        //System.out.println(Arrays.toString(arr));
	        
	        int index = 0;
	        for(int i=0; i<arr.length; i++) {
	        	if(!(arr[i].equals(""))) {
	        		index++;
	        	}
	        }
	        answer = new String[index];
	        //System.out.println(index);
	        int j = 0;
	        for(int i=0; i<arr.length; i++) {
	        	if(!(arr[i].equals(""))) {
	        		answer[j++] = arr[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	83) 공백으로 구분하기 1
		 	단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
		 	my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String[] solution83(String my_string) {
	        String[] answer = {};
	        String[] my = my_string.split(" ");
	        //int index = my_string.split(" ").length;
	        //System.out.println(Arrays.toString(my));
	        //answer = new String[index];
	        answer = my.clone();
	        return answer;
	    }
		
		/*
		 	84) 특정한 문자를 대문자로 바꾸기
		 	영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, 
		 	my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution84(String my_string, String alp) {
	        String answer = "";
	        for(int i=0; i<my_string.length(); i++) {
	        	if(my_string.charAt(i) == alp.charAt(0)) {
	        		answer += alp.toUpperCase();
	        	}else {
	        		answer += my_string.charAt(i);
	        	}
	        }
	        
	        return answer;
	    }
		
		/*
		 	85) 배열에서 문자열 대소문자 변환하기
		 	문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때, 
		 	배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
		 	짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
		*/
		public String[] solution85(String[] strArr) {
	        String[] answer = {};
	        answer = new String[strArr.length];
	        for(int i=0; i<answer.length; i++){
	            if(i%2==0){
	                answer[i] = strArr[i].toLowerCase();
	            }else{
	                answer[i] = strArr[i].toUpperCase();
	            }
	        }
	        return answer;
	    }
		
		/*
		 	86) 소문자로 바꾸기
		 	알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
		*/
		public String solution86(String myString) {
	        String answer = "";
	        answer = myString.toLowerCase();
	        return answer;
	    }
		
		/*
		 	87) 대문자로 바꾸기
		 	알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
		*/
		public String solution87(String myString) {
	        String answer = "";
	        answer = myString.toUpperCase();
	        return answer;
	    }
		 
		/*
		 	88) 원하는 문자열 찾기
		 	알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. 
		 	myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
			단, 알파벳 대문자와 소문자는 구분하지 않습니다.
		*/ 
		public int solution88(String myString, String pat) {
	        int answer = 0;
	        String my1 = myString.toLowerCase();
	        String my2 = pat.toLowerCase();
	        
	        answer = (my1.contains(my2))? 1:0;
	        return answer;
	    }
		
		/*
		 	89) 길이에 따른 연산
		 	정수가 담긴 리스트 num_list가 주어질 때, 
		 	리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution89(int[] num_list) {
	        int answer = 0;
	        int an2 = 1;
	        int len = num_list.length;
	        for(int i=0; i<len; i++) {
	        	if(len >= 11) {
	        		answer += num_list[i];
	        	}else {
	        		an2 *= num_list[i];
	        		answer = an2;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	90) 공배수
		 	정수 number와 n, m이 주어집니다. 
		 	number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution90(int number, int n, int m) {
	        int answer = 0;
	        answer = (number%n==0 && number%m==0)? 1:0;
	        return answer;
	    }
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//81
		String my81 = "3 + 4 - 5 + 9";
		int result81 = sol.solution81(my81);
		System.out.println("81번 문제 : "+result81);
		
		//82
		String my82 = " i    love  you";
		String[] result82 = sol.solution82(my82);
		System.out.println("82번 문제 : "+Arrays.toString(result82));
		
		//83
		String my83 = "i love you";
		String[] result83 = sol.solution83(my83);
		System.out.println("83번 문제 : "+Arrays.toString(result83));
		
		//84
		String my84 = "programmers";
		String alp84 = "p";
		String result84 = sol.solution84(my84, alp84);
		System.out.println("84번 문제 : "+result84);
		
		//85
		String[] arr85 = {"AAA","BBB","CCC","DDD"};
		String[] result85 = sol.solution85(arr85);
		System.out.println("85번 문제 : "+Arrays.toString(result85));
		
		//86
		String my86 = "aBcDeFg";
		String result86 = sol.solution86(my86);
		System.out.println("88번 문제 : "+result86);
		
		//87
		String my87 = "aBcDeFg";
		String result87 = sol.solution87(my87);
		System.out.println("87번 문제 : "+result87);
		
		//88
		String my88 = "AbCdEfG";
		String pat88 = "aBc";
		int result88 = sol.solution88(my88, pat88);
		System.out.println("88번 문제 : "+result88);
		
		//89
		int[] list89 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int result89 = sol.solution89(list89);
		System.out.println("89번 문제 : "+result89);
		
		//90
		int num90 = 60;
		int n = 2;
		int m = 3;
		int result90 = sol.solution90(num90, n, m);
		System.out.println("90번 문제 : "+result90);

	}

}
