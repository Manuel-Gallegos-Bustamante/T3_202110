package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Leer datos de archivos y crear un Arreglo Din�mico.");
			System.out.println("2. Leer datos de archivos y crear una Lista Encadenada.");
			System.out.println("3. Obtener una muestra de los videos.");
			System.out.println("4. Ordenar por Insertion sort");
			System.out.println("5. Ordenar por Shell sort");
			System.out.println("6. Ordenar por Merge sort");
			System.out.println("7. Ordenar por Quick sort");
			System.out.println("8. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
			System.out.println(modelo.toString());
		}
		
}

