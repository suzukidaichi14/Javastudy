package javastudy;
import java.util.Random;
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ۑ�3-1
		String[] fortune= {"��g", "���g", "�g", "���g","���g","��"};
		Random random = new Random();
		int index = random.nextInt(fortune.length);

		System.out.println(fortune[index]);
	
//		 �ۑ�3-2
		 int count=1; 
		 
		 while(true){
			System.out.println(fortune[index]);
			index = random.nextInt(fortune.length);
			
			if(index==0) {
				System.out.println(fortune[index]);
				break;
				
			}
			count++;
		}
		
		
		
//	    �ۑ�3-3	
	     System.out.println(count+"���");
	    
	     
	     }
		
}
	

