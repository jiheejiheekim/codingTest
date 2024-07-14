package level_0;

import java.util.ArrayList;
import java.util.Arrays;

import level_0.lv0_1_to_20.Solution;

public class lv0_21_to_30 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
			21) 배열 자르기
			정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
			numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int[] solution21(int[] numbers, int num1, int num2) {
			int[] answer = {};
	        answer = new int[num2 - num1 + 1];
	        for (int i = 0; i <= num2 - num1; i++) {
	            answer[i] = numbers[num1 + i];
	        }
	        return answer;
	    }
		
		/*
			22) 순서쌍의 개수
			순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 
			자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution22(int n) {
			int answer = 0;
	        for(int i=1; i<=n; i++){
	            if(n%i==0){
	                answer++;
	            }
	        }
	        return answer;
		}
		
		/*
			23) 개미 군단
			개미 군단이 사냥을 나가려고 합니다. 
			개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 
			장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 
			예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 
			장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 
			사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 
			몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution23(int hp) {
	        int answer = 0;
	        answer = hp/5 + (hp%5)/3 + ((hp%5)%3)/1;
	        //System.out.println(hp/5);
	        //System.out.println((hp%5)/3);
	        //System.out.println(((hp%5)%3)/1);
	        return answer;
	    }
		
		/*
			24) 모음 제거
			영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
			문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		*/
		public String solution24(String my_string) {
	        String answer = "";
	        char[] my2 = my_string.toCharArray();
			for(int i=0; i<my2.length; i++) {
				if(my2[i]!='a' && my2[i]!='e' && my2[i]!='i' && my2[i]!='o' && my2[i]!='u') {
					//System.out.print(my2[i]);
					answer += my2[i];
				}
			}
	        return answer;
	    }
		
		/*
			25) 숨어있는 숫자의 덧셈 (1)
			문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution25(String my_string) {
	        int answer = 0;
	        my_string = my_string.replaceAll("[a-zA-Z]", "");
	        //System.out.println(my_string);
	        String[] my = my_string.split("");
	        //System.out.println(Arrays.toString(my));
	        for(int i=0; i<my.length; i++) {
	        	answer += Integer.parseInt(my[i]);
	        }
	        return answer;
	    }
		
		/*
		 	26) 암호 해독
		 	군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
			암호화된 문자열 cipher를 주고받습니다.
			그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
			문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
		 */
		public String solution26(String cipher, int code) {
	        String answer = "";
	        String[] ci = cipher.split("");
	        for(int i=1; i<=ci.length; i++){
	            if(i%code==0) answer+=ci[i-1];
	        }
	        return answer;
	    }
		
		/*
		 	27) 대문자와 소문자
		 	문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
		 */
		public String solution27(String my_string) {
	        String answer = "";
	        String[] mys = my_string.split("");
	        char[] myc = my_string.toCharArray();
	        //my_string.toUpperCase();
	        //char a = 97;	//z:122 a:97
	        //System.out.println(a);
	        for(int i=0; i<mys.length; i++) {
	        	if(myc[i]>=65 && myc[i]<=96) {
	        		mys[i] = mys[i].toLowerCase();
	        		answer+=mys[i];
	        	}else {
	        		mys[i] = mys[i].toUpperCase();
	        		answer+=mys[i];
	        	}
	        }
	        return answer;
	    }
		
		
		
	}

	public static <E> void main(String[] args) {
		Solution sol = new Solution();
		
		//21
		//int []numbers21 = {1, 3, 5};
		int []numbers21 = {1, 2, 3, 4, 5};
		//int []numbers21 = {1, 2, 3, 4, 5 ,6, 7};
		//int []result21 = sol.solution21(numbers21, 1, 2);
		int []result21 = sol.solution21(numbers21, 1, 3);
		System.out.println("21번 문제 : "+Arrays.toString(result21));
		
		//22
		int n22 = 20;
		int result22 = sol.solution22(n22);
		System.out.println("22번 문제 : "+result22);
		
		//23
		int hp23 = 23;
		int result23 = sol.solution23(hp23);
		System.out.println("23번 문제 : "+result23);
		
		//24
		String my24 = "nice to meet you";
		String result24 = sol.solution24(my24);
		System.out.println("24번 문제 : "+result24);
		
		//25
		String my_string25 = "aAb1B2cC34oOp";
		int result25 = sol.solution25(my_string25);
		System.out.println("25번 문제 : "+result25);
		
		//26
		String my_string26 = "dfjardstddetckdaccccdegk";
		int code26 = 4;
		String result26 = sol.solution26(my_string26, code26);
		System.out.println("26번 문제 : "+result26);
		
		//27
		String my_string27 = "cccCCC";
		String result27 = sol.solution27(my_string27);
		System.out.println("27번 문제 : "+result27);
		
		//28
		
		
		//29
		
		
		//30

	}

}
