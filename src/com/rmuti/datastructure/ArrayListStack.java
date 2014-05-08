package com.rmuti.datastructure;

import java.util.Stack;

public class ArrayListStack {

	
		public static void main(String[] args) {
			Stack<String> s = new Stack<String>();
			s.add("a");
			s.add("b");
			System.out.println(s);
			
			
			while (!s.isEmpty()){
				System.out.println(s.pop());
			}
		}
		
		public static int ting(Stack<Integer> s){
			Stack<Integer> tingbackup = new Stack<Integer>();
			int Value = s.pop();
			tingbackup.push(Value);
		
			
		while (!s.isEmpty()){
			int next = s.pop();
			tingbackup.push(next);
			Value = Math.max(Value, next);
		}
		
		
		while (!tingbackup.isEmpty()){
			s.push(tingbackup.pop());
		}
		
	return Value;
		}
	
			 
			
		}

	
