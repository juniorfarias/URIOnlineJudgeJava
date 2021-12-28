package URI1065;

import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int qtdPares = 0;
		for(int i = 0; i < 5;i++) {
			int num = input.nextInt();
			if(num%2==0) {
				qtdPares++;
			}
		}
		input.close();
		System.out.println(qtdPares + " valores pares");
	}

}
