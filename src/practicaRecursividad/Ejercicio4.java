package practicaRecursividad;

public class Ejercicio4 {

	/*Hacer un programa que devuelva verdadero si una lista de enteros es palíndromo 
	 * (Se lee igual de izquierda a derecha)
	Ejemplo:
	{} −→ True (7)
	{1, 26, 73, 26, 1} −→ True
	{26, 8, 8, 1} −→ False*/
	
	public static boolean arregloPalindromo(int[] arr,int inicio,int fin) {
		if (arr.length == 0) return true;
		if (inicio==fin) return true;
		return (arr[inicio] == arr[fin]) && arregloPalindromo(arr, ++inicio, --fin) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 26, 73, 26, 1};
		int[] arr2 = {26, 8, 8, 1};
		int[] arr3 = {};
		System.out.println(arregloPalindromo(arr, 0, arr.length-1));
		System.out.println(arregloPalindromo(arr2, 0, arr2.length-1));
		System.out.println(arregloPalindromo(arr3, 0, arr3.length-1));
	}

}
