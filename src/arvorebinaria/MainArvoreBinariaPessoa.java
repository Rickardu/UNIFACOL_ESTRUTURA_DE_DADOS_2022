package arvorebinaria;

public class MainArvoreBinariaPessoa {
	public static void main(String[] args) {
		ArvoreBinariaPessoa arvoreBinariaX=new ArvoreBinariaPessoa();
		//--------------------------------------------------
		System.out.println(">>>raiz"+arvoreBinariaX.raiz);
		System.out.println(">>>noEsquerda"+arvoreBinariaX.noEsquedo);
		System.out.println(">>>noDireita"+arvoreBinariaX.noDireito);
		//--------------------------------------------------
		ArvoreBinariaPessoa raiz=new ArvoreBinariaPessoa(new Pessoa("A","A0001",22));
		ArvoreBinariaPessoa noEsquerda=new ArvoreBinariaPessoa(new Pessoa("B","B0001",18));
		ArvoreBinariaPessoa noDireita=new ArvoreBinariaPessoa(new Pessoa("C","C0001",38));
		//--------------------------------------------------
		
		
	}
}
