public class Test {
	public static void main(String [] args) {
		//Condições
		int vida = 100;
		//vida = 90; Caso fosse esse numero*
		if(vida == 100) {
			vida+=100;
		System.out.println("Minha vida é igual a 100!");
	}else {//viria para esse resultado*
		System.out.println("Minha vida não é igual a 100");
	}
		
		String nome = "Guilherme";
		//nome = "Joao";
		//nome = "Felipe";
		if(nome == "Guilherme") {
		System.out.println("Seu nome é "+ nome);
	}else if(nome == "Joao") {
		System.out.println("Seu nome não é Guilherme, é "+ nome);
	 }else if(nome == "Felipe") {
		 System.out.println("Seu nome não é Guilherme ou João, é "+ nome);
	 }
}
}
