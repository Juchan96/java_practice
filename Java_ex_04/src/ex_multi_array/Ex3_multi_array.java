package ex_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {
		
		String[][] java = { {"¿µÈñ Á¡¼ö", "j:100", " a:90"},
			              	{"Ã¶¼ö Á¡¼ö", "j:50"}   };
		
		for(int i = 0; i< java.length; i++) {
			
			for (int j =0; j< java[i].length; j++) {
				
				System.out.print(java[i][j] + "\t");
			}
			System.out.println();
			
		}//outer
		
	}//m

}
