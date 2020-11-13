package Lista5;

import java.util.Scanner;
public static void main(String[] args) {

public class Exercicio4 {
	Scanner leia = new Scanner(System.in);
	
	double x = 1.0;
	double y;
	double div = 0.0;
	double soma = 0.0;
	
	for (y=1.0; y<=50; y++) {
		div = x/y;
		soma = soma + div;
		
		x = x + 2;
		System.out.println("A SOMA DO TOTAL É: "+ soma + "\n");
		
	}
	
}

}

}
