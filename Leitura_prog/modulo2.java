public class modulo_2 {
	//Programa de leitura
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome, idade, peso, cidade, estado, pais;
		System.out.println("Por favor digite seu nome");
		nome = in.nextLine();
		System.out.println("Por favor digite seu idade");
		idade = in.nextLine();
		System.out.println("Por favor digite seu peso");
		peso = in.nextLine();
		System.out.println("Por favor digite seu cidade");
		cidade = in.nextLine();
		System.out.println("Por favor digite seu estado");
		estado = in.nextLine();
		System.out.println("Por favor digite seu país");
		pais = in.nextLine();
		//Gerando resultado final
		System.out.println("------------------------");
		System.out.println("Aqui é resultado final do teste:");
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Peso: "+ peso);
		System.out.println("Cidade: "+ cidade);
		System.out.println("Estado: "+ estado);
		System.out.println("País: "+ pais);
	}
