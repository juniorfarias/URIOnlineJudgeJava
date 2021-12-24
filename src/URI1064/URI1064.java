package URI1064;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		float numeros[] = new float[6];
		int countPositivos = 0;
		float somaPositivos = 0;
		for (int i = 0; i < 6; i++) {
			float num = input.nextFloat();
			numeros[i] = num;
			if(num > 0) {
				countPositivos++;
				somaPositivos = somaPositivos + num;
			}
		}
		input.close();
		System.out.println(countPositivos + " valores positivos");
		System.out.println(format.format(somaPositivos/countPositivos));
	}

}
