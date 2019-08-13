import java.util.Scanner;

public class Funcao2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float peso, altura;
		float imc;
		System.out.println("Peso da pessoa (kg): ");
		peso = ler.nextFloat();
		System.out.println("Altura da pessoa (M): ");
		altura = ler.nextFloat();
		imc = calcIMC(peso, altura);
		System.out.println("Resultado do IMC: " + resultadoIMC(imc));
		ler.close();
		System.exit(0);
	}
	public static float calcIMC(float x, float y)
	{
		return (x/(y*y));
	}
	public static String resultadoIMC(float imc) {
		String result;
		if(imc <= 19)
			result = "Abaixo do peso";
		else if (imc <= 25)
			result = "Peso Ideal";
		else if (imc <= 30)
			result = "Acima do peso";
		else if (imc <= 35)
			result = "Obesidade leve";
		else
			result = "Obesidade";
		
		return result;
	}
}

