package Entidade;

import java.util.Scanner;

// 4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida 
//crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class funcionario {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	}
		
		public String nome;
		public String sobrenome;
		public char genero;
		public int idade;
		public String setor;
		public double salario;
		

		public funcionario() {
			
		}	
		
	public funcionario(String nome) {
			
			this.nome = nome;
		}

		
		public funcionario(String nome, String sobrenome,char genero, int idade, String setor, double salario){
			this.nome= "Jenifer";
			this.sobrenome="Placido";
			this.genero = 'F';
			this.idade = 30;
			this.setor = "TI";
			this.salario = 5000;
			
		
		
	
}


		


	}


