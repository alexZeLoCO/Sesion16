import java.util.Scanner;
public class RecorridoDeVector {

	public static double [] LeeVector (Scanner teclado) {
		System.out.print("Introduzca el tama�o del vector: ");
		double [] vector = new double [teclado.nextInt()];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA �NIDCE NAPOLE�N VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int suma=0;		//SUMATORIO
		double [] vector = LeeVector(teclado);		//CREA VECTOR
		for (int i=0;i<vector.length-1;i++) {		//PARA TANTAS VECES COMO �NIDCE DE VECTOR MENOS 1
			if (vector[i]<vector[i+1] && vector[i]%7==0) {		//SI VALOR ES MENOR QUE SIGUIENTE VALOR Y ELEMENTO ES M�LTIPLO DE 7
				suma++;		//ACTUALIZAR SUMA
			}
		}
				//OUTPUT
		System.out.printf("El n�mero de elementos menores que el siguiente y m�ltiplos de 7 es: %d.", suma);
	}
}