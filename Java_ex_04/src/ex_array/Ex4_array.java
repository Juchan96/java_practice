package ex_array;

public class Ex4_array {
	public static void main(String[] args) {


		//결과: 106
		int[ ] arr = {10, 11, 15, 20, 50};
		int result = 0;
		int result1 = 0;

		for(int i = 0; i <arr.length; i++) {

			result +=arr[i];
		}
		System.out.println("결과 : "+result);
		System.out.println("-------------------(개선된 루프)-----------------------");
		for (int n: arr) {
			result1 += n;

		}
		System.out.println("결과 : "+result1);

	}//m

}
