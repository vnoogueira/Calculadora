import java.util.Scanner;

public class MediaBim {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, bim1, bim2;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = s.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = s.nextFloat();
		System.out.println("A media do primeiro bimestre foi: " + mediaBim1(nota1, nota2));
		System.out.print("Digite a primeira nota do segundo bimestre:");
		nota3 = s.nextFloat();
		System.out.print("Digite a segunda nota do segundo bimestre: ");
		nota4 = s.nextFloat();
		System.out.println("A media do segfundo bimestre foi: "+ mediaBim2(nota3, nota4));
		bim1 = mediaBim1(nota1, nota2);
		bim2 = mediaBim2(nota3, nota4);
		System.out.println("A media final foi de: "+ mediaFinal(bim1, bim2));
		
	}
		public static float mediaBim1 (float x, float y) {
			return ((x+y)/2);
		}
		public static float mediaBim2 (float x, float y) {
			return((x+y)/2);
		}
		public static float mediaFinal(float x, float y) {
			return (float) ((x*2+y*3)/2);
		}
}
