import java.util.Scanner;

public class baseTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double base;
		double altura;
		double area;

		Scanner leia = new Scanner(System.in);
			System.out.println("Digite o valor da Base");
			base = leia.nextDouble();
			System.out.println("Digite o valor da Altura");
			altura = leia.nextDouble();
			area = (base * altura)/2;
			System.out.println("A área do triangulo é " + area);
		}

		}

