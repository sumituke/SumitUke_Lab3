package com.greatlearning.driver;

import com.greatlearning.utils.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
          String bracketExpression = "([[{}]]) " ;
         boolean isBalanced = BalancingBrackets.checkBalancingBrackets(bracketExpression);
         if(isBalanced)
         {
        	 System.out.println("The entered String has Balanced brackets");
         }
         else
         {
        	 System.out.println("The entered String do not conttain balanced brackets"); 
         }
	}

}
