package Lista5;

import java.util.Scanner;

public class Exercicio3 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a=0, b=0, c=0, d=0; 
	    int i=0;
				   

		while(i>=0){
		System.out.println("\nDIGITE UM NUMERO:");
		i = leia.nextInt();
		if(i>=0 && i<=2){
			a=a +1;
		}else if (i>=26 && i<=50){
			b=b+1;
		}else if (i>51 && i<=75){
			c=c+1;
		}else if (i>76 && i<=100){
			d=d+1;
		}
		System.out.printf("\n[0, 25]= "+a);
		System.out.printf("\n[26, 50]= "+b);
		System.out.printf("\n[51, 75]= "+c);
		System.out.printf("\n[76, 100]= "+d);
		
		
		
		}
		
	}

}

