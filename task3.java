package javastudy;
import java.util.Random;
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		‰Û‘è3-1
		String[] fortune= {"‘å‹g", "’†‹g", "‹g", "¬‹g","––‹g","‹¥"};
		Random random = new Random();
		int index = random.nextInt(fortune.length);

		System.out.println(fortune[index]);
	
//		 ‰Û‘è3-2
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
		
		
		
//	    ‰Û‘è3-3	
	     System.out.println(count+"‰ñ–Ú");
	    
	     
	     }
		
}
	

