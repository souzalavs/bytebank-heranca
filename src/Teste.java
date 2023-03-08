
public class Teste {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Lavínia");
		g1.setSenha(1111);
		g1.setCpf("11111111");
		g1.setSalario(5000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Camila");
		ev1.setCpf("22222222");
		ev1.setSalario(3000);
		
		Administrador a1 = new Administrador();
		a1.setNome("Yves");
		a1.setSenha(2222);
		a1.setCpf("3333333");
		a1.setSalario(4000);
		
		Cliente c1 = new Cliente();
		c1.setSenha(3333);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(ev1);
		cb.registra(a1);
		
		System.out.println("A gerente " + g1.getNome() +" cujo cpf é " + g1.getCpf() + ", possui uma bonificação de " + g1.getBonificacao() +
				" reais. Seu acesso ao sistema interno é: " + g1.autentica(1111)); 
		
		System.out.println("A editora de vídeo " + ev1.getNome() +" cujo cpf é " + ev1.getCpf() + ", possui uma bonificação de " 
				+ ev1.getBonificacao() + " reais."); 
		
		System.out.println("O administrador " + a1.getNome() +" cujo cpf é " + a1.getCpf() + ", possui uma bonificação de " + a1.getBonificacao() +
				" reais. Seu acesso ao sistema interno é: " + a1.autentica(1111)); 
		System.out.println("O administrador " + a1.getNome() +" cujo cpf é " + a1.getCpf() + ", possui uma bonificação de " + a1.getBonificacao() +
				" reais. Seu acesso ao sistema interno é: " + a1.autentica(2222)); 
		
		System.out.println("O acesso do cliente ao sistema é " + c1.autentica(3333)); 
		
		System.out.println("A soma das bonificações até o momento é R$" + cb.getSoma());
	}
}
