package pasta.executavel;

public class PrimeiraClasse {
	public static void main(String[] args) {

	
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 0;
		int nota4 = 0;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 70) {
			System.out.println("Aprovado");
		}
		if(media >= 40 && media <= 69) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		
	}
}
