package listasencadeadas.operacoes;

public class MainListaSimplesPessoa {
	
	public static void imprimir(ListaSimplesPessoa lista) {
		System.out.println("----------------------------------------------------");
		while(lista!=null) {
			System.out.println("Nome:"+lista.informacao.nome);
			lista=lista.next();
		}
	}
	public static void main(String[] args) {
		ListaSimplesPessoa lsp=new ListaSimplesPessoa();
		lsp.informacao = new Pessoa("A","1");
		
		ListaSimplesPessoa lsp1=new ListaSimplesPessoa();
		lsp1.informacao = new Pessoa("B","2");
		
		ListaSimplesPessoa lsp2=new ListaSimplesPessoa();
		lsp2.informacao = new Pessoa("d","3");
		
		//ADD
		lsp.add(lsp, lsp1);
		lsp.add(lsp, lsp2);
		//NEXT
		imprimir(lsp);
		ListaSimplesPessoa lsp3=new ListaSimplesPessoa();
		lsp3.informacao = new Pessoa("c","4");
		//INSERT
		lsp.insert(lsp, lsp1, lsp3);		
		imprimir(lsp);
		//DELETE
		lsp.delete(lsp, lsp1.informacao);
		imprimir(lsp);
		//INFO
		System.out.println("Nome:"+lsp.info().nome);
	}

}
