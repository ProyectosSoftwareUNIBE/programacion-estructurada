package falconi.rafael;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double altura, radio;
		Scanner scanner = new Scanner(System.in);
		System.out.print("radio:");
		radio = scanner.nextDouble();
		System.out.print("altura:");
		altura = scanner.nextDouble();
		scanner.close();
		double area = Math.PI * radio * radio;
		double elevado = Math.pow(radio, 2);
		double volumen = (Math.PI * elevado * altura) / 3;
		System.out.print("area:" + area + "m2");
		System.out.print("\n");
		System.out.print("volumen:" + volumen + "m3");

	}

}
