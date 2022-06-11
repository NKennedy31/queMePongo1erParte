package dominio;

public class TipoPrenda {
	Categoria categoria;
	
	public TipoPrenda(Categoria categoria) {
			this.categoria = categoria;
	}
	
	final TipoPrenda ZAPATOS = new TipoPrenda(Categoria.CALZADO);
	final TipoPrenda CAMISA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
	final TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR);
	final TipoPrenda RELOJ = new TipoPrenda(Categoria.ACCESORIO);
	
}
