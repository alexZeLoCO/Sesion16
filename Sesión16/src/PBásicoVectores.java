import java.util.Scanner;
public class PBásicoVectores {
	
	public static double[] LeeVector (Scanner teclado) {
		System.out.print("Introduzca el tamaño del vector: ");
		double [] vector = new double [teclado.nextInt()];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		double [] vector = LeeVector(teclado); 		//CREA Y ALMACENA VALORES EN VECTOR
	
		System.out.print("{");		//FORMATO
		for (int i=0;i<vector.length-1;i++) {		//PARA 5 VECES
			System.out.printf("%.2f - ",vector[i]);		//OUTPUT
		}
		System.out.print(vector[vector.length-1]);		//OUTPUT
		System.out.print("}\n");		//FORMATO
		
		double suma = 0;		//INICIALIZA SUMATORIO
		for (int i=0;i<vector.length;i++) {		//PARA 6 VECES
			suma = suma+vector[i];		//SUMAR ELEMENTOS
		}
		
		System.out.printf("La media es %.2f.", suma/vector.length);		//OUTPUT
	}
}
