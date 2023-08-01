package com.gurukul.day15;

import java.util.ArrayDeque;
import java.util.Stack;

public class DquePalindrom {

	public static void main(String[] args) {
		ArrayDeque<Character> s1=new ArrayDeque<>();
		 
		
		
		String s="hello";
		
		for(int i=0;i<s.length();i++) {
		
			s1.add( s.charAt(i));
		}
		
		 while(s1.size()>1)
		 {
			  char first=s1.removeFirst();
			  char last=s1.removeLast();
		 
         if(first!=last) {
          System.out.println( "Not Palindrome");
          break;
          
         }
         else {
        	 System.out.println("Palindrome");
        	 break;
         }
		 } 
	}
}