package URI1061;

import java.util.Scanner;

public class URI1061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int diaEmSegundos = 86400;
		final int horaEmSegundos = 3600;
		
		Scanner input = new Scanner(System.in);
		String diaInicialInput = input.nextLine();
		String horaInicialInput = input.nextLine();
		String diaFinalInput = input.nextLine();
		String horaFinalInput = input.nextLine();
		input.close();
		
		String[] diaInicialSplit = diaInicialInput.split(" ");
		String[] horaInicialSplit = horaInicialInput.split(" ");
		String[] diaFinalSplit = diaFinalInput.split(" ");
		String[] horaFinalSplit = horaFinalInput.split(" ");
		
		int diaInicial = Integer.parseInt(diaInicialSplit[1]);
		int diaFinal = Integer.parseInt(diaFinalSplit[1]);
		int horaInicial = Integer.parseInt(horaInicialSplit[0]);
		int minutoInicial = Integer.parseInt(horaInicialSplit[2]);
		int segundoInicial = Integer.parseInt(horaInicialSplit[4]);
		int horaFinal = Integer.parseInt(horaFinalSplit[0]);
		int minutoFinal = Integer.parseInt(horaFinalSplit[2]);
		int segundoFinal = Integer.parseInt(horaFinalSplit[4]);
		
		int tempoTotalInicialSeg = diaInicial * diaEmSegundos + horaInicial * horaEmSegundos + minutoInicial * 60 + segundoInicial;
		int tempoTotalFinalSeg = diaFinal * diaEmSegundos + horaFinal * horaEmSegundos + minutoFinal * 60 + segundoFinal;
		int tempoDoEvento = tempoTotalFinalSeg - tempoTotalInicialSeg;
		
		int diasDeEvento = (int)(tempoDoEvento/diaEmSegundos);
		tempoDoEvento = tempoDoEvento - diasDeEvento * diaEmSegundos;
		int horaDeEvento = (int)(tempoDoEvento/horaEmSegundos);
		tempoDoEvento = tempoDoEvento - horaDeEvento * horaEmSegundos;
		int minutoDeEvento = (int)(tempoDoEvento/60);
		tempoDoEvento = tempoDoEvento - minutoDeEvento * 60;
		int segundoDeEvento = tempoDoEvento;
		
		System.out.println(diasDeEvento + " dia(s)");
		System.out.println(horaDeEvento + " hora(s)");
		System.out.println(minutoDeEvento + " minuto(s)");
		System.out.println(segundoDeEvento + " segundo(s)");
		
	}

}
