package Lista1;
import java.util.Scanner;
public class Exercicio5 {
	
	//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	// Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	
	public static void main(String[] args) {

	       Scanner leia = new Scanner(System.in);

	       System.out.println("Digite a primeira nota: \n");

	       double nota1 = leia.nextDouble();

	       System.out.println("Digite a segunda nota: \n");

	       double nota2 = leia.nextDouble();

	       System.out.println("Digite a terceira nota: \n");

	       double nota3 = leia.nextDouble();

	       double media = (nota1+nota2+nota3)/3;

	       System.out.println(media);    

	   }  


}
