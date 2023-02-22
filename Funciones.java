import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Funciones {

	public static double leerDouble(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
		
	}
	
	public static int leerInt(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	public static String leerString(String mensaje) {
        String dato = (JOptionPane.showInputDialog(mensaje));
        return dato;
        }
	
	
	public static String[][] llenarMatrizStr(int dato, int dato1){
		String [][] matriz = new String[dato][dato1];
		
		for(int i = 0 ; i<dato ; i++) {
			for(int j = 0 ; j<matriz[i].length ; j++) {
				String pal = leerString("Ingrese la palabra que estará en la posición " + "[" + i + j +"]" + "de la Matriz: ");
				matriz[i][j] = pal;
			}
		}
		return matriz;
	}
	
	
	public static int[][] llenarMatrizInt(int dato, int dato1){
		int [][] matriz = new int[dato][dato1];
		
		for(int i = 0 ; i<dato ; i++) {
			for(int j = 0 ; j<matriz[i].length ; j++) {
				int num = Funciones.leerInt("Ingrese el número que estará en la posición " + "[" + i + j +"]" + "de la Matriz: ");
				matriz[i][j] = num;
			}
		}
		return matriz;
	}
	public static ArrayList<Integer> leerArraInt(int n){
		ArrayList<Integer> miA = new ArrayList<>();
		for(int i = 0 ; i<n; i++) {
			int dato = Funciones.leerInt("Ingrese el dato de la posición " + i + " del vector: ");
			miA.add(dato);
		}
		return miA;
		
		
		
	}
	public static ArrayList<String> leerArrayStr(int n){
		ArrayList<String> miA = new ArrayList<>();
		for(int i = 0 ; i<n; i++) {
			String dato = leerString("Ingrese el dato de la posición " + i + " del vector: ");
			miA.add(dato);
		}
		return miA;
		
		
		
	}
	public static boolean verificarContenido(ArrayList<Integer> miA, int dato) {
		boolean cent = false;
		for(int i = 0 ; i<miA.size() ; i++) {
			int num = miA.get(i);
			if(num==dato) {
				cent =true;
			}
		}
		return cent;
	}
	public static int contarOcurrencias(int [][] matriz, int dato) {
		int num, cont = 0;
		for(int i =0 ; i< matriz.length; i++){
			for(int j= 0; j<matriz[i].length; j++) {
				num = matriz[i][j];
				if(num==dato) {
					cont++;
				}
			}
		}
		return cont;
	}
	

	
	
	
	
	public static void imprimir(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
		
	}
	public static void imprimirMatriz(String [][] matriz){
		for(int i =0 ; i< matriz.length; i++){
			for(int j= 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		
		}
              
	}
	public static void imprimirMatrizInt(int [][] matriz){
		for(int i =0 ; i< matriz.length; i++){
			for(int j= 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		
		}
	}
	public static void imprimirMatrizInt2(int[][] matriz) {
		String msj = "";
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j= 0 ; j<matriz[i].length ; j++) {
				msj+= matriz[i][j];
				msj+= "     ";
			}
			msj+= "\n";
		}
		Funciones.imprimir(msj);
	}
	public static void imprimirArrayList(ArrayList<Integer> miA) {
		String msj= "[";
		for(int i = 0 ; i< miA.size() ;  i++) {
			int dato = miA.get(i);
			msj+=  dato;
			if(i+1<miA.size()) {
				msj+= ", ";
			}
			
		}
		msj+= "]";
		Funciones.imprimir(msj);
	}
}