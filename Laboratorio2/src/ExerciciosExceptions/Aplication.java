package exericios_exceptions;

import java.util.Scanner;

public class Aplication {
	/*Exercício 2: Como ficaria o método main para chamar os dois métodos do Exercício 1?*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExerciciosExceptions ar = new ExerciciosExceptions();
		
		System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
		System.out.println("1-Aumentar temperatura");
		System.out.println("2-Diminuir temperatura");
		int opc = sc.nextInt();
		while (opc != 1 && opc != 2) {
			System.out.println("Opção inválida!!!");
			System.out.println();
			System.out.println("1-Aumentar temperatura");
			System.out.println("2-Diminuir temperatura");
			opc = sc.nextInt();
		}
		double temp;
		switch (opc) {
		case 1:
			System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
			System.out.print("Aumentar em quantos graus? ");
			temp = sc.nextDouble();
			ar.aumentaTemperatura(temp);
			break;
		case 2:
			System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
			System.out.print("Diminuir em quantos graus? ");
			temp = sc.nextDouble();
			ar.diminuiTemperatura(temp);
			break;
		}
		
		
		/*Exercício 4: Como ficaria o método main para chamar os métodos com a alteração do Exercício 3?*/
		
		System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
		System.out.println("1-Aumentar temperatura");
		System.out.println("2-Diminuir temperatura");
		opc = sc.nextInt();
		while (opc != 1 && opc != 2) {
			System.out.println("Opção inválida!!!");
			System.out.println();
			System.out.println("1-Aumentar temperatura");
			System.out.println("2-Diminuir temperatura");
			opc = sc.nextInt();
		}
		
		switch (opc) {
		case 1:
			System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
			System.out.print("Aumentar em quantos graus? ");
			try {
				temp = sc.nextDouble();
				ar.aumentaTemperatura2(temp);
			}catch (IllegalArgumentException e) {
				System.out.println("ERRO!!! Temperatura inválida! A temperatura foi mantida em "+ ar.getTemperatura() + " graus");
			}
			break;
		case 2:
			System.out.println("Temperatura atual "+ ar.getTemperatura() +" graus.");
			System.out.print("Diminuir em quantos graus? ");
			try {
				temp = sc.nextDouble();
				ar.diminuiTemperatura2(temp);
			}catch (IllegalArgumentException e) {
				System.out.println("ERRO!!! Temperatura inválida! A temperatura foi mantida em "+ ar.getTemperatura() + " graus");
			}
			break;
		}
		
		sc.close();
	}
}
