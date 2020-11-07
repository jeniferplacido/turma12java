
import java.util.Scanner;
public class Celsius {
	
	public static void main (String [] args) {
		
		double  celsius, farenheit;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextDouble();
			
		
		farenheit = (9* celsius + 160)/5;
		
		System.out.println("A temperatura em farenheit "+ farenheit);
		
	}
}












