import java.util.Scanner;

public class Paulista {

	public static void main(String[] args) {
		
		   	Scanner leia = new Scanner(System.in);
				String times[] = { "COR", "PAL", "SAN", "SP" };
				int pontos[][] = new int[4][4];
				int linha, coluna;
				char resultado[];

				for (linha = 0; linha < 4; linha++) 
				{
					for (coluna = 0; coluna < 4; coluna++) 
					{
						System.out.printf("\n O time %s ganhou, empatou ou perdeu? ", times[coluna]);
						resultado[coluna] = leia.next().toUpperCase().charAt(0);
						if (resultado[linha] == 'G') {
							pontos[] = (pontos[coluna] + 3);
						} else if (resultado[coluna] == 'E') {
							pontos[]++;
						} else if (resultado[coluna] == 'P') {
							pontos[] = pontos[coluna] + 0;
						} else {
							System.out.print("\nResposta inválida.");
						}
					}
				}
				
				for (linha = 0 ; linha<4;linha++)
				{
					System.out.printf(times[linha]+"\t");
				}

			}

		}

		// TODO Auto-generated method stub

	}

}
