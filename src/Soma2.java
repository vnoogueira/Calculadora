import javax.swing.JOptionPane;

public class Soma2 {
	public static void main (String[] args) {
		String a,b;
		int x,y;
		
		a=JOptionPane.showInputDialog("Valor 1:");
		b=JOptionPane.showInputDialog("Valor 2:");
		x=Integer.parseInt(a);
		y=Integer.parseInt(b);
		JOptionPane.showMessageDialog(null,"Resultado da soma é: "+(x+y));
		System.exit(0);
		
		
		
		
	}
}
