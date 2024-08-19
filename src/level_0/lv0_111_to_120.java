package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		 	113) 두 수의 연산값 비교하기
		 	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
			12 ⊕ 3 = 123
			3 ⊕ 12 = 312
			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
			단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
		*/
		public int solution113(int a, int b) {
			int answer = 0;
	        String st_num1 = "";
	        int num1 = 0;
	        int num2 = 1;
	        
	        st_num1 = String.valueOf(a) + String.valueOf(b);
	        num1 = Integer.parseInt(st_num1);
	        
	        num2 = 2 * a * b;
	        
	        if(num1 >= num2) answer = num1;
	        else if(num1 < num2) answer = num2; 
	        
	        return answer;
	    }
		
		/*
		 	114) 더 크게 합치기
		 	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
			12 ⊕ 3 = 123
			3 ⊕ 12 = 312
			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
			
			단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
		*/
		public int solution114(int a, int b) {
			int answer = 0;
	        String st_num1 = String.valueOf(a) + String.valueOf(b);
	        String st_num2 = String.valueOf(b) + String.valueOf(a);
	        
	        int num1 = Integer.valueOf(st_num1);
	        int num2 = Integer.valueOf(st_num2);
	        
	        answer = (num1 >= num2)? num1:num2;
	        
	        return answer;
	    }
		
		/*
		 	115) 문자열 곱하기
		 	문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String solution115(String my_string, int k) {
	        String answer = "";
	        for(int i=0; i<k; i++){
	            answer += my_string;
	        }
	        return answer;
	    }
		
		/*
		 	116) 문자 리스트를 문자열로 변환하기
		 	문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
		*/
		public String solution116(String[] arr) {
	        String answer = "";
	        for(String st : arr){
	            answer += st;
	        }
	        return answer;
	    }
		
		/*
		 	117) 배열의 원소 삭제하기
		 	정수 배열 arr과 delete_list가 있습니다. 
		 	arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 
		 	유지한 배열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int[] solution117(int[] arr, int[] delete_list) {
			int[] answer = {};
			int index = 0;
	        List<Integer> list = new ArrayList();
	        
	        for(int i=0; i<arr.length; i++) {
	        	list.add(arr[i]);
	        }
	        //System.out.println(list.toString());
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<delete_list.length;j++){
	                if(arr[i] == delete_list[j]){
	                    list.remove(Integer.valueOf(arr[i]));
	                }
	            }
	        }
	        
	        answer = new int[list.size()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[index++] = list.get(i);
	        }
	        
	        //System.out.println(list.toString());
	        return answer;
	    }
		 
		/*
		 	118) 카운트업 
		 	정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		*/ 
		public int[] solution118(int start_num, int end_num) {
	        int[] answer = {};
	        answer = new int[end_num - start_num + 1];
	        int index = 0;
	        for(int i=start_num; i<=end_num; i++){
	            answer[index++] = i;
	        }
	        return answer;
	    }
		
		/*
		 	119) 접미사 배열
		 	어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
		 	예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		 	문자열 my_string이 매개변수로 주어질 때, 
		 	my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String[] solution119(String my_string) {
	        String[] answer = {};
	        answer = new String[my_string.length()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = my_string.substring(i);
	        }
	        //System.out.println(Arrays.toString(answer));
	        Arrays.sort(answer);
	        return answer;
	    }
		
		/*
		 	120) 조건에 맞게 수열 변환하기 3
		 	정수 배열 arr와 자연수 k가 주어집니다.
			만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
			이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요. 
		*/
		public int[] solution120(int[] arr, int k) {
			int[] answer = {};
	        answer = new int[arr.length];
	        for(int i=0; i<arr.length; i++){
	            if(k%2==0){
	                answer[i] = arr[i]+k;
	            }else {
	                answer[i] = arr[i]*k;
	            }
	        }
	        
	        return answer;
		}
		
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
		int a113 = 2;
		int b113 = 91;
		int result113 = sol.solution113(a113, b113);
		System.out.println("113번 문제 : "+result113);
		
		//114
		int a114 = 9;
		int b114 = 91;
		int result114 = sol.solution114(a114, b114);
		System.out.println("114번 문제 : "+result114);
		
		//115
		String st115 = "string";
		int k =3;
		String result115 = sol.solution115(st115, k);
		System.out.println("115번 문제 : "+result115);
		
		//116
		String[] arr116 = {"a","b","c"};
		String result116 = sol.solution116(arr116);
		System.out.println("116번 문제 : "+result116);
		
		//117
		int[] arr117 = {1, 2, 3, 4, 5};
		int[] delete117 = {1, 2, 3, 4};
		int []result117 = sol.solution117(arr117, delete117);
		System.out.println("117번 문제 : "+Arrays.toString(result117));
		
		//118
		int num1181 = 3;
		int num1192 = 10;
		int[] result118 = sol.solution118(num1181, num1192);
		System.out.println("118번 문제 : "+Arrays.toString(result118));
		
		//119
		String st119 = "banana";
		String[] result119 = sol.solution119(st119);
		System.out.println("119번 문제 : "+Arrays.toString(result119));
		
		//120
		int[] arr120 = {1, 2, 3, 100, 99, 98};
		int k120 = 3;
		int[] result120 = sol.solution120(arr120, k120);
		System.out.println("119번 문제 : "+Arrays.toString(result120));

	}

}
