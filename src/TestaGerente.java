
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Anna Carolina");
		g1.setCpf("13460622776");
		g1.setSalario(3500.0);
		
		System.out.println("Nome do Gerente: " + g1.getNome());
		System.out.println("CPF do Gerente: " + g1.getCpf());
		System.out.println("Salário do Gerente: " + g1.getSalario());
		System.out.println("Bonificação do Gerente: " + g1.getBonificacao());
		
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		System.out.println(autenticou);
		

	}

}
