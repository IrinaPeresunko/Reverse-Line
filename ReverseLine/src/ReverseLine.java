//reverse line using recursion

import java.util.Arrays;


public class ReverseLine {

	public static char[] reverseLine(char[] charArray,int start,int end){
		char temp=charArray[start];
		charArray[start]=charArray[end];
		charArray[end]=temp;
		if((end-start)==1) return charArray;
		return reverseLine(charArray,start+1,end-1);
	}
	public static void main(String[] args){
		String s="String";
		char[] a=reverseLine(s.toCharArray(),0,s.length()-1);
		System.out.println(Arrays.toString(a));
	}
}
