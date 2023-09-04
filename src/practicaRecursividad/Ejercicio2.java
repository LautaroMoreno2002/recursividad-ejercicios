package practicaRecursividad;

public class Ejercicio2 {
	
	/* Escribir un algoritmo recursivo del método toString para 
	 una lista de enteros. */
	
	public static void toStringRecursivo(String s) {
		if (s.length()!=0){
			System.out.print(s.charAt(0));
			toStringRecursivo(s.substring(1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toStringRecursivo("Hola Mundo");
	}

}
