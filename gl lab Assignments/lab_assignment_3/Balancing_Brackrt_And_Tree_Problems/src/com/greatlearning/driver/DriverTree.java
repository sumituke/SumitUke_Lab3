package com.greatlearning.driver;


import com.greatlearning.utils.FindSumPair;
import com.greatlearning.utils.FindSumPair.Node;

public class DriverTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null ;
		
		FindSumPair findSP = new FindSumPair();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
        root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 110  );
		
		int sum = 60;
		findSP.findPairWithGivenSum(root, sum);
		


	}

}
