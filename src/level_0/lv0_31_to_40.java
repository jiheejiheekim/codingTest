package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class lv0_31_to_40 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	31) 문자 반복 출력하기
		 	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public String solution31(String my_string, int n) {
	        String answer = "";
	        char[] array = my_string.toCharArray();
	        for(int i=0; i<array.length; i++) {
	        	for(int j=0; j<n; j++) {
	        		answer += array[i];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	32) 배열의 유사도
		 	두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution32(String[] s1, String[] s2) {
	        int answer = 0;
	        for(int i=0; i<s1.length; i++) {
	        	for(int j=0; j<s2.length; j++) {
	        		if(s1[i].equals(s2[j])) {
	        			answer++;
	        			//System.out.println(s1[i]+"  ==  "+s2[j]);
	        		}
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	33) 배열 원소의 길이
		 	문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
		*/
		public int[] solution33(String[] strlist) {
	        int[] answer = {};
	        answer = new int[strlist.length];
	        String[] chlist = {};
	        for(int i=0; i<strlist.length; i++){
	        	chlist = new String[strlist[i].split("").length];
	        	answer[i] = chlist.length;
	        }
	        
	        return answer;
	    }
		
		/*
		 	34) 문자열 안에 문자열
		 	문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution34(String str1, String str2) {
	        int answer = 0;
	        if(str1.contains(str2)) {
	        	answer = 1;
	        }else {
	        	answer = 2;
	        }
	        return answer;
	    }
		
		/*
		 	35) 직각 삼각형 출력하기
		 	"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
		 	정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
		*/
		//스캐너로 숫자를 받아야하기 때문에 메인에서 풀이
		
		/*
		 	36) 삼각형의 완성조건(1)
		 	선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
			- 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
			삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
			세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution36(int[] sides) {
	        int answer = 0;
	        Arrays.sort(sides);
	        //System.out.println(Arrays.toString(sides));
	        if(sides[0]+sides[1] > sides[2]) {
	        	answer = 1;
	        } else {
	        	answer = 2;
	        }
	        return answer;
	    }
		
		/*
		 	37) 인덱스 바꾸기
		 	문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
		 	my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public String solution37(String my_string, int num1, int num2) {
	        String answer = "";
	        char change = my_string.charAt(num1);
	        char change2 = my_string.charAt(num2);
	        for(int i=0; i<my_string.length(); i++) {
	        	if(i == num1) {
	        		answer += change2;
	        	}else if(i == num2) {
	        		answer += change;
	        	}else {
	        		answer += my_string.charAt(i);
	        	}
	        }
	        return answer;
	    }
		 
		/*
		 	38) 편지
		 	머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 
		 	할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 
		 	편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
		*/
		public int solution38(String message) {
	        int answer = 0;
	        int result = message.length();
	        answer = 2 * result;
	        return answer;
	    }
		
		/*
		 	39) 자릿수 더하기
		 	정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
		*/
		public int solution39(int n) {
	        int answer = 0;
	        String num = Integer.toString(n);
	        String[] arr = num.split("");
	        //System.out.println("num : "+num);
	        int number = 0;
	        for(int i=0; i<num.length(); i++) {
	        	number = Integer.valueOf(arr[i]);
	        	//System.out.println("Integer.valueOf(arr[i] : "+Integer.valueOf(arr[i]));
	        	answer += number;
	        }
	        return answer;
	    }
		
		/*
		 	40) 점의 위치 구하기
			사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
			- x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
			- x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
			- x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
			- x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
			x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 
			좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
		*/
		public int solution40(int[] dot) {
	        int answer = 0;
	        if(dot[0]>0 && dot[1]>0) answer = 1;
	        else if(dot[0]<0 && dot[1]>0) answer = 2;
	        else if(dot[0]<0 && dot[1]<0) answer = 3;
	        else answer = 4;
	        return answer;
	    }
		
		
		
	
	
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//31
		String myString31 = "hello";
		int n31 = 3;
		String result31 = sol.solution31(myString31, n31);
		System.out.println("31번 문제 : "+result31);
		
		//32
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int result32 = sol.solution32(s1, s2);
		System.out.println("32번 문제 : "+result32);
		
		//33
		String[] strlist33 = {"We", "are", "the", "world!"};
		int[] result33 = sol.solution33(strlist33);
		System.out.println("33번 문제 : "+Arrays.toString(result33));
		
		//34
		String str134 = "ab6CDE443fgh22iJKlmn1o";
		String str234 = "6CD";
		int result34 = sol.solution34(str134, str234);
		System.out.println("34번 문제 : "+result34);
		
		//35
		Scanner sc = new Scanner(System.in);
		System.out.println("35번 문제 : 숫자를 입력하세요 ---> 3");
        int n = 3;//sc.nextInt();
        for(int i=1; i<=n; i++) {
        	for(int j=n-i; j<=n-1; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
		//36
		int[] sum36 = {1, 2, 3};
		int result36 = sol.solution36(sum36);
		System.out.println("36번 문제 : "+result36);
		
		//37
		String mystring37 = "hello";
		int my1int37 = 1;
		int my2int37 = 2;
		String result37 = sol.solution37(mystring37, my1int37, my2int37);
		System.out.println("37번 문제 : "+result37);
		
		//38
		String msg38 = "happy birthday!";
		int result38 = sol.solution38(msg38);
		System.out.println("38번 문제 : "+result38);
		
		//39
		int n39 = 1234;
		int result39 = sol.solution39(n39);
		System.out.println("39번 문제 : "+result39);
		
		//40
		int[] dot = {2, 4};
		int result40 = sol.solution40(dot);
		System.out.println("40번 문제 : "+result40);

	}

}
