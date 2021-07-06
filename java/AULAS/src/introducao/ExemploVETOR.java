package introducao;
 import java.util.Scanner;
public class ExemploVETOR {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
      
	//	String alunos[]=new String[4];//0...3
		String alunos[]= {"JOAO" , "MARCOS", "MARIA", "PEDRO"};
		int notas[]= new int[4];
		
		
		
		//alunos[0]="EPAMINONDAS";
		 
		//System.out.println(alunos.length);
		// System.out.println(alunos[2].toLowerCase());
		//System.out.println(alunos[3].toUpperCase());
		//for(int x=0; x<4;x++ ) {
			//System.out.println(alunos[x]);
		//}
        // for (int x=0; x<alunos.length;x++ ){
        	 //System.out.println(alunos[x]);
	//}
	
	/*for each*/// for(String x: alunos) {
		          // System.out.println(x);

		for (int x: notas) {
		System.out.println(x);
	
	}}
}