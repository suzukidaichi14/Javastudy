package javastudy;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		課題1
		  System.out.println("数字を入力してください");
		  Scanner s = new Scanner(System.in);
		  int num = s.nextInt();
		  int sum=0;
		  for(int i=0;i<5;i++) {
			  System.out.println(num);
			sum+=num; 
			
		  }
		  System.out.println(sum);
		  s.close();  

	}

}
