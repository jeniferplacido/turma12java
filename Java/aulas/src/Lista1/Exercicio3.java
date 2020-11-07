package Lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		java.util.Scanner leia = new Scanner(System.in);
		
		int duracaoSegundos;
		int horas;
		int minutos;
		
		
		System.out.println("TEEMPO DE DURAÇÃO DO EVENTO EM SEGUNDOS");
		duracaoSegundos= leia.nextInt();
		
		
		horas = duracaoSegundos / 3600;
		minutos = (duracaoSegundos % 3600)/ 60;
		duracaoSegundos = ((duracaoSegundos% 3600)%3600);
		
		System.out.println("---------------");
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+duracaoSegundos);
		
		
		// TODO Auto-generated method stub

	}

}
