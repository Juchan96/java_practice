package ex_operator;

public class Ex1_Operator {
	
public static void main(String[] args) {
		
		/*
		 1. �ְ����� : ..()
		 2. ���������� : ++,--
		 3. ��������� : +,-,*,/,%
		 4. ����Ʈ������ : >>,<<
		 5. �񱳿����� : > , < , >= ,<= , == , !=
		 6. ��Ʈ������ : &, | , ^ , ~ 
		 7. �������� : &&, || , !
		 8. ���ǿ�(����)������: ? , :
		 9. ���Կ�����: =, *= , /= , %= , += , -=
		 */
		
		//���������
		//��������ڴ� 4Ģ����� ������ ���� ���ϴ� �����������ڷ� ������.
		int n1 = 20;
		int n2 = 0;
		int n3 = 0; //���� ����ִ°��� �ʱ�ȭ��� �Ѵ�.
		
		n1 = 20;
		n2 = 7;
		n3 = n1 + n2;
		System.out.println("n3:"+n3);
		
		n3 = n1 / n2;
		System.out.println("n3:"+n3); //��
		
		n3 = n1 % n2;
		System.out.println("n3:" +n3); //������
		
		System.out.println("---------------------------------------");
		
		//���� ������
		//Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int i1 = 10;
		int i2 = 7;
		int i3 = i1 += i2 ;  //i1 = i1 +i2
		System.out.println("+=������:" + i3);
		
		i3= i1-= i2;  //i1 = i1 - i2
		System.out.println("-=������:" + i3);
		
		i3 = i1 %= i2;  //i1 = i1 % i2
		System.out.println("%=������:" + i3);
		
		System.out.println("---------------------------------------");
		
		//�񱳿�����
		//������ ����� ���� ���Ͽ� ��.������ �Ǵ��ϴ� ������
		int a1 = 10;
		int a2 = 20;
		boolean result = a1 < a2;   //boolean �߿�!!!
		System.out.println("a1 < a2 :"+result);
		
		result = a1 == a2;
		System.out.println("a1 == a2:"+ result);
		
		result = a1 != a2;   //java���� !�� not�� �ǹ�
		System.out.println("a1 != a2:" + result);
		
	}//main

}
