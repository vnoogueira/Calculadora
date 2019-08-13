import javax.swing.JOptionPane;

public class MediaBim2 {
	public static void main(String[] args) {
		String nota1, nota2, nota3, nota4;
		float a, b, c, d, bim1, bim2;
		
		nota1 = JOptionPane.showInputDialog("Digite a primeira nota do Bim1: ");
		nota2 = JOptionPane.showInputDialog("Digite a segunda nota do Bim1: ");
		a = Float.parseFloat(nota1);
		b = Float.parseFloat(nota2);
		JOptionPane.showMessageDialog(null, "A media do primeiro Bimestre foi: " + mediaBim1(a, b));
		nota3 = JOptionPane.showInputDialog("Digite a primeira nota do Bim2: ");
		nota4 = JOptionPane.showInputDialog("Digite a segunda nota do BIM2: ");
		c = Float.parseFloat(nota3);
		d = Float.parseFloat(nota4);
		JOptionPane.showMessageDialog(null,"A media do Bimestre 2 foi:" + mediaBim2(c, d));
		bim1 = mediaBim1(a, b);
		bim2 = mediaBim2(c, d);
		JOptionPane.showMessageDialog(null,"A media final foi: " + mediaFinal(bim1, bim2));
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

