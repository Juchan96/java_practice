package casting;

public class PromotionCasting {
	
public static void main(String[] args) {
		
		//ĳ����(����ȯ)
		//1.���θ�� ĳ����: ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��(�ڵ����� �̷����)
		double d = 100.5; //8byte
		int n = 200; //4byte
		
		d = n;  //d���� n�� ����   �� ū �ڷ����� ���� �ڷ����� ����
		System.out.println("d:"+d);
		
		char c ='A'; //2byte
		long l = 100; //8byte
		l = c; //�ƽ�Ű �ڵ�� ��ȯ��
		System.out.println("l:"+l);
		
	}

}
