
public class Administrador extends Funcionario implements Autenticavel	{
	
	private Autentica autenticador;
	
	public Administrador() {
		this.autenticador = new Autentica();
	}
	
	public double getBonificacao() {
		return super.getSalario() * 0.5;
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
