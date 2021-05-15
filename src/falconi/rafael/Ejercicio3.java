package falconi.rafael;

// menor < | menor o igual <= | >mayor | >= mayor o igual| ==igual | !=

// todo lo anterior solo sirve para numeros
// para preguntar si un boolean es falso se aumenta el simbolo ! y si es
// berdadero solo se ingresa el nombre del booleano
// con el equals yo pregunto si un string es igual a otro
// la condición o || mientras que la condición y &&

public class Ejercicio3 {

	public static void main(String[] args) {
		int number1, number2, number3,number4;
		number1 = 10;
		number2 = 10;
		number3 = 3;
		number4=11;
		boolean flag = true;
		String name = "rafael";
		String lastName = "falconi";

		if (number1 == number2 && number1 % number3 == 0) {
			System.out.println("se cumplio la primera condicion");
		} else if (!flag) {
			System.out.println("se cumplio la segunda condicion");
		} else {
			System.out.println("no se cumplio ninguna condicion");
		}
		
		for (int iterador = 1; iterador < 5; iterador++) {
			System.out.println(iterador);
		}
		System.out.println("\n");
		while (number4 < number1) {
			System.out.println(number3);
			number3 += 2;
		}
		System.out.println("\n");
		do {
			System.out.println(number4);
			number4 ++;
		}while(number4<number1);

	}

}
