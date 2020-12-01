
public class ecommerce1 {
	
	package orientadoAobjetos;
	import java.util.ArrayList;
	import java.util.Arrays;
	public class Estoque {
		//private int codigosProdutos[] = new int[10];
		public ArrayList <Integer> codigoProdutos = new ArrayList<Integer>();
		//private int produtosEstoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		public ArrayList <Integer> produtosEstoque = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
		//private String nomeProdutos[] = {"Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"};
		public ArrayList <String> nomeProdutos = new ArrayList<String>(Arrays.asList("Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"));
		//private double valorProdutos[] = {4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29};
		public ArrayList <Double> valorProdutos = new ArrayList<Double>(Arrays.asList(4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29));
		public ArrayList <String> itensCarrinho = new ArrayList<String>();
		public ArrayList <Integer> qtdeCarrinho = new ArrayList<Integer>();
		public ArrayList <Double> precoCarrinho = new ArrayList<Double>();
		public Estoque(ArrayList<Integer> codigoProdutos, ArrayList<Integer> produtosEstoque,
				ArrayList<String> nomeProdutos, ArrayList<Double> valorProdutos) {
			super();
			this.codigoProdutos = codigoProdutos;
			this.produtosEstoque = produtosEstoque;
			this.nomeProdutos = nomeProdutos;
			this.valorProdutos = valorProdutos;
		}
		public void consumirProdutos(int codigoProdutos, int qtdeConsumir) {
			System.out.printf("\n%d un. de %s adicionado com sucesso no carrinho!\n\n", qtdeConsumir, nomeProdutos.get(codigoProdutos - 1));
			//alreadyCart[produtoSelecionado - 1] = true; -> vamos substituir esse codigo e passar a utiliza o metodo .contais das ListArrays.
			this.itensCarrinho.add(nomeProdutos.get(codigoProdutos - 1));//itensCarrinho[Itens] = nomeProdutos[produtoSelecionado - 1];
			this.qtdeCarrinho.add(qtdeConsumir);//qtdeCarrinho[Itens] = qtdeConsumir;	
			this.precoCarrinho.add(valorProdutos.get(codigoProdutos - 1));//precoCarrinho[Itens] = valorProdutos[produtoSelecionado - 1];
			this.produtosEstoque.set(codigoProdutos - 1, produtosEstoque.get(codigoProdutos - 1) - qtdeConsumir);
			//produtosEstoque.get(codigo) -= qtdeCarrinho.get(codigo)
			//produtosEstoque[produtoSelecionado -1] -= qtdeCarrinho[Itens];
			//Itens++;
		}
	}


}
