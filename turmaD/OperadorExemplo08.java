package turmaD;

public class OperadorExemplo08 {

	public static void main(String[] args) {
		int idade = 15;
		boolean amigoDoDono = true;
		
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("não pode entrar");
		}
		else {
			System.out.println("pode entrar");
		}
	}

}
