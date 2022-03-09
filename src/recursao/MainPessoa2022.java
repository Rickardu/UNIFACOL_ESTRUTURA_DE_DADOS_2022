package recursao;

public class MainPessoa2022 {
	 //teste
	public static void main(String[]args) {
		Pessoa p7=new Pessoa();
		p7.nome="Adao";
		p7.filhoA=null;
		p7.filhoB=null;
		p7.ancestral=null;
		
		
		Pessoa p0=new Pessoa();
		p0.nome="Cain";
		p0.filhoA=null;
		p0.filhoB=null;
		p0.ancestral=p7;
		
		p7.filhoA=p0;
		
		Pessoa p01=new Pessoa();
		p01.nome="Cain Filho";
		p01.filhoA=null;
		p01.filhoB=null;
		p01.ancestral=p0;
		
		p0.filhoA=p01;
		
		Pessoa p001=new Pessoa();
		p001.nome="Cain Neto";
		p001.filhoA=null;
		p001.filhoB=null;
		p001.ancestral=p01;
		
		p01.filhoA=p001;
		
		
		 
		
		
	}

}
