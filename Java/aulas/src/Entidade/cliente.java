	package Entidade;

import java.util.Scanner;

// 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

		
	
public class cliente {
	Scanner leia = new Scanner(System.in);

		
		public String nome;
		public String sobrenome;
		public char genero;
		public int anoNascimento;

		public cliente (String nome) {
			this.nome = nome;
		}
		
		public cliente(String nome, String sobrenome) {
			this.nome= "Jenifer";
			this.sobrenome="Placido";
		}
		public void idade() {
			this.anoNascimento = 1990;
			System.out.println(2020-this.anoNascimento);

			
	
}
}
