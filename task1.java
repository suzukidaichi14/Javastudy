package javastudy;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		課題1
		  System.out.println("数字を入力してください");
		  Scanner s = new Scanner(System.in);
		  
		  int a = s.nextInt();
		  int b= s.nextInt();
		  int c= s.nextInt();
		  int d= s.nextInt();
		  int e= s.nextInt();
		  int sum=a+b+c+d+e;
		  System.out.println(sum);
		  s.close();  

	}

}
