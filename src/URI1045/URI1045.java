// Author: @juniorfarias

package URI1045;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valuesConcat = input.nextLine();
		String[] values = valuesConcat.split(" ");
		double aux;
		double A = Double.parseDouble(values[0]);
		double B = Double.parseDouble(values[1]);
		double C = Double.parseDouble(values[2]);
		
		if(A < B && B < C) {
			aux = A;
			A = C;
			C = aux;
		} else if(A < B && B > C) {
			aux = A;
			A = B;
			B = aux;
			if(A > B && B < C) {
				aux = B;
				B = C;
				C = aux;
			}
		} else if(A > B && B < C) {
			aux = B;
			B = C;
			C = aux;
			if(A < B && B > C) {
				aux = A;
				A = B;
				B = aux;
			} 
		} else if((A==B && B<C) || (A<B && B==C)){
			aux = A;
			A = C;
			C = aux;
		}
		if(A >= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if(A * A == (B * B) + (C * C)) System.out.println("TRIANGULO RETANGULO");
			if(A * A > (B * B) + (C * C)) System.out.println("TRIANGULO OBTUSANGULO");
			if(A*A < (B * B) + (C * C)) System.out.println("TRIANGULO ACUTANGULO");
			if(A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
			if((A == B && B != C) || (A == C && C != B) || (B == C && A != B)) System.out.println("TRIANGULO ISOSCELES");	
		}
		
	}
}
