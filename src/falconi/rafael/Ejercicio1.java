package falconi.rafael;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String name;
		name = "Rafael Falconí";
		int age = 30;
		double high = 1.71;
		boolean active = false;
		System.out.println("Hola: " + name + " tu edad es:" + age + " tu altura es: " + high
				+ " tu estado en el sistema es: " + active);
		Scanner scanner = new Scanner(System.in);
		System.out.print("introdusca sus nombre:");
		String nameByConsole = scanner.nextLine();
		scanner.close();
		System.out.print("Hola: "+nameByConsole+"!");
	}

}
