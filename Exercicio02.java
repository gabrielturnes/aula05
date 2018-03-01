import java.util.Scanner;
public class Exercicio02{

	public static void main(String args[]){
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero:");
		int i = teclado.nextInt();
		System.out.println("Insira outro numero:");
		int x = teclado.nextInt();

		int soma = x + i;

		System.out.println("Soma = " + soma);
	
	}




}
