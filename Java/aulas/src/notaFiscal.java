
public class notaFiscal {



	private String imposto;
	private double formaPagamento;
	private double valorTributario;
	private int carrinho;
	
	
	char respostaFinal;
	int itensCarrinho;
	int qtdeCarrinho;
	double precoCarrinho;
	double totalComprasCar;
	
	
	public notaFiscal() {
		super();
	}
	public notaFiscal(String imposto, double formaPagamento, double valorTributario, int carrinho) {
		this.imposto = imposto;
		this.formaPagamento = formaPagamento;
		this.valorTributario = valorTributario;
		this.carrinho = carrinho;
	}
	public String getImposto() {
		return imposto;
	}
	public void setImposto(String imposto) {
		this.imposto = imposto;
	}
	public double getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(double formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public double getValorTributario() {
		return valorTributario;
	}
	public void setValorTributario(double valorTributario) {
		this.valorTributario = valorTributario;
	}
	public int getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(int carrinho) {
		this.carrinho = carrinho;
	}
	
	
	
	
	
	
}