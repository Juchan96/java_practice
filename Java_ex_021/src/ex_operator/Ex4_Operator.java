package ex_operator;

public class Ex4_Operator {

public static void main(String[] args) {
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� ����
		int a = 10;
		System.out.println("a:" + ++a);   //++�� a �տ� �־ �������� (�״��� ����Ʈ)
		
		int b = 10;
		System.out.println("b:" + b++);  //++�� b �ڿ� �־ ����Ʈ �켱 �ϰ� ��������
		System.out.println("b:" + b);
		
		System.out.println("a:" + a--);  // --�� a�ڿ� �־ ����Ʈ �켱�ϰ� ���న��
		System.out.println("a:" + a);
		
		++a;
		++a;
		a--;
		a++;
		--a;
		System.out.println("a:"+ ++a); // ++++a �̷��� ���� x ���������ڴ� ������ 1���ۿ� ����,����
		                               // 2�� �����ϰ� ������ a += 2 or a -= 2 �̷������� �ؾ���
		
		System.out.println("-------------------------------------------");
		
		//���׿�����
		//�ϳ��� ���ǿ� ���� ����� ���϶��� �����϶�
		//�� ����� ���� �ϳ��� ���� ������� ����ϴ� ������
		int num1 = 10;
		int num2 = 15;
		boolean result = ++num1 >= num2 ? true : false;  // ? ������ ������ 3�׿����� , ? �տ� ������ ���� ������ ��or �����̾����
		System.out.println(result);
		
		num1 = 10;
		num2 = 20;
		char result2 = (num1 += num1) == num2 ? 'O' : 'X' ;
		System.out.println(result2);
		
		System.out.println("-------------------------------------------");
		
		
		int age = 27;
		//25�� �̻� ~ 30�� �̸��� �˹ٻ��� ������ �Ѵ�.
		//���ǿ� �����ϸ� �հ�, �������� ������ ���հ� ���
		char result3 = (age>= 25 && age <30 ) ? '��' : '��' ;
		System.out.println(result3);
		
		System.out.println("-------------------------------------------");
		
		a = 10;
		b = 12;
		result = ++a >= b || 2+7 <= b && 13 - b>= 0 && (a+=b) - (a % b) > 10;
		System.out.println(result);
		//���� �տ��ִ� ������� �ϳ��ϳ� �������� �س����� �ȴ�.
		//    x  or    o     and  o  and o
		//�߿� ! Ư�� ���� and �� false ��� �ڴ� ���� x
		
	}//main
	
	
}
