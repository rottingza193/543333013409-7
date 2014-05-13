package com.rmuti.lab3;


public class lab4 {

	  Node root;
	 	 
	  	    public void AddNode(int number,String name) {
	  	
	  	    Node NewNode = new Node(number, name);
	  	     // Node newNode = new Node( key, name);
	  	    if (root == null) {
	  	    	root = NewNode;
	  	 
	  	        } else {
	  	 
	  	         Node FocusNode = root;
	  	         Node parent;
	  	 
	  	          while (true) {
	  	 
	  	          parent = FocusNode;
	  	
	  	          //if (key < focusNode.key) {
	  	          if (number < FocusNode.number) {
	  	               FocusNode = FocusNode.leftChild;
	  	 
	  	          if (FocusNode == null) {
	  	        	  parent.leftChild = NewNode;
	  	        	  
	  	              return; 
	  	 
	  	                    }
	  	 
	  	            } else { 
	  	 
	  	                    FocusNode = FocusNode.rightChild;
	  	 
	  	           if (FocusNode == null) {
	  	 
	  	                   parent.rightChild = NewNode;
	  	                        return; // 
	  	 
	  	                    }
	  	 
	  	                }
	  	 
	  	            }
	  	        }
	  	 
	  	    }
	  	 
	  	   
	  	 
	  	    public void InorderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	        	InorderTraverse(focusNode.leftChild);
	  	 
	  	           System.out.println(focusNode);
	  	 
	  	         InorderTraverse(focusNode.rightChild);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public void PreorderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	            System.out.println(focusNode);
	  	 
	  	          PreorderTraverse(focusNode.leftChild);
	  	        PreorderTraverse(focusNode.rightChild);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public void PostorderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	        	PostorderTraverse(focusNode.leftChild);
	  	        	PostorderTraverse(focusNode.rightChild);
	  	 
	  	            System.out.println(focusNode);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public Node findNode(int key) {
	  
	  	        Node Nodefocus = root;
	  	 
	  	     
				while (Nodefocus.number != key) {
				if (key < Nodefocus.number) {
	  	 
					Nodefocus = Nodefocus.leftChild;
	  	 
	  	            } else {
	  	 
	  	            	Nodefocus = Nodefocus.rightChild;
	  	 
	  	            }
	  	 
	  	          
	  	 
	  	            if (Nodefocus == null)
	  	                return null;
	  	 
	  	        }
	  	 
	  	        return Nodefocus;
	  	 
	  	    }
	  	 
	  	public static void main(String[] args) {
	  	 
	  	        lab4 theTree = new lab4();
	  	 
	  	        theTree.AddNode(50,"A");
	  	
	  	        theTree.AddNode(25, "B");
	  	 
	  	        theTree.AddNode(75,"C");
	  	 
	  	        theTree.AddNode(15,"D");
	  	 
	  	        theTree.AddNode(30, "E");
	  	 
	  	        theTree.AddNode(85,"F ");
	  	 
	  	         theTree.InorderTraverse(theTree.root);
	  	 
	  	         theTree.PreorderTraverse(theTree.root);
	  	 
	  	         theTree.PostorderTraverse(theTree.root);
	  	 
	  	        
	  	 
	  	      System.out.println("\nNode with the number ");
	  	 
	  	      System.out.println(theTree.findNode(25));
	  	      System.out.println(theTree.root);
	  	}
	  	}
	  	 
	  class Node {
	  	 
	  	   int number;
	  	 String name;
	  	 
	  	    Node leftChild;
	  	    Node rightChild;
	  	 
	  	  Node(int number, String name){
	  	 
	  	       this.number = number;
	  	       this.name = name;
	  	 
	  	    }
	  	 
	  	   public String toString() {
	  	 
	  	       return name + "  " ;
	  	 
	  	       
	  	 
	  	   }
	  	 
	  }
	 

