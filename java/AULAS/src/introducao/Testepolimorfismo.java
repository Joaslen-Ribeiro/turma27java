package introducao;

public class Testepolimorfismo {
	public static void main(String args[]) {
		
		PessoaFisica fisica= new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(12345678902l);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(1000100123468l);
		
		
		Pessoa1[] pessoas = new Pessoa1 [2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
	}
}
