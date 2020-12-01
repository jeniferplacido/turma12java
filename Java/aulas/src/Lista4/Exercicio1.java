package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	
	
	
	public static void main(String[] args) {
		
			int somaTotal = 0, somaDiagonal = 0;

			Scanner entrada = new Scanner(System.in);
			
			int matrix[][] = new int[3][3];
			
			System.out.println("Alimentação da Matriz");
			
			for(int column = 0; column < 3; column++) {
				for(int line = 0; line < 3; line++) {
					System.out.printf("Um valor para a matriz na posição [%d][%d]: ", line, column);
					matrix[line][column] = entrada.nextInt();
					somaTotal += matrix[line][column];
					if (line == column) {
						somaDiagonal += matrix[line][column];
					}
				}
			}System.out.println("Soma de todos os valores: " + somaTotal);
			System.out.println("Soma dos valores na diagonal principal: " + somaDiagonal);
		}
	}



