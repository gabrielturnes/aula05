import java.util.Scanner;

public class Exercicio03{
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int i = teclado.nextInt();

		if(i%2 == 0){
			System.out.println("Par");
		}else{
			System.out.println("Impar");
		}
	}
}
