package Controller;

public class OperacoesController {
	public int Fib(int x) {
		//Condicao de parada
		//Se o valor for 0 ou 1, retornar o mesmo valor
		if (x==0 || x ==1) {
			return x;
		}else {
			// Fib(6) -> fib(5) + fib(4) ->fib(4) +fib(3) ...
			return Fib(x-1) + Fib(x-2);
		}
	}
}
