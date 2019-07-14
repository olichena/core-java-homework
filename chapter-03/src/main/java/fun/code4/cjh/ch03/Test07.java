package fun.code4.cjh.ch03;

import java.util.Scanner;

/**
 * 从控制台接受一个字符串, 将字符串倒置, 并输出. 比如:
 * 输入是:
 * abcdefg
 * 输出是:
 * gfedcba
 */
public class Test07 {

  public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String in=sc.nextLine();
		System.out.println("please enter your age:");
        int number = sc.nextInt();
       System.out.println("Hello,"+in+" you are "+number+"!");
       
  } 
}
