package OBJETOS;

public class exemplopessoa{
	private String primeiroNome;
	private String ultimoNome;
	private String nomesMeio;
	
	public exemplopessoa (String primeiro,String meio, String ultimo )
	{
		primeiroNome=primeiro;
		ultimoNome= ultimo;
		nomesMeio= meio;
	}
	public String getNomeCompleto()
	{
		String nomeCompleto=primeiroNome+" "+nomesMeio+" "+ultimoNome;
		return nomeCompleto;
}}
