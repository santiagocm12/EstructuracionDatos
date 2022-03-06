package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Parchis {

	private ArrayList<Player> arrayPlayer = new ArrayList<Player>();

	public Parchis() {

	}

	public Parchis(ArrayList<Player> player) {
		super();
		this.arrayPlayer = player;
	}

	public Player createObjectPlayer(String colour, int countingDice) {

		Player objectPlayer = new Player();

		objectPlayer.setColour(colour);
		objectPlayer.setCountingDice(countingDice);

		return objectPlayer;
	}

	public String addPlayer(Player addplayer) {

		arrayPlayer.add(addplayer);

		return "Se agregó correctamente la ficha.";
	}

	public String mostrarJugador() {

		String lista = "Se ha(n) creado " + this.arrayPlayer.size() + " jugador(es) \n";
		lista = lista + "";

		for (int i = 0; i < this.arrayPlayer.size(); i++) {
			lista = lista + "Jugador: " + (i + 1) +  "  -  Color: " + this.arrayPlayer.get(i).getColour()
					+ "         " + this.arrayPlayer.get(i).getCountingDice() + "\n";
		}

		return lista;

	}

	public ArrayList<Player> getPlayer() {
		return arrayPlayer;
	}

	public void setPlayer(ArrayList<Player> player) {
		this.arrayPlayer = player;
	}

}
