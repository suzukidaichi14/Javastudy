package javastudy;
import java.util.Scanner;
import java.util.Random;
public class game_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);	
		Random random = new Random();
		System.out.println("数当てゲーム");
		System.out.println("1から10の数字を選んでCPUが選んだ数字を当ててください。");
		System.out.println("所持ポイントは1000ptで、何ptか賭けてポイントが0ptになるか、5000ptになれば終わりです。");
		int pt = 1000;
		int bit=0;
		int p=0;
		while(pt<5000 && pt>0) {
					 System.out.print("掛け金を入力してください。>");
						bit=s.nextInt();
						if(pt<bit) {
							System.out.println("所持ポイントより低くしてください。");
							continue;
							}
				
					System.out.print("1～10の数字を入力してください。>");
					p =s.nextInt();
					if(p>10) {
						System.out.print("1～10の数字を入力してください。>");
						p =s.nextInt();
						continue;
				}
				int d=pt-bit;
				int cpu=random.nextInt(10)+1; 
				if(p==cpu) {
					System.out.println("正解");
					pt=d+bit*2;
					System.out.println("現在"+ pt +"pt");	
				}else if(p!=cpu) {
					System.out.println("外れ");
				    pt=d;
					System.out.println("現在"+ pt +"pt");	
				}
			}
		System.out.println("終了です");
	}	
}