package ex_printf;

public class Ex_printf {
	
public static void main(String[] args) {
		
		System.out.printf("%d + %d = %d", 5 ,5,10);  //"%d",  �ǹ�: �ݵ�� ������ ���;��մϴ�.
		System.out.println();
		
		System.out.printf("%02d" , 7);  //2�ڸ� �����϶��� �տ� 0�� �ٿ� 2�ڸ��� ������ش�
		
		System.out.println();
		
		System.out.printf("%03d" , 7);  //3�ڸ� �����϶��� �տ� 0�� �ٿ� 3�ڸ��� ������ش�.
		
		System.out.printf("\n");  // wonǥ�� + n     ==> �ٹٲ� printf �ڵ�

		System.out.printf("%f : %f\n ", 10.2 , 3.14);   // "%f" �� �Ǽ��Է� Ÿ�� 
		System.out.printf("%.2f\n", 3.141592);   // %���ٰ� . (��) ��� 2 f �ϸ� �Ҽ��� ���ڸ� ���� ǥ��
		
		System.out.printf("%s-%s", "ȫ" , "�浿");  //%s�� ���ڿ�Ÿ��
		System.out.printf("\n");
		
		//%d: ����Ÿ��
		  // %f: �Ǽ�Ÿ��
		   //%s: ���ڿ�Ÿ�� (�ֵ���ǥ)
		   //%c: ����Ÿ��  (Ȭ����ǥ)

		String str = String.format("%d %s %c", 10, "ȫ�浿" , '��');  //����ϰ� ���� ���������س��� �뵵!!
		                                                            //str�� �� ���� ����
		
		System.out.printf(str);
		
		
		
	}//main

}
