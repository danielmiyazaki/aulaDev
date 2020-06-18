package aula2;

import javax.swing.JOptionPane;
public class exemplo3 {

	public static void main(String[] args) {
		
		String a,b;
		float x,y,res;
		
		a = JOptionPane.showInputDialog("Digite o primeiro numero");
		
		x = Float.parseFloat(a);
		
		b = JOptionPane.showInputDialog("Digite o segundo numero");
		
		y = Float.parseFloat(b);
		
		res = x+y;
		
		JOptionPane.showMessageDialog(null,  "Resultado da Soma: "+res);
		
		res = x-y;
		
		JOptionPane.showMessageDialog(null,  "Resultado da Subtração: "+res);
		
	}

}
