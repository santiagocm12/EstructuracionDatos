package co.edu.unbosque.model;

public class Dados {
	private int number1;
	private int number2;
	private int total;
	private boolean par;

	public Dados() {

//		NumPar();
//		resultadoDados();
	}

	public boolean resultadoDados() {

		boolean resultado = false;
		
		this.number1 = (int) Math.floor(Math.random() * 6 + 1);
		;
		this.number2 = (int) Math.floor(Math.random() * 6 + 1);
		;
		this.total = number1 + number2;
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("Total de los dados es: " + total);

		if (NumPar() == false) {
			resultado=false;

		} else if (NumPar() == true) {
			resultado=true;

		}
		
		return resultado;

	}
	
	public int ValorDados() {
		this.total = number1+number2;
		return total;
	}

	public boolean NumPar() {
		if (number1 == number2) {
			par = true;
			return par;
		} else {
			par = false;
			return par;

		}
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isPar() {
		return par;
	}

	public void setPar(boolean par) {
		this.par = par;
	}

}
