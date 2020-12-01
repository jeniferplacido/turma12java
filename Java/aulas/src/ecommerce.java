
import java.util.Scanner;
public class ecommerce{
	public static void main(String[]args) {
		
Scanner leia = new Scanner(System.in);
		
		//Variáveis:
		char resposta;
		int qtdeConsumir;
		int contador = 1;
		int produtoSelecionado;
		boolean comprando = true;
		boolean loop = true;
		double tributos;
		double desconto = 0;
		double juros = 0;
		int pagamento;
		boolean on = true;
		char respostaFinal;
		
		
		
		//Vetores:		
		int codigoProdutos[] = new int[10];
		int produtosEstoque[] = {10,10,10,10,10,10,10,10,10,10};
		
		
		
		
		while(on) {
			double valorTotal = 0;
			int Itens = 0;
			double valorImposto = 0;
			boolean alreadyCart[] = new boolean[10] ; //Vetor para identificar se um item já esta no carrinho.
			double totalComprasCar[] = new double [10];	
			double precoCarrinho[] = new double [10];
			int qtdeCarrinho[] = new int[10];
			String itensCarrinho[] = new String[10];
			
			
			String nomeProdutos[] = {"Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"};	
			double valorProdutos[] = {4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29};
			String especificacao[] = {"L", "Cx", "Kg", "Kg", "Pct", "L", "L", "Uni", "Kg", "Kg"};
			
			System.out.println("\t\t\tGENERATIONS STORE");
			System.out.println("==================================================================");
			System.out.println("\nCÓDIGO\t\tPRODUTO\t\tQTND. PRODUTOS\t\tPREÇO UNIT.\t\t\n");
			
			
			while(comprando)
			{
				for (int x = 0; x<10; x++)
				{
					codigoProdutos[x] = (x+1);
					System.out.printf("%d\t\t%s\t\t     %d\t\t\t  R$%.2f\n", codigoProdutos[x], nomeProdutos[x], produtosEstoque[x] , valorProdutos[x] );
					
					
				}
				
				System.out.println("\n==================================================================");
				
				
				produtoSelecionado = 0;
				while(loop) {
					System.out.print("Olá! Digite o código do produto desejado: ");
					produtoSelecionado = leia.nextInt();	
					
					if(produtoSelecionado < 0 || produtoSelecionado > 10)
					{
						System.out.println("Código invalido!! Por favor insira o código novamente.");
					} else if (alreadyCart[produtoSelecionado - 1]){
						System.out.println("Produto já existe no carrinho.");
					} else {
						break;
					}
				}
				
				while(true)
				{
				
					System.out.print("Insira a quantidade desejada do produto: ");
					qtdeConsumir = leia.nextInt();
					
					if(qtdeConsumir <= produtosEstoque[produtoSelecionado - 1])
					{
						System.out.printf("%d un. de %s adicionado com sucesso no carrinho !!\n", qtdeConsumir, nomeProdutos[produtoSelecionado - 1]);
						alreadyCart[produtoSelecionado - 1] = true;
						itensCarrinho[Itens] = nomeProdutos[produtoSelecionado - 1];
						qtdeCarrinho[Itens] = qtdeConsumir;
						precoCarrinho[Itens] = valorProdutos[produtoSelecionado - 1];
						produtosEstoque[produtoSelecionado -1] -= qtdeCarrinho[Itens];
						Itens++;
						
						
						break;
					}
					else
					{
						System.out.println("Quantidade indisponível em estoque, digite novamente...");
					}
				}
				System.out.print("Deseja continuar a sua compra? [S/N] ");
				resposta = leia.next().toUpperCase().charAt(0);
				if (resposta == 'S')
				{
					System.out.println("Boas compras!");
				} else if( resposta == 'N') {
					break;
				}
			}
			System.out.println("ITENS NO CARRINHO: ");
			System.out.println("Nome \t Qtde. no carrinho \t\t Preço unit.(R$) \t\t Preço Total (R$)");
			for(int cont = 0; cont < Itens; cont++) {
				
				
				totalComprasCar[cont] = precoCarrinho[cont]*qtdeCarrinho[cont];
				System.out.printf("%s \t\t %d \t\t\t\t %.2f \t\t\t\t %.2f\n", itensCarrinho[cont], qtdeCarrinho[cont], precoCarrinho[cont], totalComprasCar[cont]);
				
				
			}
			
			
			
			for(double precoIndividual : totalComprasCar) {
				valorTotal += precoIndividual;
			}
			valorImposto = (valorTotal + (valorTotal * 0.09));
			System.out.printf("\nO valor total da compra com Imposto de 9%%: R$: %.2f", valorImposto);
			
			
			
			System.out.println("\nOpções de Pagamento");
			System.out.println("\n[1]À vista em dinheiro ou cheque, recebe 20% de desconto. \n[2]À vista no cartão de crédito, recebe 15% de desconto, \n[3]Em duas vezes, preço normal de etiqueta sem juros, \n[4]Em três vezes, preço normal de etiqueta mais juros de 10%\n");
			
			
			
			while(true) {
				System.out.print("\nQual seria a forma de pagamento?");
				pagamento = leia.nextInt();
				if(pagamento == 1) {
					valorImposto = valorImposto - (valorImposto * 0.20);
					desconto = (valorImposto * 0.20);
					System.out.printf("Valor total da compra com desconto é: R$ %.2f", valorImposto);
					break;
				}else if(pagamento == 2) {
					valorImposto = valorImposto - (valorImposto * 0.15);
					desconto = (valorImposto * 0.15);
					System.out.printf("Valor total da compra com desconto é: R$ %.2f", valorImposto);
					break;
				}else if (pagamento == 3) {
					valorImposto = valorImposto / 2;
					System.out.printf("Valor de cada uma das 2 parcelas: R$ %.2f ", valorImposto);
					break;
				} else if (pagamento == 4) {
					valorImposto = (valorImposto / 3) + (valorImposto * 0.10) ;
					System.out.printf("Valor de cada uma das 3 parcela é: R$ %.2f ", valorImposto);
					juros = valorImposto * 0.10;
					break;
				}
				else
					System.out.println("Opção inválida. Tente novamente");
			}
			
			for(int x = 0;x <= 100; x++) {
				System.out.println();
			}
			
			tributos = valorImposto * .09;
			System.out.println("GENERATIONS STORE");
			System.out.println("Rua do Bôbo, nº0 - Mercadinho - LTDA");
			System.out.println("CNPJ: 1234554321-00");
			System.out.println("\n\n\t\t\t\t\tNOTA FISCAL");
			System.out.println("=============================================================================================");
			System.out.println("\nPRODUTO\t\tQTND. PRODUTOS\t\tPREÇO UNIT.\t\t  PREÇO TOTAL\n");
		
			for(int x=0; x < Itens; x++) {
				
				System.out.printf("%s\t\t    %d\t\t\t  R$%.2f\t\t    R$%.2f\n", itensCarrinho[x], qtdeCarrinho[x], precoCarrinho[x], totalComprasCar[x]);
				System.out.println("=============================================================================================");
			}
			System.out.println("\n\n");
			
			if (pagamento == 1 || pagamento == 2) {
				System.out.printf("DESCONTO NA COMPRA: R$%.2f\n", desconto);
				System.out.printf("VALOR TOTAL A SER PAGO:R$%.2f\n", valorImposto);
			}else if(pagamento == 3) {
				System.out.printf("VALOR PRA CADA UMA DAS 2 PARCELAS: R$%.2f\n", valorImposto);
			}
			else if (pagamento == 4) {
				System.out.printf("JUROS COBRADO: R$%.2f\n", juros);
				System.out.printf("VALOR PRA CADA UMA DAS 3 PARCELAS: R$%.2f\n", valorImposto);
			}
			System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n", tributos);
			
			while(true) {
				System.out.println("\nEfetuar nova compra? [S/N]");
				respostaFinal = leia.next().toUpperCase().charAt(0);
				if (respostaFinal == 'S') {
					for(int x = 0; x <= 30; x++)
						System.out.println();
					break;
				} else if (respostaFinal == 'N') {
					System.out.print("\n\n\n\n\n\nObrigado pela preferência. Volte sempre!");
					on = false;
					break;
				} else {
					System.out.println("Resposta inválida!");
				}
			}
			
		}
	}
}