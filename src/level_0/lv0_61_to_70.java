package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class lv0_61_to_70 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	61) 문자열을 정수로 변환하기
		 	숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution61(String n_str) {
	        int answer = 0;
	        answer = Integer.parseInt(n_str);
	        return answer;
	    }
		
		/*
		 	62) 문자열 정수의 합
		 	한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution62(String num_str) {
	        int answer = 0;
	        String[] arr = num_str.split("");
	        for(int i=0; i<arr.length; i++){
	            answer += Integer.valueOf(arr[i]);
	        }
	        return answer;
	    }
		
		/*
		 	63) 정수 부분
		 	실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요. 
		*/
		public int solution63(double flo) {
	        int answer = 0;
	        answer = (int)flo;
	        return answer;
	    }
		
		/*
		 	64) 뒤에서 5등 위로
		 	정수로 이루어진 리스트 num_list가 주어집니다. 
		 	num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
		*/
		public int[] solution64(int[] num_list) {
	        int[] answer = {};
	        answer = new int[num_list.length-5];
	        Arrays.sort(num_list);
	        for(int i=0; i<num_list.length-5; i++){
	            answer[i] = num_list[i+5];
	        }
	        return answer;
	    }
		
		/*
		 	65) 뒤에서 5등까지
		 	정수로 이루어진 리스트 num_list가 주어집니다. 
		 	num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution65(int[] num_list) {
			int[] answer = {};
	        answer = new int[5];
	        Arrays.sort(num_list);
	        for(int i=0; i<5; i++){
	            answer[i] = num_list[i];
	        }
	        return answer;
	    }
		
		/*
		 	66) 배열 비교하기
		 	이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
			- 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
			- 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
			두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, 
			arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution66(int[] arr1, int[] arr2) {
	        int answer = 0;
	        int sum1 = 0;
	        int sum2 = 0;
	        
	        if(arr1.length == arr2.length) {
	        	for(int i=0; i<arr1.length; i++) {
	        		sum1 += arr1[i];
	        		sum2 += arr2[i];
	        	}
	        	if(sum1 > sum2) {
	        		answer = 1;
	        	}else if(sum1 < sum2) {
	        		answer = -1;
	        	}else {
	        		answer = 0;
	        	}
	        }else {
	        	if(arr1.length > arr2.length) {
	        		answer = 1;
	        	}else {
	        		answer = -1;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	67) 배열의 원소만큼 추가하기
		 	아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
		 	양의 정수 배열 arr가 매개변수로 주어질 때, 
		 	arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 
		 	X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
		*/
		public int[] solution67(int[] arr) {
	        int[] answer = {};
	        int sum = 0;
	        for(int i=0; i<arr.length; i++){
	            sum += arr[i];
	        }
	        answer = new int[sum];
	        int z = 0;
        	for(int i=0; i<arr.length; i++){
        		for(int k=0; k<arr[i]; k++){
	                answer[z++] = arr[i];
        		}
	        }
	        
	        return answer;
	    }
		 
		/*
		 	68) rny_string
			'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 
			문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/ 
		public String solution68(String rny_string) {
	        String answer = "";
	        answer = rny_string.replaceAll("m", "rn");
	        return answer;
	    }
		
		/*
		 	69) 문자열 바꿔서 찾기
		 	문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
		 	myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 
		 	아니면 0을 return 하는 solution 함수를 완성하세요.
		*/
		public int solution69(String myString, String pat) {
	        int answer = 0;
	        String[] arr = myString.split("");
	        String mys = "";
	        
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i].equals("A")) {
	        		arr[i] = "B";
	        	}else {
	        		arr[i] = "A";
	        	}
	        	mys += arr[i];
	        }
	        
	        for(int i=0; i<pat.length(); i++) {
	        	if(mys.contains(pat)) {
	        		answer = 1;
	        	}else {
	        		answer = 0;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	70) 공백으로 구분하기
		 	단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
		 	my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		*/
		public String[] solution70(String my_string) {
			String[] answer = {};
						
			
	        return answer;
	    }
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//61
		String s61 = "1042";
		int result61 = sol.solution61(s61);
		System.out.println("61번 문제 : "+result61);
		
		//62
		String s62 = "123456789";
		int result62 = sol.solution62(s62);
		System.out.println("62번 문제 : "+result62);
		
		//63
		double f63 = 1.42;
		int result63 = sol.solution63(f63);
		System.out.println("63번 문제 : "+result63);
		
		//64
		int[] arr64 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] result64 = sol.solution64(arr64);
		System.out.println("64번 문제 : "+Arrays.toString(result64));
		
		//65
		int[] arr65 = {12, 4, 15, 46, 38, 1, 14};
		int[] result65 = sol.solution65(arr65);
		System.out.println("65번 문제 : "+Arrays.toString(result65));
		
		//66
		int[] arr661 = {49, 13};
		int[] arr662 = {70, 11, 2};
		int result66 = sol.solution66(arr661, arr662);
		System.out.println("66번 문제 : "+result66);
		
		//67
		int[] arr67= {5, 1, 4};
		int[] result67 = sol.solution67(arr67);
		System.out.println("67번 문제 : "+Arrays.toString(result67));
		
		//68
		String rny68 = "masterpiece";
		String result68 = sol.solution68(rny68);
		System.out.println("68번 문제 : "+result68);
		
		//69
		String my69 = "ABBAA";
		String pat69 = "AABB";
		int result69 = sol.solution69(my69, pat69);
		System.out.println("69번 문제 : "+result69);
		
		//70
		String my70 = " i    love  you";
		//String my70 = "    programmers  ";
		String[] result70 = sol.solution70(my70);
		System.out.println("70번 문제 : "+Arrays.toString(result70));

	}

}
