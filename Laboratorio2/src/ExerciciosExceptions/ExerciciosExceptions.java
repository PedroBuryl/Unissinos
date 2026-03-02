package exericios_exceptions;

public class ExerciciosExceptions {
	
	private double temperatura;
	
	public ExerciciosExceptions() {
		this.temperatura = 20;
	}
	public double getTemperatura() {
		return temperatura;
	}
	/*Exercício 1: Altere os métodos abaixo para que uma exceção do tipo IllegalArgumentException seja 
	 lançada e tratada quando o valor for inválido. IllegalArgumentException é uma Runtime Exception 
	 do Java e indica que o método "não gostou" do que foi passado.

	public void aumentaTemperatura(double tempMais){
     	this.temperatura += tempMais;
	}
	public void diminuiTemperatura(double tempMenos){
     	this.temperatura -= tempMenos;
	}*/
	public void aumentaTemperatura(double tempMais){
	    try {
	    	this.temperatura += tempMais;
	    	if(temperatura < 16 || temperatura > 32) {
	    		throw new IllegalArgumentException();
	    	}
		} catch (IllegalArgumentException e) {
			this.temperatura -= tempMais;
			System.out.println("ERRO!!! Temperatura inválida! A temperatura foi mantida em "+ this.temperatura + " graus");
		}
		
	}
	public void diminuiTemperatura(double tempMenos){
		try {
	    	this.temperatura -= tempMenos;
	    	if(temperatura < 16 || temperatura > 32) {
	    		throw new IllegalArgumentException();
	    	}
		} catch (IllegalArgumentException e) {
			this.temperatura += tempMenos;
			System.out.println("ERRO!!! Temperatura inválida! A temperatura foi mantida em "+ this.temperatura + " graus");
		}
	}
	/*Exercício 3: Altere os métodos do Exercício 1 para que a exceção seja lançada mas não seja tratada dentro do método.*/
	public void aumentaTemperatura2(double tempMais) throws IllegalArgumentException{
		this.temperatura += tempMais;
		if (temperatura < 16 || temperatura > 32) {
			this.temperatura -= tempMais;
			throw new IllegalArgumentException();
		}
	}
	public void diminuiTemperatura2(double tempMenos) throws IllegalArgumentException{
		this.temperatura -= tempMenos;
		if (this.temperatura < 16 || this.temperatura > 32) {
			this.temperatura += tempMenos;
			throw new IllegalArgumentException();
		}
	}
}
