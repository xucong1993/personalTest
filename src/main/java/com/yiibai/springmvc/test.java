package com.yiibai.springmvc;

import com.yiibai.springmvc.HelloWorldController;;

public class test {
       public  static void main(String args[]){
    	   if(!HelloWorldController.isBarCode("67582950325q")){
    		   System.out.println( "1111"+HelloWorldController.isBarCode("675829503256")); 
    	   }else{
    		   System.out.println("22222");
    	   }
//    	   String s1 = "ab<c>cb?a";
//    	   String s2= reverse(s1);
//    	   System.out.println(s2.equals(s1)+"1111");
//    	   
//       }
//
//	private static String reverse(String s) {
//		// TODO Auto-generated method stub
//		
//		StringBuilder stringBulider = new StringBuilder(s);
//		stringBulider.reverse();
//		return stringBulider.toString();
//	}
//    	   test
}
}
