

public abstract class Funcionario {
	
		private String nome;
		private String Cpf;
		private double salario;
		
		public Funcionario() {
			
		}
		
		public abstract double getBonificacao();
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCpf() {
			return Cpf;
		}
		
		public void setCpf(String Cpf) {
			this.Cpf = Cpf;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
	
}
