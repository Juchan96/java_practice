package ex_control_statement;

public class Ex6_switch {
	
	public static void main(String[] args) {
		
		String select = "c";
		
		switch (select) {
		case "a":
			System.out.println("a����");
			break;
		
		case "b":
			System.out.println("b����");
			break;
		
		case "c":
			System.out.println("c����");
			break;	

		default:
			System.out.println("default");
			break;
		}
		
	}//main
	

}
