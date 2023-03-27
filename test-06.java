public class Test {
	public static void main(String [] args) {
		//Switch e Case
		int vida = 100;
		
		switch(vida)
		{
		case 90: 
			// Exeecute alguma ação aqui!
			System.out.println("Quero que meu personagem corra mais rápido");
			break;
		case 30: 
			System.out.println("Minha vida é igual a 30!");
			break;
		default:
			System.out.println("nenhuma condição bateu!Eu tenho 100 de vida!");
			break;
		}
}
}
