package javastudy;
import java.util.Scanner;
import java.util.Random;
public class game_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);	
		Random random = new Random();
		System.out.println("�����ăQ�[��");
		System.out.println("1����10�̐�����I���CPU���I�񂾐����𓖂ĂĂ��������B");
		System.out.println("�����|�C���g��1000pt�ŁA��pt���q���ă|�C���g��0pt�ɂȂ邩�A5000pt�ɂȂ�ΏI���ł��B");
		int pt = 1000;
		int bit=0;
		int p=0;
		while(pt<5000 && pt>0) {
					 System.out.print("�|��������͂��Ă��������B>");
						bit=s.nextInt();
						if(pt<bit) {
							System.out.println("�����|�C���g���Ⴍ���Ă��������B");
							continue;
							}
				
					System.out.print("1�`10�̐�������͂��Ă��������B>");
					p =s.nextInt();
					if(p>10) {
						System.out.print("1�`10�̐�������͂��Ă��������B>");
						p =s.nextInt();
						continue;
				}
				int d=pt-bit;
				int cpu=random.nextInt(10)+1; 
				if(p==cpu) {
					System.out.println("����");
					pt=d+bit*2;
					System.out.println("����"+ pt +"pt");	
				}else if(p!=cpu) {
					System.out.println("�O��");
				    pt=d;
					System.out.println("����"+ pt +"pt");	
				}
			}
		System.out.println("�I���ł�");
	}	
}