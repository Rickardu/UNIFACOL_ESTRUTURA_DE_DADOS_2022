package arvorebinaria;
public abstract class ArvoreBinaria<Entidade> {
	Entidade informacao;
	public ArvoreBinaria raiz;
	public ArvoreBinaria noEsquedo;
	public ArvoreBinaria noDireito;
	public abstract ArvoreBinaria insert(ArvoreBinaria arvore,  ArvoreBinaria arvoreNova);
}
