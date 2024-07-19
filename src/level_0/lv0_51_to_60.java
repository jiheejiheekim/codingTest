package level_0;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class lv0_51_to_60 {
	
	static class Solution{	//정답률 순으로 보기 때문에 번호 바뀔 수 있음
		/*
		 	51) 숫자 찾기
		 	정수 num과 k가 매개변수로 주어질 때, 
		 	num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution51(int num, int k) {
	        int answer = 0;
	        String numst = String.valueOf(num);
	        String[] st = numst.split("");
	        //System.out.println(Arrays.toString(st));
	        for(int i=0; i<numst.length(); i++) {
	        	if(st[i].equals(String.valueOf(k))) {
	        		answer = i+1;
	        		break;
	        	}else {
	        		answer = -1;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	52) 문자열 정렬하기 (2)
		 	영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
		 	my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
		*/
		public String solution52(String my_string) {
	        String answer = "";
	        //String my1 = my_string.toLowerCase();
	        String arr[] = my_string.toLowerCase().split("");
	        Arrays.sort(arr);
	        for(int i=0; i<arr.length; i++) {
	        	answer+=arr[i];
	        }
	        return answer;
	    }
		
		/*
		 	53) 가위 바위 보
		 	가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, 
		 	rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
		*/
		public String solution53(String rsp) {
			String answer = "";
	        char[] arr = rsp.toCharArray();
	        for(int i=0; i<arr.length; i++){
	            if(arr[i] == '2'){
	                answer += "0";
	            }else if(arr[i] == '0'){
	                answer += "5";
	            }else{
	                answer += "2";
	            }
	        }
	    
	        return answer;
	    }
		
		/*
		 	54) 최댓값 만들기 (2)
		 	정수 배열 numbers가 매개변수로 주어집니다. 
		 	numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution54(int[] numbers) {
	        int answer = 0;
	        answer = numbers[0] * numbers[1];
	        for(int i=0; i<numbers.length; i++){
	        	for(int j=0; j<=i; j++) {
	        		if(i!=j && numbers[i]*numbers[j] > answer) {
	        			//System.out.println(numbers[i]+" x "+numbers[j]);
	        			answer = numbers[i]*numbers[j];
	        		}
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	55) 합성수 찾기
		 	약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
		 	자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
		*/
		public int solution55(int n) {
			int answer = 0;
	        for(int i=1; i<=n; i++){
	        	int k=0;
	        	for(int j=1; j<=i; j++) {
		            if(i%j == 0) {
		            	//System.out.println("i "+i+"  j : "+j);
		            	k++;
		            	//System.out.println(k);
		            }
	        	}
	        	if(k>=3) {
	        		answer++;
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	56) 외계행성의 나이
		 	우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
		 	입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
		 	a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
		 	나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
		*/
		public String solution56(int age) {
	        String answer = "";
	        String age_st = String.valueOf(age);
	        
	        char[] arr = age_st.toCharArray();
	        int[] num = new int[arr.length];
	        for(int i=0; i<arr.length; i++) {
	        	num[i] = arr[i]-'0';
	        	arr[i] = (char)(num[i] + 97);
	        	answer += arr[i];
	        }
	        //System.out.println("arr "+Arrays.toString(arr));
	        //System.out.println("num " +Arrays.toString(num));
	        
	        return answer;
	    }
		
		/*
		 	57) 중복된 문자 제거
		 	문자열 my_string이 매개변수로 주어집니다. 
		 	my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
		*/
		public String solution57(String my_string) {
	        String answer = "";
	        StringBuilder sb = new StringBuilder();
	        char[] arr = my_string.toCharArray();
	        //System.out.println(Arrays.toString(arr));
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        for(int i=0; i<my_string.length(); i++) {
	        	set.add(arr[i]);
	        }
	        for(char c : set) {
	        	sb.append(c);
	        }
	        //System.out.println(set);
	        answer = sb.toString();
	        return answer;
	    }
		 
		/*
		 	58) 
		 	
		*/ 
		
		
		/*
		 	59) 
		*/
		
		
		/*
		 	60) 
		*/
		
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//51
		int num51 = 29183;
		int k51 = 1;
		int result51 = sol.solution51(num51, k51);
		System.out.println("51번 문제 : "+result51);
		
		//52
		String my_string52 = "Bcad";
		String result52 = sol.solution52(my_string52);
		System.out.println("52번 문제 : "+result52);
		
		//53
		String my53 = "205";
		String result53 = sol.solution53(my53);
		System.out.println("53번 문제 : "+result53);
		
		//54
		int[] numbers54 = {1, 2, -3, 4, -5};
		int result54 = sol.solution54(numbers54);
		System.out.println("54번 문제 : "+result54);
		
		//55
		int n55=10;
		int result55 = sol.solution55(n55);
		System.out.println("55번 문제 : "+result55);
		
		//56
		int age56 = 23;
		String result56 = sol.solution56(age56);
		System.out.println("56번 문제 : "+result56);
		
		//57
		String myString57 = "people";
		String result57 = sol.solution57(myString57);
		System.out.println("57번 문제 : "+result57);
		
		//58
		
		//System.out.println("58번 문제 : "+Arrays.toString(result58));
		
		//59
		
		//System.out.println("59번 문제 : "+result59);
		
		//60
		
		//System.out.println("50번 문제 : "+result60);

	}

}