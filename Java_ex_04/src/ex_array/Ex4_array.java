package ex_array;

public class Ex4_array {
	public static void main(String[] args) {


		//���: 106
		int[ ] arr = {10, 11, 15, 20, 50};
		int result = 0;
		int result1 = 0;

		for(int i = 0; i <arr.length; i++) {

			result +=arr[i];
		}
		System.out.println("��� : "+result);
		System.out.println("-------------------(������ ����)-----------------------");
		for (int n: arr) {
			result1 += n;

		}
		System.out.println("��� : "+result1);

	}//m

}
