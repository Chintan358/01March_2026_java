package operators;

public class O004_Logical {
	public static void main(String[] args) {
		
		// && , ||, !
		
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println("***********");
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		
		System.out.println(10>20 || 30>20);
		
	}
}
