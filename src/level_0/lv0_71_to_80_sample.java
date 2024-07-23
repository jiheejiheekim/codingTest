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
	        int arr[] = new int[array.length+1];
	        for(int i=0; i<array.length; i++) {
	        	arr[i] = array[i];
	        }
	        arr[arr.length-1] = n;
	        
	        Arrays.sort(arr);
	        //System.out.println("n은 "+n+" / "+Arrays.toString(arr));
	        
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i] == n && arr[i] != arr[arr.length-1] && arr[i] != arr[0]) {
	        		if(arr[i] - arr[i-1] > arr[i+1] - arr[i]) {
	        			answer = arr[i+1];
	        		}else {
	        			answer = arr[i-1];
	        		}
	        	}else if(arr[i] == n && arr[i] == arr[arr.length-1]) {
	        		answer = arr[i-1];
	        	}else if(arr[i] == n && arr[i] == arr[0]){
	        		answer = arr[i+1];
	        	}
	        }
	        return answer;
	    }
		
		/*
		 	74) 한 번만 등장한 문자
		 	문자열 s가 매개변수로 주어집니다. 
		 	s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 
		 	한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
		*/
		public String solution74(String s) {
	        String answer = "";
	        String my = "";
	        char[] myarr = {};
	        char[] arr=s.toCharArray();
	        	        
	        for(int i=0; i<arr.length; i++) {
	        	//System.out.println("=====================");
	        	int count = 0;
	        	for(int k=arr.length-1; k>=0; k--) {
	        		if(arr[i] == arr[k] && i!=k) {
	        			count++;
	        			//System.out.println(arr[i]+" 와 비교 "+arr[k] +"  / 카운트는 : "+ count);
	        		}else if(arr[i] != arr[k] && i!=k) {
	        			//System.out.println("다름 >> "+arr[i]+" 와 "+arr[k] +" 비교 ");
	        		}
	        	}
	        	if(count < 1) {
	        		//System.out.println(">>>>>>>>> "+arr[i]);
	        		my += arr[i];
	        	}
	        }
	        
	        myarr = new char[my.length()];
	        for(int i=0; i<myarr.length; i++) {
	        	myarr[i] = my.charAt(i);
	        }
	        Arrays.sort(myarr);
	        //System.out.println(Arrays.toString(myarr));
	        for(int i=0; i<myarr.length; i++) {
	        	answer += myarr[i];
	        }
	        return answer;
	    }
		
		/*
		 	75) k의 개수
		 	1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
		 	정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
		*/
		public int solution75(int i, int j, int k) {
	        int answer = 0;
			
			//i = 10; j= 50; k= 5;
	        String st3 = String.valueOf(k);
	        char kk = st3.charAt(0);
	        //System.out.println("i인 ("+st1+") 부터 j인 ("+st2+") 까지 k인 ("+k+") 이 몇 번 등장하는지");
	        String q = "";
	        
	        String[] arr = new String[j];
	        
	        int index = 0;
	        int count = 0;
	        for(int a=i; a<=j; a++) {
	        	arr[index++] = String.valueOf(a);
	        	q += arr[count++];
	        }
	        char[] arr2 = q.toCharArray();
	        
	        //System.out.println(q);
	        //System.out.println(Arrays.toString(arr2));

	        for(int a=0; a<arr2.length; a++) {
	        	if(arr2[a] == kk) {
	        		answer++;
	        	}
	        }	
	        
	        return answer;	   
	    }
		
		/*
		 	76) 7의 개수
		 	머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 
		 	7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution76(int[] array) {
	        int answer = 0;
	        String str = "";
	        for(int i=0; i<array.length; i++) {
	        	str += array[i]+"";
	        }
	        answer = str.length() - str.replaceAll("7", "").length();
	        return answer;
	    }
		
		/*
		 	77) 컨트롤 제트
		 	숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 
		 	이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 
		 	숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
		*/
		public int solution77(String s) {
	        int answer = 0;
	        String[] arrr = s.split(" ");
	        System.out.println(Arrays.toString(arrr));
	        for(int i=0; i<arrr.length; i++) {
	        	if(!arrr[i].equals("Z")) {
	        		answer += Integer.valueOf(arrr[i]);
	        	}else {
	        		answer -= Integer.valueOf(arrr[i-1]);
	        	}
	        }
	        return answer;
	    }
		 
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
		String s74 = "abcabcadc";
		String result74 = sol.solution74(s74);
		System.out.println("74번 문제 : "+result74);
		
		//75
		int i = 1;
		int j = 13;
		int k = 1;
		int result75 = sol.solution75(i, j, k);
		System.out.println("75번 문제 : "+result75);
		
		//76
		int[] arr76 = {7, 77, 17};
		int result76 = sol.solution76(arr76);
		System.out.println("77번 문제 : "+result76);
		
		//77
		String s77 = "1 2 Z 3";
		int result77 = sol.solution77(s77);
		System.out.println("77번 문제 : "+result77);
		
		//78
		
		//System.out.println("77번 문제 : "+Arrays.deepToString(result78));
		
		//79
		
		//System.out.println("79번 문제 : "+Arrays.toString(result79));
		
		//80
		
		//System.out.println("70번 문제 : "+result80);

	}

}
