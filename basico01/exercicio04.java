package basico01;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		if (num == 1){
			System.out.println("domingo");
		}
		else if (num == 2){
			System.out.println("segunda");
		}
		else if (num == 3){
			System.out.println("terça");
		}
		else if (num == 4){
			System.out.println("quarta");
		}
		else if (num == 5){
			System.out.println("quinta");
		}
		else if (num == 6){
			System.out.println("sexta");
		}
		else if (num == 7){
			System.out.println("sabado");
		}
		else {
			System.out.println("digite um número válido");
		}
	}

}
