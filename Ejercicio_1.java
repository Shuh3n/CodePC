import java.util.ArrayList;
import java.util.Collections;
/* Hacer funcion burbujar, esto para ordenar los arrays que salen de las uniones, intersecciones 
 * y diferencias simetricas.*/

import javax.swing.JOptionPane;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		int num = leerInt("Ingrese el cardinal del conjunto A: ");
		ArrayList<Integer> A = crearConjunto(num);
		int num2 = leerInt("Ingrese el cardinal del conjunto B: ");
		ArrayList<Integer> B = crearConjunto(num2);

		System.out.println("Los conjuntos ingresados son: ");

		imprimir("El conjunto A es:    " + A + "\n" + "\nEl conjunto B es:    " + B);



		ArrayList<Integer> union = calcularUnion(A, B);
		ArrayList<Integer> interseccion = calcularInterseccion(A, B);
		ArrayList<Integer> diferencia = calcularDiferenciaSi(A, B);

		imprimir("La union entre los conjuntos es: " + union + "\nLa intersección entre los conjuntos es: " + interseccion 
		+ "\nLa diferencia simetrica entre los conjuntos es: " + diferencia);

	}

	public static ArrayList<Integer> crearConjunto(int num){
		ArrayList<Integer> conjunto = new ArrayList<>();
		
		for(int i = 0 ; i<num ; i++) {
			int numero = leerInt("Ingrese el número que estará en la posición " + (i+1) + " :");
			conjunto.add(numero);

		}
		Collections.sort(conjunto);

		return conjunto;

}
	public static ArrayList<Integer> calcularUnion(ArrayList<Integer> A, ArrayList<Integer> B){
		ArrayList<Integer> conjunto = new ArrayList<>();
	
			for(int i = 0 ; i < A.size() ; i++ ){
				int numero = A.get(i);
				if(verificarContenencia(numero, conjunto)==false){
					conjunto.add(numero);

				}
			}
			for(int j = 0 ; j < B.size() ; j++ ){
				int num2 = B.get(j);
				if(verificarContenencia(num2, conjunto)==false){
					conjunto.add(num2);

				}
			}
		Collections.sort(conjunto);	
		return conjunto;
		}

	public static ArrayList<Integer> calcularInterseccion(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> conjunto = new ArrayList<>();
		
		for(int i = 0 ; i < A.size() ; i++ ){
			int num = A.get(i);
			if(B.indexOf(num)!= -1){
				conjunto.add(num);
			}
			
		}
		return conjunto;
		}
	
	public static ArrayList<Integer> calcularDiferenciaSi(ArrayList<Integer> A, ArrayList<Integer> B){
		ArrayList<Integer> union = calcularUnion(A, B);
		ArrayList<Integer> interseccion = calcularInterseccion(A, B);


		for(int i = 0 ; i < interseccion.size() ; i++){
			int num = interseccion.get(i);
			int num1 =union.indexOf(num);
			union.remove(num1);
		}

		Collections.sort(union);

		return union;

	}


	public static int leerInt(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	
	public static void imprimir(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	
	public static boolean verificarContenencia(int num, ArrayList<Integer> con) {
		boolean cent = false;
		if(con.indexOf(num)!=-1) {
			cent = true;
			
		}
		return cent;
		
}



		
}

	