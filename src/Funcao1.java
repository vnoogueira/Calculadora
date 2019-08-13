import java.util.Scanner;

public class Funcao1 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		float a, b;
		System.out.print("valor 1: ");
		a=s.nextFloat();
		System.out.print("Valor 2: ");
		b=s.nextFloat();
		System.out.println("Soma: " + soma(a,b));
		System.out.println("Produto: " + produto(a,b));
	}
	public static float soma (float x, float y) {
		return (x+y);
	}
	public static float produto (float x, float y) {
		return (x*y)
;	}
}
