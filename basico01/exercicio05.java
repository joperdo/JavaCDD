package basico01;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner entrada01 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num01 = entrada01.nextInt();
		
		Scanner entrada02 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num02 = entrada02.nextInt();
		
		double media = (num01+num02)/2;
		System.out.println(media);

	}

}
