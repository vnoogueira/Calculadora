import javax.swing.JOptionPane;

public class IMC2 {
	public static void main(String[] args) {
	String x,y;
	float massa, altura;
	
	x=JOptionPane.showInputDialog("DIgite seu peso: ");
	y=JOptionPane.showInputDialog("Digite sua altura");
	massa=Float.parseFloat(x);
	altura=Float.parseFloat(y);
	JOptionPane.showMessageDialog(null, "Seu IMC é: "+(massa/(altura*altura)));
	System.exit(0);
}
}

