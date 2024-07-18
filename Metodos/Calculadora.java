package Metodos;

public class Calculadora {
	public static void main(String[] args) {
		CalcularMetodos conta = new CalcularMetodos();
		int somar01 = conta.somar(1, 2);
		System.out.println(somar01);
		int somar02 = conta.somar(1, 2, 3);
		System.out.println(somar02);
		
		int sub01 = conta.subtracao(2, 1);
		System.out.println(sub01);
		int sub02 = conta.subtracao(3, 2, 1);
		System.out.println(sub02);
		
		int mult01 = conta.multiplicacao(4, 2);
		System.out.println(mult01);
		int mult02 = conta.multiplicacao(3, 2, 2);
		System.out.println(mult02);
		
		int div01 = conta.divisao(4, 2);
		System.out.println(div01);
		int div02 = conta.divisao(12, 2, 2);
		System.out.println(div02);
	}
}

