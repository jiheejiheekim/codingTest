package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		 	105) 부분 문자열 이어 붙여 문자열 만들기
		 	길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. 
		 	parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
		 	각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution105(String[] my_strings, int[][] parts) {
	        String answer = "";
	        int j = 0;
	        int index1 = 0 ;
	        int index2 = 0 ;
	        for(int i=0; i<my_strings.length; i++) {
	        	j=0;
	        	index1 = parts[i][j];
	        	index2 = parts[i][j+1];
	        	answer += my_strings[i].substring(index1, index2+1);
	        }
	        return answer;
	    }
		
		/*
		 	106) 글자 이어 붙여 문자열 만들기
		 	문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. 
		 	my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution106(String my_string, int[] index_list) {
	        String answer = "";
	        for(int i=0; i<index_list.length; i++){
	            answer += my_string.charAt(index_list[i]);
	        }
	        return answer;
	    }
		
		/*
		 	107) 수 조작하기1
		 	정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, 
		 	control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
			"w" : n이 1 커집니다.
			"s" : n이 1 작아집니다.
			"d" : n이 10 커집니다.
			"a" : n이 10 작아집니다.
			위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
		*/
		public int solution107(int n, String control) {
	        int answer = 0;
	        answer = n;
	        for(int i=0; i<control.length(); i++){
	            if(control.charAt(i) == 'w') answer+=1;
	            if(control.charAt(i) == 's') answer-=1;
	            if(control.charAt(i) == 'd') answer+=10;
	            if(control.charAt(i) == 'a') answer-=10;
	        }
	        return answer;
	    }
		 
		/*
		 	108) n의 배수
		 	정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
		*/ 
		public int solution108(int num, int n) {
	        int answer = 0;
	        answer = (num%n==0)? 1:0;
	        return answer;
	    }
		
		/*
		 	109) 마지막 두 원소
		 	정수 리스트 num_list가 주어질 때, 
		 	마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
		 	마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution109(int[] num_list) {
			int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i : num_list) {
	            list.add(i);
	        }
	        if(list.get(list.size()-1) > list.get(list.size()-2)) list.add(list.get(list.size()-1)-list.get(list.size()-2));
	        else if(list.get(list.size()-1) <= list.get(list.size()-2)) list.add(list.get(list.size()-1)*2);

	        //System.out.println(list.toString());
	        answer = new int[list.size()];
	        for(int i=0; i<list.size(); i++){
	            answer[i] = list.get(i);
	        }
	        return answer;
	    }
		
		/*
		 	110) 이어 붙인 수
			정수가 담긴 리스트 num_list가 주어집니다. 
			num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution110(int[] num_list) {
			int answer = 0;
	        String st1 = "";
	        String st2 = "";
	        for(int i=0; i<num_list.length; i++){
	            if(num_list[i]%2==0){
	                st1 += String.valueOf(num_list[i]);
	            }else{
	                st2 += String.valueOf(num_list[i]);
	            }
	        }
	        answer = Integer.valueOf(st1) + Integer.valueOf(st2);
	        return answer;
	    }
		
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
		String[] arr1051 = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] arr1052 = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		String result105 = sol.solution105(arr1051, arr1052);
		System.out.println("105번 문제 : "+result105);
		
		//106
		String st106 = "cvsgiorszzzmrpaqpe";
		int arr106[] = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String result106 = sol.solution106(st106, arr106);
		System.out.println("106번 문제 : "+result106);
		
		//107
		int n107 = 0;
		String control107 = "wsdawsdassw";
		int result107 = sol.solution107(n107, control107);
		System.out.println("107번 문제 : "+result107);
		
		//108
		int num108 = 98;
		int n108 = 2;
		int result108 = sol.solution108(num108, n108);
		System.out.println("108번 문제 : "+result108);
		
		//109
		int[] arr109 = {5, 2, 1, 7, 5};
		int[] result109 = sol.solution109(arr109);
		System.out.println("109번 문제 : "+Arrays.toString(result109));
		
		//110
		int[] num_list110 = {3, 4, 5, 2, 1};
		int result110 = sol.solution110(num_list110);
		System.out.println("110번 문제 : "+result110);

	}

}
