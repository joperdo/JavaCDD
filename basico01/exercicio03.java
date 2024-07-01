package basico01;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner entrada01 = new Scanner(System.in);
		System.out.println("Digite o 1º numero: ");
		int num01 = entrada01.nextInt();
		
		Scanner entrada02 = new Scanner(System.in);
		System.out.println("Digite o 2º numero: ");
		int num02 = entrada02.nextInt();
		
		Scanner entrada03 = new Scanner(System.in);
		System.out.println("Digite o 3º numero: ");
		int num03 = entrada03.nextInt();
		
		if (num01 > num02 && num01 > num03){
			System.out.println(num01);
		}
		else if (num02 > num01 && num02 > num03){
			System.out.println(num02);
		}
		else {
			System.out.println(num03);
		}
		}
	}
