package Classes;


	public class contaPoupanca  extends Conta
	{
		
		public contaPoupanca(int numeroConta, String cpf_cnpj) {
			super(numeroConta, cpf_cnpj);
			// TODO Auto-generated constructor stub
		}


		private int dataAniversario;
		
		public void dataAniversario(int aniversario){ 
			this.aniversario = aniversario; 
			}
		
		
		public void ContaPoupanca(int numeroConta, int dataAniversario) {
			super(numeroConta);
			this.dataAniversario = dataAniversario;
		}
		
		public void ContaPoupanca(int numeroConta, String cpf_cnpj, int dataAniversario) {
			super(numeroConta, cpf_cnpj);
			this.dataAniversario = dataAniversario;
		}
		
		public int getDataAniversario() {
			return dataAniversario;
		}
		public void setDataAniversario(int dataAniversario) {
			this.dataAniversario = dataAniversario;
		}
		
		
		public void correcao(int data) {
			double novosaldo = 0.0;
			
			if (super.getSaldo()>0 && data == this.dataAniversario)
			{
				novosaldo = (super.getSaldo()*0.005); 	
				super.credito(novosaldo);
			}
			
		
		
		
		
		
		
		
	}
	






}
