package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class lv0_41_to_50 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	41) 최댓값 만들기
		 	정수 배열 numbers가 매개변수로 주어집니다. 
		 	numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution41(int[] numbers) {
	        int answer = 0;
	        Arrays.sort(numbers);
	        answer = numbers[numbers.length-2] * numbers[numbers.length-1];
	        return answer;
	    }
		
		/*
		 	42) 주사위의 개수
		 	머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
		 	상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 
		 	상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
		*/
		public int solution42(int[] box, int n) {
	        int answer = 0;
	        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
	        return answer;
	    }
		
		/*
		 	43) 세균 증식
		 	어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
		 	처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution43(int n, int t) {
	        int answer = 0;
	        for(int i=1; i<=t; i++) {
	        	n*=2;
	        }
	        answer = n;
	        return answer;
	    }
		
		/*
		 	44) 제곱수 판별하기
		 	어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
		 	정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution44(int n) {
	        int answer = 0;
	        for(int i=1; i<=1000000; i++) {
	        	if(n == Math.pow(i, 2)) {
	        		answer = 1;
	        		break;
	        	}else {
	        		answer = 2;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	45) 짝수 홀수 개수
			정수가 담긴 리스트 num_list가 주어질 때, 
			num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int[] solution45(int[] num_list) {
			int[] answer = {};
	        answer = new int[2];
	        int jjack = 0;
	        int hol = 0;
	        for(int i=0; i<num_list.length; i++){
	            if(num_list[i]%2==0){
	                jjack++;
	            }else{
	                hol++;
	            }
	            
	        }
	        answer[0] = jjack;
	        answer[1] = hol;
	        return answer;
	    }
		
		/*
		 	46) 문자열 뒤집기
		 	문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
		*/
		public String solution46(String my_string) {
	        String answer = "";
	        char[] arr = new char[my_string.length()];
	        for(int i=0; i<my_string.length(); i++) {
	        	arr[i] = my_string.charAt(my_string.length()-i-1);
	        	answer += arr[i];
	        }
	        return answer;
	    }
		
		/*
		 	47) 문자열 정렬하기 (1)
			문자열 my_string이 매개변수로 주어질 때, 
			my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
		*/
		public int[] solution47(String my_string) {
	        int[] answer = {};
	        int j = 0;
	        String arrs = "";
	        char[] arr = new char[my_string.length()];
	        for(int i=0; i<my_string.length(); i++) {
	        	arr[i] = my_string.charAt(i);
	        	if(arr[i]<65) {
	        		j++;
	        		//System.out.print(arr[i]+" ");
	        		arrs += arr[i];
	        	}
	        }
	        answer = new int[j];
	        String[] arrss = arrs.split("");
	        
	        for(int i=0; i<j; i++) {
	        	answer[i] = Integer.parseInt(arrss[i]);
	        }
	        Arrays.sort(answer);
	       
	        return answer;
	    }
		 
		/*
		 	48) 배열 회전시키기
		 	정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
		 	배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
		*/ //123이 312가 되도록
		public int[] solution48(int[] numbers, String direction) {
	        int[] answer = {};
	        answer = new int[numbers.length];
	        int len = numbers.length;
	        
	        ArrayList arr = new ArrayList();
	        
	        if(direction.equals("right")) {
		        arr.add(numbers[len-1]);
		        for(int i=0; i<len-1; i++) {
		        	arr.add(numbers[i]);
		        	answer[i] = (int) arr.get(i);
		        }
		        answer[len-1] = (int) arr.get(len-1);
	        }else {
	        	for(int i=0; i<len-1; i++) {
	        		arr.add(numbers[i+1]);
	        		answer[i] = (int) arr.get(i);
	        	}
	        	answer[len-1] = numbers[0];
	        }
	        return answer;
	    }
		
		/*
		 	49) 369게임
		 	머쓱이는 친구들과 369게임을 하고 있습니다. 
		 	369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
		 	머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution49(int order) {
	        int answer = 0;
	        String num = String.valueOf(order);
	        String[] nums = num.split("");
	        System.out.println(Arrays.toString(nums));
	        
	        int[] arr = new int[nums.length];
	        for(int i=0; i<arr.length; i++) {
	        	arr[i] = Integer.parseInt(nums[i]);
	        	if(arr[i] == 3 || arr[i] == 6 || arr[i] == 9) {
	        		answer++;
	        	}
	        }
	        
	        return answer;
	    }
		
		/*
		 	50) 
		*/
		
	
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//41
		int numbers41[] = {1, 2, 3, 4, 5};
		int result41 = sol.solution41(numbers41);
		System.out.println("41번 문제 : "+result41);
		
		//42
		int[] box = {10, 8, 6};
		int n42 = 3;
		int result42 = sol.solution42(box, n42);
		System.out.println("42번 문제 : "+result42);
		
		//43
		int n43 = 7;
		int t43 = 15;
		int result43 = sol.solution43(n43, t43);
		System.out.println("43번 문제 : "+result43);
		
		//44
		int n44 = 144;
		int result44 = sol.solution44(n44);
		System.out.println("44번 문제 : "+result44);
		
		//45
		int[] numlist45 = {1, 2, 3, 4, 5};
		int[] result45 = sol.solution45(numlist45);
		System.out.println("45번 문제 : "+Arrays.toString(result45));
		
		//46
		String my46 = "jaron";
		String result46 = sol.solution46(my46);
		System.out.println("46번 문제 : "+result46);
		
		//47
		String my47 = "hi12392";
		int[] result47 = sol.solution47(my47);
		System.out.println("47번 문제 : "+Arrays.toString(result47));
		
		//48
		int[] numbers48 = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] result48 = sol.solution48(numbers48, direction);
		System.out.println("48번 문제 : "+Arrays.toString(result48));
		
		//49
		int order = 29423;
		int result49 = sol.solution49(order);
		System.out.println("49번 문제 : "+result49);
		
		//50
		
		System.out.println("50번 문제 : ");

	}

}
