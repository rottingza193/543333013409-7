package com.rmuti.lab2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ArrayListPQ {
	
private ArrayList<Object> lst;

public ArrayListPQ() {
lst = new ArrayList<Object>();
 }

public void enqueue(Object e) {
lst.add(lst.size(), e);
 }

 public Object dequeue() {
  int maxIndex = maxIndex();
  Object maxObj = lst.get(maxIndex);
  lst.remove(maxIndex);
  return maxObj;
  }

  public Object peek() {
   return lst.get(maxIndex());
   }

  private int maxIndex() {
  int max = 0;
  for (int i = 0; i < lst.size(); i++) {
   Comparable<Object> d = (Comparable<Object>) lst.get(i);
    	Object maxObj = lst.get(max);
   if (d.compareTo(maxObj) > 0) {
    max = i;
    }
    }
  
    return max;

 }


	public static void main(String[] args) {
		Car c1 = new Car("Mini Cooper",5,1800000);
		Car c2 = new Car("Lamborghini",4,25000000);
		Car c3 = new Car("Audi",3,8000000);
		
		
		PriorityQueue<Car> rotting = new PriorityQueue<Car> ();
		rotting.add(c1);
		rotting.add(c2);
		rotting.add(c3);
		
		int count = 1;
		
		while (!rotting.isEmpty()){
			//System.out.println(otherWay);
			System.out.println("PQ"+ count +"==>>"+rotting.remove());
			count++;	
			System.out.println();
		}
			
	}
	}
	



