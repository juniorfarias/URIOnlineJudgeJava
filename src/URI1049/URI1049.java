// Author: @juniorfarias

package URI1049;
import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filo = input.next();;
		String classe = input.next();
		String ordem = input.next();
		
		if(filo == "vertebrado") {
			if(classe == "ave") {
				if(ordem == "canivoro") System.out.println("aguia");
				else System.out.println("pomba");	
			} else {
				if(classe == "mamifero") {
					if(ordem == "onivoro") System.out.println("homem");
					else System.out.println("vaca");	
				}
			}
		} else {
			if(classe == "inseto") {
				if(ordem == "hematofago") System.out.println("pulga");
				else System.out.println("lagarta");	
			} else {
				if(classe == "anelideo") {
					if(ordem == "hematofago") System.out.println("sanguessuga");
					else System.out.println("minhoca");	
				}
			}
		}
		
		

	}

}
