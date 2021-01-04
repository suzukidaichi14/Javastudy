package javastudy;
import java.util.Scanner;
import java.util.Random;
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		課題２
		System.out.println("1〜10の2つの数字を足して11以上か未満か予想してください");
		System.out.println("Highなら1,Lowなら2");
		System.out.println("正解＞");
		Scanner s = new Scanner(System.in);
		  int d= s.nextInt();
		  
		 Random r = new Random();
		  int num2 = r.nextInt(10)+1;
		  int num1 = r.nextInt(10)+1;
		  int a=num1+num2;
		  
		  
		  if(d==1) {
			  if(a>=11) {
				  System.out.println("正解");
			  }else {
				  System.out.println("外れ");
			  }
		  }else if(d==2) {
			  if(a<11) {
				  System.out.println("正解");
			  }else {
				  System.out.println("外れ");
			  }
		  }s.close(); 
		  

	}

}
