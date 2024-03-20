package pasta.executavel;

public class PrimeiraClasse {
	public static void main(String[] args) {

	
		/*Switch Case*/
		int dia = 1;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;

		default: System.out.println("Outro dia " + dia);
			break;
		}
}
