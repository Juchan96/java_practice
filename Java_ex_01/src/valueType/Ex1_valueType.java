package valueType;

public class Ex1_valueType {
public static void main(String[] args) {
		
    	//�ڷ���( �⺻�ڷ��� )
    	/*
    	 ����: boolean - 1bit
    	 ������: char - 2byte
    	 ������: byte - 1byte ........ -128 ~ 127
    	      short - 2byte ....... -32768 ~ 32767
    	      int - 4byte ......... -21�� ~ 21��
    	      long - 8byte ........ -900��~ 900��
    	 �Ǽ���: float - 4byte
    	      double - 8byte
    	 */
    	
    	//���� : ���߿� ����� ���� ������ �Ӽ�
    	//���� ���� ��Ģ
    	//�ڷ��� ������; (����)
    	//������ =��;(����)
    	//�ڷ��� ������ = ��;(�ʱ�ȭ)
    	
    	//������ ǥ���
    	//[ī�� ǥ���] (�� �ܾ��� ù ->�빮��)
    	//int typeName = 100;
    	//boolean backColor = true;
    	
    	//[�밡���� ǥ���] (�տ� �ڷ��� ù���� ǥ��)
    	//int nTest = 100;
    	//short sTest = 100;
    	//float fTest = 3.14;
    	
    	//[ �Ľ�Į ǥ���] (�ǵ������� ù���� �빮�� <Ŭ�� ���� ������ Ȱ��>)
    	//BackColor, TypeName ....
    	
    	//[ ������ũ ǥ���] (����ٸ� �̿��Ͽ� �����ϴ� �ۼ���)
    	//type_name, back_color ....
    	
    	//���� boolean
    	//������ true, false ��, ���� ������ �� ���� ���� ������ �� �ִ�.
    	//boolean b =100; <-- �ڷ����� Ÿ���� ��ġ���� �����Ƿ� ����
    	boolean b = true;
    	System.out.println("b�� ��:"+b);
    	
    	b = false;
    	System.out.println("b�� ��:"+b);
    	//�������� �ߺ��� �Ǹ� �ȵ˴ϴ�. (boolean b = false ;  (x) )
    	
    	//������ char
    	//�������� Ȭ����ǥ �ȿ� �־���ϸ�, ������ �ѱ���
    	char c = 'A';
    	System.out.println("c�� ��:" + c);
    	
    	char c2 = 65+ 1 ;
    	System.out.println("c2�� ��:" + c2);
    	
    	//������
    	//byte by = 128; <-- byte �ڷ����� ǥ�������� �Ѿ�� ���̹Ƿ� ����
    	byte by = 127;
    	short s = 32767;
    	int num = 2100000000;
    	long num2 = 2200000000L;  //��Ʈ������ ����� long�� ��� �ڿ� L(l) �־������
    	
    	System.out.println("num:" + num);
    	System.out.println("num2:" + num2);
    	
    	//�Ǽ���
    	float f =3.14F;
    	double d = 3.14; // float�� ������ �ڿ� F(f)�� �ٿ�����
    	System.out.println("f:"+f);
    	System.out.println("d:"+d);
    	
    	f = 100f;
    	d = 100;
    	System.out.println("f:"+f);
    	System.out.println("d:"+d);
    	
    	
    	
	}
}
