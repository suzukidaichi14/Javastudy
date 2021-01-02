package javastudy;
import java.util.Scanner;
import java.util.Random;
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 課題4
		String[] hund= {"グー","チョキ","パー"};
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("じゃんけんゲームです。グーなら1、チョキなら2、パーなら3を出してください");
		System.out.println("三回勝ったらおみくじを引けます");
		System.out.print("最初はグー、じゃんけんポン>");
		
		
//		課題4
		int win=0;
		int lose=0; 
		
	
	    
		while(win<3 && lose<3) {
			int cpuhund = random.nextInt(3)+1;
			
		 int d= s.nextInt();
		cpuhund = random.nextInt(3)+1;
		if(d==1 && cpuhund==d) {
			System.out.println("結果はあいこです");
			System.out.print("あいこでしょ>");
			
		}else if (d==1 &&cpuhund==2) {
			System.out.println("結果は勝ちです");
			
			win++;
			
			
		}else if (d==1 &&cpuhund==3) {
			System.out.println("結果は負けです");
			
			lose++;
			
		}
		if(d==2 && cpuhund==d) {
			System.out.println("結果はあいこです");
			System.out.print("あいこでしょ>");
		 }else if(d==2 && cpuhund==1){
			 System.out.println("結果は負けです");
			 
			 lose++;
			 
		 }else if(d==2 && cpuhund==3) {
			 System.out.println("結果は勝ちです");
			 
			 win++;
			 
		 }
		 if(d==3&&cpuhund==d) {	 
			 System.out.println("結果はあいこです");
			 System.out.print("あいこでしょ>");
		 }else if(d==3&&cpuhund==1) {
			 System.out.println("結果は勝ちです");
			
			 win++;
			 
		 }else if (d==3&&cpuhund==2) {
			 System.out.println("結果は負けです");
			 
			 lose++;
			 
		 }
		 if(win<3&&lose<3 && !(d==cpuhund)) { 
			 System.out.print("最初はグー、じゃんけんポン>");
			 }
		 
		 
		 
		 
		 
		 if(win==3) {
			 String[] fortune= {"大吉", "中吉", "吉", "小吉","末吉","凶"};
				Random dom = new Random();
				int index = dom.nextInt(fortune.length);

				System.out.println("あなたの運勢は"+fortune[index]);
				}
		}	 

		
		 
		
	}
		 
		 
		  
		 
		
		
	

}
