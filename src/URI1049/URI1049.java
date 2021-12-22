// Author: @juniorfarias

package URI1049;
import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String filo = input.next();
		String classe = input.next();
		String ordem = input.next();
		
		String animal = "";
		if(filo.equals("vertebrado") && classe.equals("ave") && ordem.equals("carnivoro")) {
			animal = "aguia";
		}
		if(filo.equals("vertebrado") && classe.equals("ave") && ordem.equals("onivoro")) {
			animal = "pomba";
		}
		if(filo.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("onivoro")) {
			animal = "homem";			
		}
		if(filo.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("herbivoro")) {
			animal = "vaca";
		}
		if(filo.equals("invertebrado") && classe.equals("inseto") && ordem.equals("hematofago")) {
			animal = "pulga";
		}
		if(filo.equals("invertebrado") && classe.equals("inseto") && ordem.equals("herbivoro")) {
			animal = "lagarta";
		}
		if(filo.equals("invertebrado") && classe.equals("anelideo") && ordem.equals("hematofago")) {
			animal = "sanguessuga";
		}
		if(filo.equals("invertebrado") && classe.equals("anelideo") && ordem.equals("onivoro")) {
			animal = "minhoca";
		}
		
		System.out.println(animal);
		
		input.close();
	}

}
