package URI1066;

import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int qtdPositivos = 0;
		int qtdNegativos = 0;
		int qtdPares = 0;
		int qtdImpares = 0;
		for(int i = 0; i < 5; i++) {
			int num = input.nextInt();
			if(num>0) {
				qtdPositivos++;
			} else if(num<0) {
				qtdNegativos++;
			}
			if(num%2==0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
		}
		input.close();
		System.out.println(qtdPares + " valor(es) par(es)");
		System.out.println(qtdImpares + " valor(es) impar(es)");
		System.out.println(qtdPositivos + " valor(es) positivo(s)");
		System.out.println(qtdNegativos + " valor(es) negativo(s)");
	}

}
