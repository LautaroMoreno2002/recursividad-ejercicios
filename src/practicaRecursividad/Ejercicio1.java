package practicaRecursividad;

import java.util.ArrayList;

public class Ejercicio1 {
	// En Vectores
	// 1)
	public static int sumaElementos(ArrayList<Integer> arr) {
		if (arr.size()==0) return 0;
		else {
			int dato = arr.get(0);
			arr.remove(0);
			return dato + sumaElementos(arr);
		}
	}
	public static int sumaElementos(int[] arr, int id) {
		if (id == arr.length) return 0;
		else return arr[id++] + sumaElementos(arr,id); 
	}
	// 2)
	public static int minimoElemento(int[] arr,int id) {
		if (id < arr.length-1) return minimo(arr[id],minimoElemento(arr,++id));
		else return arr[arr.length-1];
	}
	private static int minimo(int val1, int val2) {
		return (val1 < val2) ? val1 : val2; 
	}
	// 3)
	public static void invertirArreglo(int[] arr, int inicio, int fin) {
		if (inicio < fin) {
			int aux = arr[inicio];
			arr[inicio] = arr[fin];
			arr[fin] = aux;
			invertirArreglo(arr, ++inicio, --fin);
		}
	}
	// En Strings
	// 1)
	public static int cantidadApariciones(String s,char c) {
		if (s.length() == 0) return 0;
		if (s.charAt(0)==c) return 1 + cantidadApariciones(s.substring(1), c);
		return cantidadApariciones(s.substring(1), c);
	}
	// 2)
	public static boolean ordenLexicografico(String s) {
		if (s.length()==0) return false;
		if (s.length()==1) return true;
		return (s.charAt(0)<s.charAt(1)) && ordenLexicografico(s.substring(1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,4,9,8,7,-21};
		ArrayList <Integer> arregloEnteros = new ArrayList <Integer>();
		for (int i = 1; i <= 7; i++) {
			arregloEnteros.add(i);
		}
		System.out.println(sumaElementos(arregloEnteros));
		System.out.println(sumaElementos(arr,0));
		System.out.println(minimoElemento(arr,0));
		invertirArreglo(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(cantidadApariciones("Hola Lautaro Moreno", 'o'));
		System.out.println(ordenLexicografico("abcdefh"));
	}

}
