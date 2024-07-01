package basico01;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		char opcao;
		Scanner input = new Scanner(System.in);
		System.out.println("qual o seu genero? ");
		opcao = input.next().charAt(0);
		
		if (opcao == 'f'){
			System.out.println("voce e fresca");
		}
		else if (opcao == 'm'){
			System.out.println("vose e macho");
		}
		else {
			System.out.println("vose e android");
		}

	}
}
