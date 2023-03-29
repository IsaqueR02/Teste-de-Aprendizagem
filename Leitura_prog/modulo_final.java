package programa_leitura;

import java.util.Random;//biblioteca aleatoria
import java.util.Scanner;//biblioteca de Analise

public class modulo_1 {
	//Programa de leitura
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo! Insira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a) "+nome);
		System.out.println("Você deseja avançar para qual direção? (w,s,a,d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Você está indo para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?\n"+
					"x) atacar\n"/*Após escrever terminar com \n para dar paragrafo*/ + 
					"c) correr");
			comando = in.nextLine();
			
			if(comando.equals("x"))/*chamando uma tecla de teclado */ {
				if(rand.nextInt(100) < 75) {
					System.out.println("Você ganhou o jogo!");
				}else {
					System.out.println("Você perdeu o jogo!");
				}
				
			}else {
				System.out.println("Você correu! O jogo terminou");
			}
		}else if(comando.equals("s")){
			System.out.println("Você está entrando em outro mapa...");
			//*Faça seu proprio jogo em base de leitura*/
		}
	}
}
