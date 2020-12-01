package Classes;

public class Funcionario {
     private String cod;
     private double horas;
     private double valorHoras;
	
     
     private Funcionario(String cod) {
		super();
		this.cod = cod;
		
		
		}


	private String getCod() {
		return cod;
	}


	private void setCod(String cod) {
		this.cod = cod;
	}


	private double getHoras() {
		return horas;
	}


	private void setHoras(double horas) {
		this.horas = horas;
	}


	private double getValorHoras() {
		return valorHoras;
	}


	private void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
     
     
	
}
