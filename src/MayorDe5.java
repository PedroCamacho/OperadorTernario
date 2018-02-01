
public class MayorDe5 {

	public static void main(String[] args) {
		// Inicialización
		int num1 = 100, num2 = 200, num3 = 300, num4 = 40, num5 = 5;
		int mayor = num1;

		// Proceso
		mayor = mayor < num2 ? num2 : mayor;
		mayor = mayor < num3 ? num3 : mayor;
		mayor = mayor < num4 ? num4 : mayor;
		mayor = mayor < num5 ? num5 : mayor;

		// Salida
		System.out.println("El mayor de los 5 números es: " + mayor);

	}

}
