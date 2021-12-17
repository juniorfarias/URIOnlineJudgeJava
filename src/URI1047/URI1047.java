// Author: @juniorfarias
/*
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
 *
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

 * Entrada
 * Quatro números inteiros representando a hora de início e fim do jogo.

 * Saída
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */
package URI1047;
import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valuesInput = input.nextLine();
		String[] values = valuesInput.split(" ");
		final int minutesADay = 1440;
		int hourInitial = Integer.parseInt(values[0]);
		int minuteInitial = Integer.parseInt(values[1]);
		int hourFinal = Integer.parseInt(values[2]);
		int minuteFinal = Integer.parseInt(values[3]);
		int hoursGameTime;
		int restGameTime;
		int gameTime = ((hourFinal*60) + minuteFinal) - ((hourInitial*60) + minuteInitial);
		if(gameTime > 0) {
			if(gameTime>=60) {
				hoursGameTime = (int)(gameTime / 60);
				restGameTime = gameTime - hoursGameTime * 60;				
			} else {
				hoursGameTime = 0;
				restGameTime = gameTime;
			}
		} else if(gameTime < 0) {
			gameTime = minutesADay + gameTime;
			hoursGameTime = (int)(gameTime / 60);
			restGameTime = gameTime - hoursGameTime * 60;				
		} else {
			hoursGameTime = 24;
			restGameTime = 0;
		}
		
		System.out.println("O JOGO DUROU " + hoursGameTime + " HORA(S) E "+ restGameTime + " MINUTO(S)");
	}
}