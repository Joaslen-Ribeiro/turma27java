package OBJETOS;

public class Testepessoa1 {
	 public static void main (String args[]) {
		 
		 Pessoa1 jessica = new Pessoa1(" Jessica ",555);
		 Funcionarioo pedro = new Funcionarioo("Pedro ",222," TI ");
		 Pessoa1 maria = new Funcionarioo ("Maria ", 333, "Informatica-Desenvolvimento ");
		 Pessoa1 jose = new Coordenador("Jose ",444, "CC" );
		 
		 
		 System.out.println(jessica.getNome());
		 System.out.println(pedro.getDepartamento());;
	     System.out.println(maria.getMatricula());
	     System.out.println(jose.getNome());
	 }
}