import java.util.Scanner;

class MetodosOrdenamiento {
	
	int aux=0;
	
	public void ordenamientoBurbuja1(int[] numeros) {
		int contRecorrido=0, contComparaciones=0, contIntercambios=0;
		long tiempoFinal=0;
		
		//tiempo inicial
		long tiempoInicio = System.nanoTime();
		
		for(int i=2; i <= numeros.length; i++) {
			for(int j=0; j <= numeros.length-i; j++) {
				
				contComparaciones++;
				if(numeros[j] > numeros[j+1]) {
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
					contIntercambios++;
				}
				contRecorrido++;
			}
		}
		
		mostrarVector(numeros);
		//tiempo final
		tiempoFinal = System.nanoTime() - tiempoInicio;
		
		mostrarDatosEficiencia(contRecorrido, contComparaciones, contIntercambios, tiempoFinal);
		
	}
	
	public void ordenamientoBurbuja2(int[] numeros) {
		int contRecorrido2=0, contComparaciones2=0, contIntercambios2=0;
		long tiempoFinal=0;
		
		int i=1;
		boolean ordenado = false;
		
		long tiempoInicio = System.nanoTime();
		
		while( (i < numeros.length) && (ordenado == false)) {
			i=i+1;
			ordenado=true;
			for(int j=0; j <= numeros.length -i; j++) {
				contComparaciones2++;
				if(numeros[j] > numeros[j+1]) {
					ordenado = false;
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
					contIntercambios2++;
				}
				contRecorrido2++;
			}
		}
		mostrarVector(numeros);
		
		tiempoFinal = System.nanoTime() - tiempoInicio;
	
		mostrarDatosEficiencia(contRecorrido2, contComparaciones2, contIntercambios2, tiempoFinal);
	}
	
	public void ordenamientoBurbuja3(int[] numeros) {
		
		int contRecorrido3=0, contComparaciones3=0, contIntercambios3=0;
		long tiempoFinal=0;
		
		int i=1;
		boolean ordenado;
		
		long tiempoInicial = System.nanoTime();
		
		do {
			i=i+1;
			ordenado = true;
			
			for(int j=0; j <= numeros.length-i; j++) {
				contComparaciones3++;
				if(numeros[j] > numeros[j+1]) {
					contIntercambios3++;
					//ordenado = false;
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
				contRecorrido3++;
			}
		} while( (i < numeros.length) && (ordenado == true) );
		
		mostrarVector(numeros);
		
		tiempoFinal = System.nanoTime() - tiempoInicial;
		
		mostrarDatosEficiencia(contRecorrido3, contComparaciones3, contIntercambios3, tiempoFinal);
		
	}

	
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

