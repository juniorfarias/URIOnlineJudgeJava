// Author: @juniorfarias

package URI1043;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		String valuesConcat = input.nextLine();
		String[] values = valuesConcat.split(" ");
		
		double A = Double.parseDouble(values[0]);
		double B = Double.parseDouble(values[1]);
		double C = Double.parseDouble(values[2]);
		double calc;
		if(A+B > C && C+B > A && C+A > B) {
			calc = A+B+C;
			System.out.println("Perimetro = " + format.format(calc));
		} else {
			calc = ((A+B)*C)/2;
			System.out.println("Area = " + format.format(calc));
		}
		
	}

}
