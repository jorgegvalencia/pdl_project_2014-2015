package global.token;

public class Cadena implements Token {
	private String cadena;

	
	public Cadena(String cad){
		this.cadena = cad;
	}
	@Override
	public String aString() {
		return "<" + this.toString() + "," + "\"" + cadena + "\"" + ">";
	}

}