import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numeroConta;
		double saldo= 0.0;
		String cpf;
		int movimento;
		int limite = 10;
		char operacao;
		double credito;
		double debito;
		String aniversario;
		
		System.out.print("Entre com o número da conta:");
		numeroConta=leia.nextInt();
		
		System.out.print("Entre com o número da CPF:");
		cpf =leia.next();
		
		for(movimento = 0; movimento < limite; movimento++ ) {
			System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
			operacao = leia.next().toUpperCase().charAt(0);
			if(operacao == 'C' ) {
					System.out.println("Entre com o valor de deposito:  ");
					credito = leia.nextDouble();
					saldo = saldo + credito;
			} else if(operacao == 'D') {
					System.out.println("Entre com o valor de saque: ");
					debito = leia.nextDouble();
					saldo = saldo - debito;
			}
			
			System.out.print("É aniversário da conta?:");
			cpf =leia.next();
		}
		
		

		
	}

}
