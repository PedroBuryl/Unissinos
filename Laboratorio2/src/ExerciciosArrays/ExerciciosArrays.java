package exericios_arrays;
//Crie uma classe ExerciciosArrays e implemente os metodos dos exercicios 1 à 11

import java.util.Scanner;
public class ExerciciosArrays {
	/*Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo: 
	 
		0 1 2 3 4 5 6 7 8 9      
		0 1 2 3 4 5 6 7 8 9  
		0 1 2 3 4 5 6 7 8 9*/ 
	public int[][] exercicio1a() {
		int array[][] = new int [3][10];
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				array[i][j] = j;
			}	
		}return array;
	}
	/*Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo: 

		0 1 4 9 16 25 36 49 64 81      
		0 1 4 9 16 25 36 49 64 81  
		0 1 4 9 16 25 36 49 64 81     
		0 1 4 9 16 25 36 49 64 81  
		0 1 4 9 16 25 36 49 64 81 */ 
	public int[][] exercicio1b() {
		int array[][] = new int [5][10];
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				array[i][j] = j*j;
			}
		}return array;
	}
	/*Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo: 

		0 0 0 0 0 0      
		1 1 1 1 1 1   
		2 2 2 2 2 2   
		3 3 3 3 3 3  
		4 4 4 4 4 4   
		5 5 5 5 5 5 */ 
	public int[][] exercicio1c() {
		int array[][] = new int [6][6];
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				array[i][j] = i;
			}
		}return array;
	}
	/*Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo: 
		-1 -1 -1 -1 -1 -1       
		 0   0  0  0  0  0  
		 -1 -1 -1 -1 -1 -1  
		 0   0  0  0  0  0  
		 -1 -1 -1 -1 -1 -1      
		 0   0  0  0  0  0  
		 -1 -1 -1 -1 -1 -1       
		 0   0  0  0  0  0  
		 -1 -1 -1 -1 -1 -1*/ 
	public int[][] exercicio1d() {
		int array[][] = new int [9][6];
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				if(i % 2 == 0) {
					array[i][j] = -1;
				}else {
					array[i][j] = 0;
				}
			}
		}return array;
	}
	/*Crie um método que retorna uma matriz de inteiros com números aleatórios positivos 
	  menores que 100. O tamanho da matriz deve ser solicitado pelo teclado dentro do método.*/ 
	public int[][] exercicio2() {
		/*optei por nao utilizar a classe Random para implementar este metodo
		  essa classe vai gerar numeros pseudoaleatorios com base numa expressao aritmetica
		  muito comum para esse caso x=(a*x+b)mod max*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique o tamanho da matriz (linha, coluna): ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		int array[][] = new int[l][c];
		int x = l*c; //numero ref para a geração pseudoaleatoria 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]= (l*x+c) % 100; //gera um numero pseudoaelatorio menor que 100
				x = array[i][j];//atualiza o num ref para o proximo loop
			}
		}sc.close();
		return array;
		/*for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					array[i][j] = (int)(Math.random()*100);*/
	}
	/* Escreva um método que leia 10 valores double do teclado e armazene-os em uma 
	matriz de dimensões 2x5. Seu método deve retornar esta matriz*/
	public double[][] exercicio3() {
		Scanner sc = new Scanner (System.in);
		double[][] array = new double[2][5];
		System.out.println("Digite 10 números: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextDouble();
			}
		}sc.close();
		return array;
	}
	/* Crie um método que recebe um array bidimensional de double e retorna a quantidade 
	de elementos deste array.*/
	public int exercicio4_e_5(double[][] array) {
		return array.length * array[0].length;
	}
	/* Crie um método que recebe uma matriz de double e retorna um String de saída 
	para ela, com seus valores separados por um hífen, mas mantendo o formato da matriz.*/
	public String exercicio6(int[][] array) {
		String format = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				format += j == array[i].length -1 ? array[i][j] + "\n" : array[i][j] + " - ";
			}
		}return format;
	}
	/*Crie um método que recebe uma matriz de double e retorna o maior valor da matriz.*/
	public double exercicio7(double[][] array) {
		double maior = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maior) {
					maior = array[i][j];
				}
			}
		}return maior;
	}
	/*Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os 
	elementos da matriz.*/
	public int exercicio8(int[][] array) {
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				soma+= array[i][j];
			}
		}return soma;
	}
	/* Crie um método que recebe um array bidimensional de double e retorna a média dos 
	valores deste array. */
	public double exercicio9(double[][] array) {
		double somaElementos = 0;
		int quantElementos = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				somaElementos += array[i][j];
				quantElementos++;
			}
		}return somaElementos/quantElementos;
	}
	/* Crie um método que devolve uma matriz de caracteres lidos do teclado. O número de 
	linhas da matriz deve ser aleatório, entre 1 e 5, enquanto o número de colunas deve ser também 
	aleatório, porém, entre 1 e 3.*/
	public char[][] exercicio10(){
		Scanner sc = new Scanner(System.in);
		
		int linhas = (int)(Math.random()*5+1);
		int colunas = (int)(Math.random()*3+1);
		
		char[][] array = new char[linhas][colunas];
		
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++){
				System.out.println("Digite o proximo valor: ");
				array[i][j] = sc.next().charAt(0);
			}
		sc.close();
		return array;
	}
	/* Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional 
	que contém apenas os elementos positivos desta matriz.*/
	public int[] exercicio11(int[][] array) {
		int tamArray = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] >=0 ) {
					tamArray++;
				}
			}
		}
		int[] positivos = new int[tamArray];
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] >=0 ) {
					positivos[c] = array[i][j];
					c++;
				}
			}
		}return positivos;
	}
}
