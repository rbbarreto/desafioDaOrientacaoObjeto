
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimiExtrato() {
		System.out.println("===  Extrato conta conrrete ====");
		super.imprimirInfosComuns();

	}
}
