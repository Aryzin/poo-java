package ex4;

public class Ex4 {

	public static void main(String[] args) {
		String a="Ary";
		String b="Ary";
		
		if(a.equals(b)) {
			System.out.println("Equals");
		}
        if(a.equalsIgnoreCase(b)) {
        	System.out.println("EqualsIgnoreCase");
        }
        if(a==b) {
        	System.out.println(" == ");
        }
	}

}