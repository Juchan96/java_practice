package ex_scanner;

import java.util.Scanner;

public class Ex_Scanner {
	public static void main(String[] args) {
		
		
		//Ű������ ���� �Է¹ޱ� ���� Scanner Ŭ��
		Scanner scan = new Scanner( System.in);  //��ĳ�� ��ü�� �����
		//�ϱ��ϱ�  Ű���忡�� �� ����  �� ����
	    System.out.println("����:");
		
		int n = scan.nextInt();  //�ؽ�Ʈ ��Ʈ���� �޾Ƽ� ���͸� ������ int n���� ��
	    System.out.println("�Է¹��� ��:"+n);
	    
	    System.out.println("����:");
	    String str = scan.next(); //���� �̿ܿ� ���� �Է¹޴� ���� next()��
	    System.out.println("�Է¹��� ��:" + str);
	    
	    System.out.println("����:");
	    Scanner scan2 = new Scanner(System.in);  //��ĳ�ʰ��� ���ι޴´�
	    str = scan2.nextLine();   //�� ��Ʈ ������ ����!! nextLine ��쿡�� �� �򰥸�
	    System.out.println("��:"+ str);
	    
	    
	
	}//main
}