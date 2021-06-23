package ex_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		 
		
		// 큰 방마다 작은 방의 갯수가 다를 수 있다.
		
		int[][] num = new int[2][];
		num[0] = new int[3];    //작은 방 새로 공사
		num[1] = new int[2];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		
		num[1][0] = 40;
		num[1][1] = 50;
		
		for( int i=0; i < num.length; i++) {
			
			for(int j= 0; j<num[i].length; j ++) {
				System.out.print( num[i][j] + " ");
			}//inner
			
			System.out.println();
		}//outer
			
	
		
		
		
		
		
		
	}//m

}
