import java.util.ArrayList;

public class PrimitiveTypes {

	public static void main(String[] args) {
		int maxIntValue = Integer.MAX_VALUE;
		//long outOfRangeInt = 2147483648;
		long outOfRangeLong = 2147483648L;
		
		int octal = 017;
		int hex = 0xFF;
		int binary = 0b11;
		
		//Underscore examples
		int num1 = 1000;
		//int num2 = _1000;
		int num3 = 1_000;
		double num4 = 1_000.0_0;
		
		
		//short x = 99999999999999;
		short y = 2;
		//short numero = x + y; 
		//long x = 100.0; //No compila
		
		
		Object cadena = new X();
		System.out.println(""+cadena);
		
		ArrayList<Double> x = new ArrayList<>();
		x.indexOf("");
		x.contains("");
		Double l = 11.0; 
	}
}

class X {
	public String toString() {
		return "X";
	}
}
