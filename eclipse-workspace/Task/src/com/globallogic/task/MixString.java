package com.globallogic.task;

public class MixString {

	public static void main(String[] args) {
		String a= "abc";
		String b= "xyz";
		System.out.println(mixString(a,b));
	}
	public static String mixString(String a , String b) {
		int aLength=a.length();
		int bLength=b.length();
		int max= Math.max(aLength, bLength);
		String word="";
		
		for(int i=0; i<max; i++) {
			if(i<=aLength-1)
				word +=a.substring(i, i+1);
			if(i<=bLength-1)
				word += b.substring(i, i+1);
		}
		return word;
	}
}
