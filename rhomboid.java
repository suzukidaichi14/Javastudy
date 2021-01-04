package javastudy;

public class rhomboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		for(int i=0;i<5;i++) {
			for(int j=0;j<3-(i-1);j++) {
				System.out.print(" ");
			}
			
		for(int d=0;d<(i+1)*2-1;d++) {
			System.out.print("¡");
		}
		for(int j=0;j<3-(i-1);j++) {
			System.out.print(" ");
		}
		System.out.println( );
		}
		for(int e=0;e<4;e++) {
			for(int w=0;w<2+(e-1);w++) {
				System.out.print(" ");
			}
			for(int s=0;s<9-(e+1)*2;s++) {
			System.out.print("¡" );
			}
			for(int w=0;w<2+(e-1);w++) {
				System.out.print(" ");
			}
			System.out.println( );
		}
			
		

	}

}
