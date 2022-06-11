package dominio;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color primario;
	
	public Prenda(TipoPrenda tipo, Material material, Color primario) {
		this.tipo = Objects.requireNonNull(tipo, "tipo de prenda es obligatorio");
		this.material = Objects.requireNonNull(material, "material es obligatorio");
		this.primario = Objects.requireNonNull(primario, "color primario es obligatorio");
	}

	public Categoria getCategoria(TipoPrenda tipo) {
		return tipo.categoria;
	}
}
