package com.globallogic.task;

public class RepeatEnd {
	public static void main(String[] args) {
		String str="Hello";
		int n=3;
		System.out.println(repeatEnd(str, n));
	}
	public static String repeatEnd(String str, int n) {
		int len=str.length();
		String nWord="";
		
		for(int i=0; i<n; i++){
			nWord += str.substring(len - n, len);
			
		}
		return nWord;
	}

}
