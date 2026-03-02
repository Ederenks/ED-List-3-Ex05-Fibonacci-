package View;
import javax.swing.JOptionPane;

import Controller.*;
public class Main {
	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int x= Integer.parseInt(JOptionPane.showInputDialog("Digite o termo limite"));
	if (x>20) {
		 x = Integer.parseInt(JOptionPane.showInputDialog("Digite um termo menor que 20!"));
		}
	System.out.println(op.Fib(x) );
	
	}
}
