import java.util.Scanner;

class MetodosOrdenamiento {
	
	int aux=0;
	
	
	
}


public class EjemploMetodosOrdenamiento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		MetodosOrdenamiento mo = new MetodosOrdenamiento();
		//int[] edades = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		
		int opcion=0;
		
		do {
			System.out.println("                         M E N Ú");
			System.out.println();
			System.out.println("1) Ordenamiento Burbuja.");
			System.out.println("2) Ordenamiento Por Selección.");
			System.out.println("3) Ordenamiento Por Inserción.");
			System.out.println("0) Salir.");
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			System.out.println("Elija una opción: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("\n");
					System.out.println("=========== ORDENAMIENTO CON BURBUJA 1 ===========\n");
					mo.ordenamientoBurbuja1(mo.vector1000().clone());
					mo.ordenamientoBurbuja1(mo.vector10000().clone());
					mo.ordenamientoBurbuja1(mo.vector100000().clone());
					mo.ordenamientoBurbuja1(mo.vector1000000().clone());
					//mo.ordenamientoBurbuja1(edades);
					
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
				
					System.out.println("=========== ORDENAMIENTO CON BURBUJA 2 ===========\n");
					mo.ordenamientoBurbuja2(mo.vector1000().clone());
					mo.ordenamientoBurbuja2(mo.vector10000().clone());
					mo.ordenamientoBurbuja2(mo.vector100000().clone());
					mo.ordenamientoBurbuja2(mo.vector1000000().clone());
					//mo.ordenamientoBurbuja2(edades);
					
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					
					System.out.println("=========== ORDENAMIENTO CON BURBUJA 3 ===========\n"); //ESTÁ MAL
					mo.ordenamientoBurbuja3(mo.vector1000().clone());
					mo.ordenamientoBurbuja3(mo.vector10000().clone());
					mo.ordenamientoBurbuja3(mo.vector100000().clone());
					mo.ordenamientoBurbuja3(mo.vector1000000().clone());
					//mo.ordenamientoBurbuja3(edades);
					
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					
					break;
				case 2:
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					
					System.out.println("=========== ORDENAMIENTO POR SELECCION ===========\n");
					mo.ordenamientoPorSeleccion(mo.vector1000().clone());
					mo.ordenamientoPorSeleccion(mo.vector10000().clone());
					mo.ordenamientoPorSeleccion(mo.vector100000().clone());
					mo.ordenamientoPorSeleccion(mo.vector1000000().clone());
					//mo.ordenamientoPorSeleccion(edades);

					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					
					break;
				case 3:
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					
					System.out.println("=========== ORDENAMIENTO POR INSERCION ===========\n");
					mo.ordenamientoPorInsercion(mo.vector1000().clone());
					mo.ordenamientoPorSeleccion(mo.vector10000().clone());
					mo.ordenamientoPorSeleccion(mo.vector100000().clone());
					mo.ordenamientoPorSeleccion(mo.vector1000000().clone());
					//mo.ordenamientoPorInsercion(edades);
					
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println();
					break;
				case 0:
					System.out.println("S A L I E N D O . . .");
					break;
			}
		
		}while(opcion != 0);
		
	}

}

