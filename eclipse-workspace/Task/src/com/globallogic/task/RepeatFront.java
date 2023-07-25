package com.globallogic.task;

public class RepeatFront {

	public static void main(String[] args) {
		String str="Chocolate";
		int n=4;
		System.out.println(repeatFront(str, n));
	}
	public static String repeatFront(String str, int n) {
		int len= str.length();
		String Word="";
		for(int i=n; n>0; n--) {
			Word += str.substring(0, n);
		}
		return Word;
	}
}
