	
	public class Teste {
		public static void main(String args []) {
			Scanner leia = new Scanner(System.in);
			int produtoSelecionado = 0;
			int qtdeConsumir;
			//private int codigosProdutos[] = new int[10];
			ArrayList <Integer> codigoProdutos = new ArrayList<Integer>();
			//
			//private int produtosEstoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
			ArrayList <Integer> produtosEstoque = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
			//private String nomeProdutos[] = {"Leite", "Cereal", "Arroz", "Atum", "Feij�o", "Azeite", "Oleo", "Sab�o", "Sal", "A�ucar"};
			 ArrayList <String> nomeProdutos = new ArrayList<String>(Arrays.asList("Leite", "Cereal", "Arroz", "Atum", "Feij�o", "Azeite", "Oleo", "Sab�o", "Sal", "A�ucar"));
			//private double valorProdutos[] = {4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29};
			ArrayList <Double> valorProdutos = new ArrayList<Double>(Arrays.asList(4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29));
			ArrayList <Double> totalComprasCar = new ArrayList<Double>();
			boolean loop = true;
			boolean comprando = true;
			char resposta;
			int pagamento;
			double desconto = 0;
			double juros = 0;
			double tributos = 0;
			char respostaFinal;
			boolean on = true;
			double valorParcelado = 0;
			//IDEIA - Criar um historico de compras.
			//Inst�ncias:
			Estoque armazem = new Estoque(codigoProdutos, produtosEstoque, nomeProdutos, valorProdutos);
			while(on) {
				double valorTotal = 0;
				//double valorComImposto = 0; -> O valor de etique dos produtos ja contem imposto.
				totalComprasCar.clear();
				armazem.precoCarrinho.clear();
				armazem.qtdeCarrinho.clear();
				armazem.itensCarrinho.clear();
				while(comprando) {
					fachada();
					for(int x = 0; x < 10; x++) {
						codigoProdutos.add(x + 1);
						System.out.printf("%d\t\t%s\t\t     %d\t\t\t  R$%.2f\n", armazem.codigoProdutos.get(x), armazem.nomeProdutos.get(x), armazem.produtosEstoque.get(x), armazem.valorProdutos.get(x));
					}
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println();
					System.out.println();
					while(loop) {
						System.out.print("Ol�! Digite o c�digo do produto desejado: ");
						produtoSelecionado = leia.nextInt();
						if(produtoSelecionado <= 0 || produtoSelecionado > 10)
						{
							System.out.println("C�digo invalido!! Por favor insira o c�digo novamente.");
						} else if (armazem.itensCarrinho.contains(nomeProdutos.get(produtoSelecionado - 1))){
							System.out.println("Produto j� existe no carrinho.");
						} else {
							break;
						}
					}
					while(true)
					{
						System.out.print("Insira a quantidade desejada do produto: ");
						qtdeConsumir = leia.nextInt();
						if (qtdeConsumir <= armazem.produtosEstoque.get(produtoSelecionado - 1)) {//if(qtdeConsumir <= produtosEstoque[produtoSelecionado - 1])
							armazem.consumirProdutos(produtoSelecionado, qtdeConsumir);
							break;
						}
						else
						{
							System.out.println("Quantidade indispon�vel em estoque, digite novamente...");
						}
					}
					System.out.print("Deseja continuar sua compra? [S/N] ");
					resposta = leia.next().toUpperCase().charAt(0);
					if (resposta == 'S') {
						System.out.println("Boas compras :D");
					} else if (resposta == 'N' ) {
						break;
					}
				}
				System.out.println("\nPRODUTOS NO CARRINHO: ");
				System.out.println("Nome \t Qtde. no carrinho \t\t Pre�o unit.(R$) \t\t Pre�o Total (R$)");
				for(int cont = 0; cont < armazem.qtdeCarrinho.size(); cont++) {
					totalComprasCar.add(armazem.precoCarrinho.get(cont) * armazem.qtdeCarrinho.get(cont));
					System.out.printf("%s \t\t %d \t\t\t\t %.2f \t\t\t\t %.2f\n", armazem.itensCarrinho.get(cont), armazem.qtdeCarrinho.get(cont), armazem.precoCarrinho.get(cont), totalComprasCar.get(cont));
				}
				for (double precoIndividual : totalComprasCar) {
					//valorTotal += precoIndividual;
					valorTotal = valorTotal + precoIndividual;
				}
				FormasPagamento pay = new FormasPagamento(valorTotal);
				//valorComImposto = (valorTotal + (valorTotal * 0.09));  -> Ja embutido nos precos da etiqueta
				System.out.printf("\nO valor total da compra com Imposto de 9%%: R$: %.2f", valorTotal);
				System.out.println("\nOp��es de Pagamento: ");
				System.out.println("\n\t[1]� vista em dinheiro ou cheque, recebe 20% de desconto. \n\t[2]� vista no cart�o de cr�dito, recebe 15% de desconto, \n\t[3]Em duas vezes, pre�o normal de etiqueta sem juros, \n\t[4]Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%\n");
				while(true) {
					System.out.print("\nQual seria a forma de pagamento?");
					pagamento = leia.nextInt();
					if(pagamento == 1) {
						pay.pagamentoAvistaDinheiro();
						//valorComImposto = valorComImposto - (valorComImposto * 0.20);
						//desconto = (valorComImposto * 0.20);
						System.out.printf("Valor total da compra com um desconto de 20%%(R$%.2f): R$ %.2f\n", pay.getDesconto(), pay.getValorFinal());
						break;
					}else if(pagamento == 2) {
						pay.pagamentoAvistaCartao();
						//valorComImposto = valorComImposto - (valorComImposto * 0.15);
						//desconto = (valorComImposto * 0.15);
						//System.out.printf("Valor total da compra com desconto �: R$ %.2f", valorComImposto);
						break;
					}else if (pagamento == 3) {
						pay.pagamentoCartao2x();
						valorParcelado = valorTotal / 2;
						//System.out.printf("Valor de cada uma das 2 parcelas: R$ %.2f ", valorParcelado);
						break;
					} else if (pagamento == 4) {
						//pay.pagamentoCartao3x();
						juros = valorTotal * 0.10;
						valorTotal += juros;
						valorParcelado = valorTotal / 3;
						System.out.printf("Valor de cada uma das 3 parcela �: R$ %.2f ", valorParcelado);
						break;
					}
					else
						System.out.println("Op��o inv�lida. Tente novamente");
				}
				for(int x = 0;x <= 100; x++) {
					System.out.println();
				}
				tributos = valorTotal * .09;
				System.out.println("GENERATIONS STORE");
				System.out.println("Rua do B�bo, n�0 - Mercadinho - LTDA");
				System.out.println("CNPJ: 1234554321-00");
				System.out.println("\n\n\t\t\t\t\tNOTA FISCAL");
				System.out.println("=============================================================================================");
				System.out.println("\nPRODUTO\t\tQTND. PRODUTOS\t\tPRE�O UNIT.\t\t  PRE�O TOTAL\n");
				for(int x = 0; x < armazem.qtdeCarrinho.size(); x++) {
					System.out.printf("%s\t\t    %d\t\t\t  R$%.2f\t\t    R$%.2f\n", armazem.itensCarrinho.get(x), armazem.qtdeCarrinho.get(x), armazem.precoCarrinho.get(x), totalComprasCar.get(x));
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				}
				System.out.println("\n\n");
				if (pagamento == 1 || pagamento == 2) {
					System.out.printf("DESCONTO NA COMPRA: R$%.2f\n", desconto);
					System.out.printf("VALOR TOTAL A SER PAGO:R$%.2f\n", valorTotal);
				}else if(pagamento == 3) {
					System.out.printf("VALOR PRA CADA UMA DAS 2 PARCELAS: R$%.2f\n", valorParcelado);
					System.out.printf("VALOR TOTAL: R$%.2f\n", valorTotal);
				}
				else if (pagamento == 4) {
					System.out.printf("JUROS COBRADO: R$%.2f\n", juros);
					System.out.printf("VALOR TOTAL: R$%.2f\n", valorTotal);
					System.out.printf("VALOR PRA CADA UMA DAS 3 PARCELAS: R$%.2f\n", valorParcelado);
				}
				System.out.printf("VALOR TRIBUT�RIO: R$%.2f\n", tributos);
				while(true) {
					System.out.print("\nEfetuar nova compra? [S/N]");
					respostaFinal = leia.next().toUpperCase().charAt(0);
					if (respostaFinal == 'S') {
						for(int x = 0; x <= 30; x++) 
							System.out.println();
						break;
					} else if (respostaFinal == 'N') {
						System.out.print("\n\n\n\n\n\nObrigado pela prefer�ncia. Volte sempre! :D");
						on = false;
						break;
					} else {
						System.out.println("Resposta inv�lida!");
					}
				}
			}
			/*for(String itens : armazem.nomeProdutos) {
				System.out.println(itens);
			}
			armazem.consumirProdutos(5, 7);
			for(Integer itens : armazem.produtosEstoque) {
				System.out.println(itens);
			}*/
		}
		public static void fachada() {
			System.out.println("\t\t\tGENERATIONS STORE");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("\nC�DIGO\t\tPRODUTO\t\tQTND. PRODUTOS\t\tPRE�O UNIT.\t\t\n");
		}
	}

}
