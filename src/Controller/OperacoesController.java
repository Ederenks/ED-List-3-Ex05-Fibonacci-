package Controller;

public class OperacoesController {
	public int Fib(int x) {
		//Condicao de parada
		if (x==0 || x ==1) {
			return x;
		}else {
			return Fib(x-1) + Fib(x-2);
		}
	}
}
