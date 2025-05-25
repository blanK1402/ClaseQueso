package Utiles;
public class Utiles {
	public static boolean validarId(String id) {
		return id.matches("^[0-9]{5}$");
	}
}
