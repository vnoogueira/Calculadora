import java.util.Scanner;

public class Subtra��o {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int a,b;
		
		System.out.println("Subtra��o de numeros inteiros");
		System.out.print("Valor 1: ");
		a=s.nextInt();
		System.out.print("Valor 2: ");
		b=s.nextInt();
		System.out.println("Resultado: "+(a-b));
		
	}
}
