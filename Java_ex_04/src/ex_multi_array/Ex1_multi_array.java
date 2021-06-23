package ex_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		//1차원 배열이 2개 묶여있으면 2차원 배열
		//1차원 배열이 3개 묶여있으면 3차원 배열
		int[][] test = new int[2][3];
		            //1차원배열의수(큰방) | 각 1차원 배열의 index 수(작은방)
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;   //모든 방 전부 할당      || 가장 작은 방에만 값을 채울 수 있음 || 3차원 이상부터는 가지 형식으로 보는게 편하다
		
		System.out.println(test[1][1]);
		System.out.println(test.length );
		
		for(int i = 0; i < test.length; i ++) {     //test.length : 배열 큰 방의 수 !!!!!
			
			for(int j = 0; j< test[i].length; j++) {   // test[i].length : 배열 작은 방의 수!!!
				
				System.out.print(test[i][j]+" ");
			}//inner
			
			System.out.println();  //이거 센스 
			
		}//outer
		
		
		
		
		
		
		
		
		
		
	}//m

}
