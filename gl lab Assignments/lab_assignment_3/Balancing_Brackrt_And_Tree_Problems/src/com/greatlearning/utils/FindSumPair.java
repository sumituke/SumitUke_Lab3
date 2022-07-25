package com.greatlearning.utils;

import java.util.HashSet;

public class FindSumPair {
	
	public static class Node
	{
		int nodeData;
		Node leftNode, rightNode;
	}
	
	static Node newNode(int nodeData)
	{
		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null ;
		temp.rightNode = null ;
		return temp;
	}
	
	public Node insert(Node root,int key)
	{
		if(root == null)
		{
			return newNode(key);
		}
		
		if(key<root.nodeData)
		{
			root.leftNode = insert(root.leftNode, key);
			
		}
		else
		{
			root.rightNode = insert(root.rightNode,key);
		}
		return root ; 
	}
	
	private boolean findpairUtil1(Node root, int sum, HashSet<Integer> set)
	{
		if(root == null)
			return false;
		if(findpairUtil1(root.leftNode, sum, set))
			return true;
		if(set.contains(sum - root.nodeData)) {
			System.out.println("pair is found  (" +(sum - root.nodeData)+ ","+ root.nodeData + ")");
			return true;
		}
		else
			set.add(root.nodeData);
		return findpairUtil1(root.rightNode, sum, set);
		
		
		}
	
	
	public void findPairWithGivenSum(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<>();
		if(!findpairUtil1(root, sum, set))
			System.out.print("Pairs do not exist"+ "\n");
	}
	
	private boolean findpairUtil(Node root, int sum , HashSet<Integer> set)
	{
		return false ;
	}

}
