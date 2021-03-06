package edu.cjy.String;

import java.awt.Point;
import java.util.FormatFlagsConversionMismatchException;

public class LongestSubstring {
	/**
	 * 用两个指针，分别志向子串的开始和结尾
	 * 用一个bool记录字母是否出现过
	 * @param s
	 * @return
	 */
	public int solutionWrong(String s){
		char[] strings = s.toLowerCase().toCharArray();
		boolean[] flags = new boolean[26];
		int start=0;
		//int end=0;
		int max=0;
		for(int i=0;i<strings.length;i++){
			if (flags[strings[i]-'a']) {
			    for(int j=start;j<i;j++){
			    	flags[strings[j]-'a']=false;
			    }
			    flags[strings[i]-'a']=true;
				max=Math.max(i-start,max);
				start=i;//上一次出现的字母的位置+1
			    System.out.println("index "+i+"  max="+max);
			}else{
				flags[strings[i]-'a']=true;
			}
		}
		return Math.max(max,strings.length-start);
	}
	
	public int solution(String s){
		int position[]= new int[256];//记录字母上一次出现的位置
		for (int i = 0; i < position.length; i++) {
			position[i]=-1;
		}
		int max=0;
		int start=-1;
		char[] chars= s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			//如果上一次出现的字母位置大于子串起始位置，说明有重复字母
			if (position[chars[i]]>start) {
				start=position[chars[i]];
			}
			max=Math.max(max, i-start);
			System.out.println(max);
			position[chars[i]]=i;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		LongestSubstring longestSubstring = new LongestSubstring();
		int result=longestSubstring.solution("abcad");
		System.out.println(result);
		short a= 128;
		byte b= (byte) a;
		System.out.println(a+","+b);
	}
}
