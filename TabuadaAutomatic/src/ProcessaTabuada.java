public class ProcessaTabuada {

	public static void main(String[] args) {

		for(int tabuada=1; tabuada<=9; tabuada++) {
			System.out.println("Tabuada de " + tabuada);
			System.out.println(" ");
		
			for(int contador=1; contador<=12; contador++) {
				int res = tabuada * contador;
				System.out.println(tabuada + " * " + contador + " = " + res);
			}
			System.out.println(" ");
	}
}
}

