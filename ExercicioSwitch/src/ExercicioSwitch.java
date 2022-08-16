import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int ddd = teclado.nextInt();
		switch(ddd) {
		case 1:
			System.out.println("Brasillia");
			break;
		case 2:
			System.out.println("São Paulo");
			break;
		case 3:
			System.out.println("Salvador");
			break;
		case 4:
			System.out.println("Rio de Janeiro");
			break;
		case 5:
			System.out.println("Juiz de Fora");
			break;
		case 6:
			System.out.println("Campinas");
			break;
		case 7:
			System.out.println("Vitória");
			break;
		case 8:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD não cadastrado");

		}
				
		
		teclado.close();

	}

}
