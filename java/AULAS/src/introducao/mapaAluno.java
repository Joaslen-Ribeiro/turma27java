package introducao;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
public class mapaAluno {
	public static void main(String[] args) {
		
		Map<String,Aluno> mapa=new TreeMap<String,Aluno>();
		
		Aluno a=new Aluno("Joao silva ", "Java ",6.8);
		Aluno b=new Aluno("Maria Souza ", "Linux ",7.8);
		Aluno c=new Aluno("Renata Almeida ", "So ",8.8);		
		Aluno d=new Aluno("Jos� Nascimento ", "Internet ",5.5);
		
		mapa.put("Joao silva ", a);
		mapa.put(" Maria Souza ", b);
		mapa.put("Renata Almeida ", c);
		mapa.put("Jos� Nascimento ", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida "));
		
		Collection<Aluno> alunos= mapa.values();
		
		for(Aluno e:alunos)
		{
		 System.out.println(e);	
		}	
	}
		


}