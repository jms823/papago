package Calc;

public class Test {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.Calc(10, "+", 15));
		System.out.println(c.Calc(20, "-", 15));
		System.out.println(c.Calc(10, "*", 10));
		System.out.println(c.Calc(100, "/", 5));
	}
}
