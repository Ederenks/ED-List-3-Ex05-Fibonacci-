package View;
import javax.swing.JOptionPane;
import Controller.*;

//OBJETIVO: Receber um valor, limitado a 20, e retornar o N° Termo da serie de Fibonacci
// Fibonacci -> 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

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
