package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class lv0_91_to_100 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	91) 조건에 맞게 수열 변환하기
		 	정수 배열 arr가 주어집니다. 
		 	arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 
		 	그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
		*/
		public int[] solution91(int[] arr) {
	        int[] answer = {};
	        answer = new int[arr.length];
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i]>=50 && arr[i]%2==0) {
	        		answer[i] = arr[i]/2;
	        	}else if((arr[i]<50 && arr[i]%2==1) || arr[i]==1) {
	        		answer[i] = arr[i]*2;
	        	}else {
	        		answer[i] = arr[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	92) n보다 커질 때까지 구하기
		 	정수 배열 numbers와 정수 n이 매개변수로 주어집니다. 
		 	numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 
		 	이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
		*/
		public int solution92(int[] numbers, int n) {
	        int answer = 0;
	        for(int i=0; i<numbers.length; i++) {
	        	answer += numbers[i];
	        	if(answer > n) {
	        		break;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	93) 5명씩
		 	최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 
		 	앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
		 	마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
		*/
		public String[] solution93(String[] names) {
	        String[] answer = {};
	        int len = (names.length%5==0)? (names.length/5):(names.length/5)+1;
	        answer = new String[len];
	        int index = 0;
	        for(int i=0; i<names.length; i++){
	        	if(i==0) answer[index++] = names[i];
	        	else if(i%5==0) answer[index++] = names[i];
	        }
	        return answer;
	    }
		
		/*
		 	94) n개 간격의 원소들
		 	정수 리스트 num_list와 정수 n이 주어질 때, 
		 	num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 
		 	return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution94(int[] num_list, int n) {
	        int[] answer = {};
	        int len = (num_list.length%n==0)? num_list.length/n: num_list.length/n+1;
	        answer = new int[len];
	        int index = 0;
	        for(int i=0; i<num_list.length; i+=n) {
	        	answer[index++] = num_list[i];
	        }
	        return answer;
	    }
		
		/*
		 	95) 순서 바꾸기
		 	정수 리스트 num_list와 정수 n이 주어질 때, 
		 	num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 
		 	n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution95(int[] num_list, int n) {
	        int[] answer = {};
	        answer = new int[num_list.length];
	        int j = 0;
	        int k = 0; 	        
	        for(int i=n; i<answer.length+n; i++) {
	        	if(i <= num_list.length-1) {
	        		answer[j] = num_list[i];
	        	}else {
	        		answer[j] = num_list[k++];
	        	}
	        	j++;
	        }
	        
	        return answer;
	    }
		
		/*
		 	96) n 번째 원소까지
		 	정수 리스트 num_list와 정수 n이 주어질 때, 
		 	num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		 */
		public int[] solution96(int[] num_list, int n) {
			int[] answer = {};
			answer = new int[n];
			for(int i=0; i<n; i++){
				answer[i] = num_list[i];
			}
			return answer;
		}
		
		/*
		 	97) n 번째 원소부터
		 	정수 리스트 num_list와 정수 n이 주어질 때, 
		 	n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution97(int[] num_list, int n) {
	        int[] answer = {};
	        answer = new int[num_list.length-n+1];
	        int index = n-1;
	        for(int i=0; i<answer.length; i++){
	            answer[i] = num_list[index++];
	        }
	        return answer;
	    }
		 
		/*
		 	98) 첫 번째로 나오는 음수
		 	정수 리스트 num_list가 주어질 때, 
		 	첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 
		 	음수가 없다면 -1을 return합니다.
		*/ 
		public int solution98(int[] num_list) {
	        int answer = 0;
	        for(int i=0; i<num_list.length; i++) {
	        	if(num_list[i] < 0) {
	        		answer = i;
	        		break;
	        	}else{
	                answer = -1;
	            }
	        }
	        return answer;
	    }
		
		/*
		 	99) 카운트 다운
		 	정수 start_num와 end_num가 주어질 때, 
		 	start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution99(int start_num, int end_num) {
	        int[] answer = {};
	        int index = 0;
	        answer = new int[start_num-end_num+1];
	        for(int i=start_num; i>=end_num; i--){
	            answer[index++] = i;
	        }
	        return answer;
	    }
		
		/*
		 	100) 배열 만들기1
		 	정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		*/
		public int[] solution100(int n, int k) {
			int[] answer = {};
	        int index = 0;
	        answer = new int[n/k];
	        for(int i=k; i<=n; i+=k){
	            answer[index++] = i;
	        }
	        return answer;
	    }
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//91
		int[] arr91 = {1, 2, 3, 100, 99, 98};
		int[] result91 = sol.solution91(arr91);
		System.out.println("91번 문제 : "+Arrays.toString(result91));
		
		//92
		int[] arr92 = {34, 5, 71, 29, 100, 34};
		int n92 = 123;
		int result92 = sol.solution92(arr92, n92);
		System.out.println("92번 문제 : "+result92);
		
		//93
		String names[] = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String result93[] = sol.solution93(names);
		System.out.println("93번 문제 : "+Arrays.toString(result93));
		
		//94
		int[] list = {4, 2, 6, 1, 7, 6};
		int n94 = 4;
		int[] result94 = sol.solution94(list, n94);
		System.out.println("94번 문제 : "+Arrays.toString(result94));
		
		//95
		int[] arr95 = {5, 2, 1, 7, 5};
		int n95 = 3;
		int[] result95 = sol.solution95(arr95, n95);
		System.out.println("95번 문제 : "+Arrays.toString(result95));
		
		//96
		int[] arr96 = {5, 2, 1, 7, 5};
		int n96 = 3;
		int[] result96 = sol.solution96(arr96, n96);
		System.out.println("96번 문제 : "+Arrays.toString(result96));
		
		//97
		int[] arr97 = {5, 2, 1, 7, 5};
		int n97 = 2;
		int[] result97 = sol.solution97(arr97, n97);
		System.out.println("97번 문제 : "+Arrays.toString(result97));
		
		//98
		int []arr98 = {12, 4, 15, 46, 38, -2, 15};
		int result98 = sol.solution98(arr98);
		System.out.println("98번 문제 : "+result98);
		
		//99
		int start = 10;
		int end = 3;
		int result99[] = sol.solution99(start, end);
		System.out.println("99번 문제 : "+Arrays.toString(result99));
		
		//100
		int n = 10;
		int k =3;
		int[] result100 = sol.solution100(n, k);
		System.out.println("100번 문제 : "+Arrays.toString(result100));

	}

}
