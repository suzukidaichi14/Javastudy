package javastudy;
import java.util.Scanner;
import java.util.Random;
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// �ۑ�4
		String[] hund= {"�O�[","�`���L","�p�["};
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("����񂯂�Q�[���ł��B�O�[�Ȃ�1�A�`���L�Ȃ�2�A�p�[�Ȃ�3���o���Ă�������");
		System.out.println("�O�񏟂����炨�݂����������܂�");
		System.out.print("�ŏ��̓O�[�A����񂯂�|��>");
		
		
//		�ۑ�4
		int win=0;
		int lose=0; 
		
	
	    
		while(win<3 && lose<3) {
			int cpuhund = random.nextInt(3)+1;
			
		 int d= s.nextInt();
		cpuhund = random.nextInt(3)+1;
		if(d==1 && cpuhund==d) {
			System.out.println("���ʂ͂������ł�");
			System.out.print("�������ł���>");
			
		}else if (d==1 &&cpuhund==2) {
			System.out.println("���ʂ͏����ł�");
			
			win++;
			
			
		}else if (d==1 &&cpuhund==3) {
			System.out.println("���ʂ͕����ł�");
			
			lose++;
			
		}
		if(d==2 && cpuhund==d) {
			System.out.println("���ʂ͂������ł�");
			System.out.print("�������ł���>");
		 }else if(d==2 && cpuhund==1){
			 System.out.println("���ʂ͕����ł�");
			 
			 lose++;
			 
		 }else if(d==2 && cpuhund==3) {
			 System.out.println("���ʂ͏����ł�");
			 
			 win++;
			 
		 }
		 if(d==3&&cpuhund==d) {	 
			 System.out.println("���ʂ͂������ł�");
			 System.out.print("�������ł���>");
		 }else if(d==3&&cpuhund==1) {
			 System.out.println("���ʂ͏����ł�");
			
			 win++;
			 
		 }else if (d==3&&cpuhund==2) {
			 System.out.println("���ʂ͕����ł�");
			 
			 lose++;
			 
		 }
		 if(win<3&&lose<3 && !(d==cpuhund)) { 
			 System.out.print("�ŏ��̓O�[�A����񂯂�|��>");
			 }
		 
		 
		 
		 
		 
		 if(win==3) {
			 String[] fortune= {"��g", "���g", "�g", "���g","���g","��"};
				Random dom = new Random();
				int index = dom.nextInt(fortune.length);

				System.out.println("���Ȃ��̉^����"+fortune[index]);
				}
		}	 

		
		 
		
	}
		 
		 
		  
		 
		
		
	

}
