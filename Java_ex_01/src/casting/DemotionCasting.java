package casting;

public class DemotionCasting {
	
public static void main(String[] args) {
		
		//���� ĳ����: ���� �ڷ����� ū �ڷ����� ���ԵǴ� ����
		char c = 'B'; // 2byte
		int n = c + 1; // 4byte
		//c = n;  2byte �� 4byte ���� ���� �� ����. �սǵǴ� ���� ���� �� �ִ�. (�����߻�)
		
		c = (char)n;  //���� �̷��� �Ѵٰ� �����ݴϴ�. 
		System.out.println("c:"+c);
		
		float f = 5.5f;
		System.out.println("f:"+f);
		n = 0;
		n = (int)f;  //�Ҽ��� ���󰡴� �� �����ϸ鼭 ���� �Ǽ� -->���� ��ȯ
		System.out.println("n:"+n);
		
	}
}
