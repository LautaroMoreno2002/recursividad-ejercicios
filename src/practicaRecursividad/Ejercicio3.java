package practicaRecursividad;

public class Ejercicio3 {

	/* 3) Hacer un programa que devuelva verdadero si dos listas son iguales. 
	Sobrescribir el metodo equals de Java. 
	Ejemplo:
	{6, 2, 9, 4}, {6, 2, 9, 4} −→ True
	{6, 2, 9, 4}, {4, 9, 2, 6} −→ False */
	
	public static boolean listasIguales(int[] arr1, int[] arr2, int indice) {
		if (arr1.length == 0 || arr2.length == 0) return false;
		if (indice == arr1.length && indice == arr2.length) return true;
		return (arr1[indice] == arr2[indice]) && listasIguales(arr1,arr2,++indice);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {6, 2, 9, 4};
		int[] arr2 = {4, 9, 2, 6};
		System.out.println(listasIguales(arr1, arr2, 0));
	}

}
