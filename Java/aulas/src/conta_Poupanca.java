import java.util.Scanner;
public class conta_Poupanca {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		int limite = 10;
		char operacao ;
		int numeroConta = 0001;
		boolean novoUsuario = true;
		while(novoUsuario = true) {
		String cpf = "00000000-00";
		int movimento[] = new int[limite];
		String tipoMovimentacao[] = new String[limite];
		double credito;
		double debito;
		String fatura[] = new String[limite];
		System.out.println("Entre com o tipo de conta :\n - 1(Poupança)\n - 2(Corrente)\n - 3(Especial)\n - 4(Empresarial)");
		numeroConta = leia.nextInt();
		if(numeroConta == 1) {
			double saldo = 0.0;
			System.out.println("CONTA: "+numeroConta+" CPF:"+cpf);
			System.out.println("SALDO: R$"+saldo);
			
			for(int x = 0; x < limite; x++) {
				System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'C' ) {
						
						System.out.println("Entre com o valor de CREDITO:(operação: "+(movimento[x] +1)+" de 10)");
						saldo=0.0;
						credito = leia.nextDouble();
						saldo = saldo + credito;
						fatura[x] = "R$"+ saldo + " - CREDITO";
						System.out.println("SALDO: R$"+saldo);
				} else if(operacao == 'D') {
						System.out.println("Entre com o valor de DEBITO:(operação: "+(movimento[x] +1)+" de 10)");
						debito = leia.nextDouble();
						saldo = saldo - debito;
						fatura[x] = "R$"+ debito + " - DEBITO";
						if(saldo == 0) {
							System.out.println("SALDO: R$"+saldo);
						}
						if(saldo < 0) {
							saldo = debito + saldo;
						    System.out.println("Saldo insuficiente");
								}
				}else {			
					break;
				}
				System.out.println("Deseja realizar uma nova operação ? (S - Sim / N - Não)");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'S') {

				} else {
					System.out.println("É o aniversario da conta ? (S / N)");
					operacao = leia.next().toUpperCase().charAt(0);
					if (operacao == 'S') {
						saldo = saldo + (saldo * 0.05);
					}
					System.out.println("\t\tFATURA\n");
					for( x = 0; x<limite; x++) {
						if(fatura[x] == null) {
							break;
						}
						System.out.println("Movimentação "+(x+1)+": "+fatura[x]);
						System.out.println("------------------------------------------");
						
					}
					System.out.println("\nSALDO: "+saldo);
					break;
				}
			}
		}
	}
	}
}
