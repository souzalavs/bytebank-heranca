
public class ControleBonificacao {
	
	public double soma;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}
