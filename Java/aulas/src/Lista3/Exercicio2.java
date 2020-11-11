package Lista3;

import java.util.Scanner;



public class Exercicio2 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in); 
	
	int numero;
	System.out.println("Digite um número: ");
    numero = leia.nextInt();
    
    while(numero <= 100)
    {
    	System.out.printf(" %d ,", numero);
    	numero = numero * 3;
    	
    }
    System.out.print(numero);
}

}




