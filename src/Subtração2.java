import javax.swing.JOptionPane;

public class Subtra��o2 {
	public static void main(String[] args) {
		String x,y;
		int a,b;
		
		x=JOptionPane.showInputDialog("Valor 1:");
		y=JOptionPane.showInputDialog("Valor 2:");
		a=Integer.parseInt(x);
		b=Integer.parseInt(y);
		JOptionPane.showMessageDialog(null, "Resultado da subtra��o: "+(a-b));
		System.exit(0);
		
	}
}
