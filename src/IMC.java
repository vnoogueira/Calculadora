import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float massa, altura;
		
		System.out.println("Calculo do seu IMC!!!");
		System.out.print("DIgite seu peso: ");
		massa=s.nextFloat();
		System.out.println("Digite sua altura: ");
		altura=s.nextFloat();
		System.out.println("O seu IMC é de: "+(massa/(altura*altura)));
	}
}
