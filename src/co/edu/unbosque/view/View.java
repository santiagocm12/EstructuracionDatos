package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {

	public int quantityPlayers() {

		System.out.println("¿Cuantos participantes jugaran?");
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();

		return quantity;

	}

	public void showResults(String dato) {
		System.out.println(dato);

	}

//	
	public int chooseColour(String dato) {
		System.out.println(dato);

		Scanner sc = new Scanner(System.in);
		int colour = sc.nextInt();
		return colour;
	}
//	
//	public int pedirDatoEntero() {
//		int numero = 0;
//		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Nùmero:"));
//		return numero;
//	}
}
