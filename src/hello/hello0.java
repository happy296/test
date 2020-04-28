package hello;

import java.util.Scanner;

public class hello0 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	       System.out.println("1、hello1");
	       System.out.println("2、hello2");
	       System.out.println("3、hello3");
	       System.out.println("4、hello4");
	       System.out.println("5、hello5");
	       System.out.println("请选中你的操作：");
	       int i = in.nextInt();
	       if(i == 6) {
	         hello6 h = new hello6();
	       }else if(i == 2) {
	    	  hello2 h = new hello2();
	   
	       }
	       
	}
	

}