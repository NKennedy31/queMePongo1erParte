package dominio;

import excepciones.mismoColor;

public class Color {
 int rojo, verde, azul;
 
 public Color(int rojo, int verde, int azul) {
	 this.rojo = rojo;
	 this.verde = verde;
	 this.azul = azul;
 }
 
 public String secundario(Color color1,Color color2) throws mismoColor {
	 if(color1 == color2) {
		 throw new mismoColor("no existe color secundario");
	 }
	return "existe color secundario";
 }
}
