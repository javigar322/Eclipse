package unico;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("cuantas lineas tiene");
		int num = teclado.nextInt();
		int contador = num;

		for (int i = 0; i < num; i++) {	
			for (int j = 0; j < contador; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			contador--;
		}

	}
}


