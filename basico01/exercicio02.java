package basico01;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int num = entrada.nextInt();
	if (num > 0) {
		System.out.println("positivo");
	}
	else {
		System.out.println("negativo");
	}
	}
}

