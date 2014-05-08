package com.rmuti.datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayListQueue {

	public static void main(String[] args) {
		PriorityQueue<String>  ting = new PriorityQueue<String>();
		ting.offer("a");
		ting.offer("b");
		System.out.printf("%s", ting);
		System.out.println(); 
		
		System.out.printf("%s",ting.peek());
		
		
		ting.poll();
		
		System.out.println("");
		
		
		while (!ting.isEmpty()){
			System.out.println(ting.poll());
		}
	}
	
	public static int enqueue(Stack<Integer> s){
		Stack<Integer> Backup = new Stack<Integer>();
		int dequeue = s.pop();
		Backup.push(dequeue);
	
		
	while (!s.isEmpty()){
		int next = s.pop();
		Backup.push(next);
		dequeue = Math.max(dequeue, next);
	}
	
	
	while (!Backup.isEmpty()){
		s.push(Backup.pop());
	}
	
return dequeue;
	}
}
