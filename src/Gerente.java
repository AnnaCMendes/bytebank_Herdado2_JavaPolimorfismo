
// Gerente é um funcionário, Gerente Herda a classe funcionário
public class Gerente extends Funcionario{
	

		private int senha;
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public boolean autentica(int senha) {
			if(this.senha == senha){
				return true;
			} else {
				return false;
			}
		}
		
		public Gerente() {
			
		}
		
		public double getBonificacao() {
			System.out.println("Chamando o método de bonificação do Gerente");
			return super.getSalario();
		}
		

		
		
	
}
