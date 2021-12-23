package URI1051;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");
		double salarioTotal = input.nextDouble();
		double salarioResto, valorFaixa2, valorFaixa3, valorFaixa4;
		if(salarioTotal>2000) {
			salarioResto = salarioTotal - 2000;
			if(salarioResto>1000) {
				valorFaixa2 = 1000;
				salarioResto = salarioResto - 1000;
				if(salarioResto>1500) {
					valorFaixa3 = 1500;
					salarioResto = salarioResto - 1500;
					if(salarioResto>0) {	
						valorFaixa4 = salarioResto * 0.28 + valorFaixa3 * 0.18 + valorFaixa2 * 0.08;
						System.out.println("R$ " + format.format(valorFaixa4));
					}
				} else {
					valorFaixa3 = salarioResto * 0.18 + valorFaixa2 * 0.08;
					System.out.println("R$ " + format.format(valorFaixa3));
				}
			} else {
				valorFaixa2 = salarioResto*0.08;
				System.out.println("R$ " + format.format(valorFaixa2));
			}
		} else {
			System.out.println("Isento");
		}
		input.close();
	}

}
