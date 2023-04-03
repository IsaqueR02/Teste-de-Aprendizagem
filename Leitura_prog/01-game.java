package programa_leitura;

import java.util.Random;//biblioteca aleatoria
import java.util.Scanner;//biblioteca de Analise

public class modulo_1 {
	//Programa de leitura
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		
		System.out.println("O jogo começou");
		System.out.println("-------------------");
		System.out.println("Para começarmos a jornada insira seu nome: ");
		nome = in.nextLine();
		System.out.println("Você deseja avançar para qual direção? (w,s,a,d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Você está indo para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?\n"+
					"x) atacar\n"/*Após escrever terminar com \n para dar paragrafo*/ + 
					"c) correr");
			comando = in.nextLine();
			
			if(comando.equals("x"))/*chamando uma tecla de teclado */ {
				if(rand.nextInt(100) < 60) {
					System.out.println("Você ganhou o jogo!");
				}else {
					System.out.println("Você perdeu o jogo!");
				}
				
			}else {
				System.out.println("Você correu! O jogo terminou");
			}
		}else if(comando.equals("s")){
			System.out.println("Você está entrando em outro mapa...");
			System.out.println("Você encontrou a sala secreta!! Tem uma chave.\n"+ "Quer pegar a chave?\n"+"x) Sim\n"+"z) Não");
			comando = in.nextLine();
			if(comando.equals("x")) {
				System.out.println("Você pegou a chave.");
				comando = in.nextLine();
				if(comando.equals("w")) {
					System.out.println("Você voltou a sala principal.");
				}if(comando.equals("w")) {
					System.out.println("Um inimigo surgiu, o que deseja fazer?\n"+ 
				"x) atacar\n"+
				"c) correr\n");
						comando = in.nextLine();
				
				if(comando.equals("x"))/*chamando uma tecla de teclado */ {
					if(rand.nextInt(100) < 70) {
						System.out.println("Você venceu!\n");
						comando = in.nextLine();
					}else{
						System.out.println("O jogo terminou");
					}
						if(comando.equals("w")) {

							System.out.println("Tem uma porta a frente, quer usar a chave?\n"+ "x) Sim\n"+"z) Não\n");
							comando = in.nextLine();
							if(comando.equals("x")) {
								System.out.println("A porta abriu, você encontrou o Báu secreto.");
									System.out.println("Um Boss apareceu!!");
									System.out.println("O que deseja fazer\n"+"x) atacar\n"+"c) correr\n");
								comando = in.nextLine();
								if(comando.equals("x")) {
									if(rand.nextInt(100) < 85) {
										System.out.println("Você venceu!\n");
										System.out.println("Você pegou a chave do Báu secreto.");
										System.out.println("Quer abrir?"+ "x) Sim\n"+ "z) Não\n");
										comando = in.nextLine();
										if(comando.equals("x")) {
											System.out.println("Você encontrou uma Carta.");
											System.out.println("Ela diz 'Parabéns "+nome+" você concluiu o jogo'.");
										}
									}else {
										System.out.println("Você perdeu o jogo!");
									}
								
							}
					
						}
					}else {
						System.out.println("Você perdeu o jogo!");
					}
			}
				
			}else {
				System.out.println("Você não pegou a chave.");
				if(comando.equals("w")) {
					System.out.println("Você voltou a sala principal.");
				}if(comando.equals("w")) {
					System.out.println("Um inimigo surgiu, o que deseja fazer?\n"+ 
				"x) atacar\n"+
				"c) correr\n");
				}comando = in.nextLine();
				
				if(comando.equals("x"))/*chamando uma tecla de teclado */ {
					if(rand.nextInt(100) < 70) {
						System.out.println("Você venceu!\n");
					}else {
						System.out.println("Você perdeu o jogo!");
					}
				}
			}
			}
		}
	}
}
