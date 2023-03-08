
public class Gerente extends Funcionario implements Autenticavel {

	private Autentica autenticador;
	
	public Gerente() {
		this.autenticador = new Autentica();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
