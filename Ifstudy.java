package javastudy;

public class Ifstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7;
		int num2=7;
		if(num1<num2) {
			System.out.println(num2);
		}else{
			System.out.println(num1);
		}
		if(num1==num2) {
			System.out.println("����");
		}else {
			System.out.println("�Ⴄ");
		}
//		�ۑ�0
		int age=40;
		if(age<20) {
			System.out.println("�����N");
		}else if(age<30) {
			System.out.println("20��");
		}else if (age<40) {
			System.out.println("30��");
		}else if (40<=age) {
			System.out.println("40��ȏ�");
		}
//       �ۑ�1
		int a=90;
		int b=40;
		if((a+b)>=160) {
			System.out.println("�g�D�h");
		}else if (a<40|| b<40) {
			System.out.println("�ǎ�");
		}else if((a+b)>=140){
			System.out.println("�g�ǁh");
		}else if ((a+b)>=100){
			System.out.println("�g�h");
		}else if ((a+b)<100) {
			System.out.println("�ǎ�");
		}
			
//	�ۑ�2			
		int c=4;
		if(c%2==0) {
			System.out.println("����");
		}if(c%2==1){
			System.out.println("�");
		}
//	�ۑ�2-2
		int d=-7;
		if( d<0 && d%2==0) {
			System.out.println("���̋���");
		}else if(d%2==-1){
			System.out.println("���̊");
		}else if(d%2==1) {
			System.out.println("���̊");
		}else if(d%2==0) {
			System.out.println("���̋���");
		}
//		�ۑ�3
		double weight=100;
		double height=1.8;
		double bmi=weight/height/height;
		if (bmi>25) {
			System.out.println("�얞");
		}else if (bmi>=18.5){
			System.out.println("�W��");
		}else if (bmi<18.5) {
			System.out.println("��̏d");
		}
			
		
		
		
		
		
		
		
		
		}
	}

			
		
	


